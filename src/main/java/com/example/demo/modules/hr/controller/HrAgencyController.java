package com.example.demo.modules.hr.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.demo.common.utils.PageUtils;
import com.example.demo.common.utils.Query;
import com.example.demo.common.utils.R;
import com.example.demo.modules.bu.entity.BuImprestEntity;
import com.example.demo.modules.bu.entity.BuPayoffOneEntity;
import com.example.demo.modules.bu.service.BuImprestService;
import com.example.demo.modules.bu.service.BuPayoffOneService;
import com.example.demo.modules.hr.entity.HrAgencyContractEntity;
import com.example.demo.modules.hr.entity.HrAgencyEntity;
import com.example.demo.modules.hr.servcie.HrAgencyContractService;
import com.example.demo.modules.hr.servcie.HrAgencyService;
import com.example.demo.modules.sys.controller.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class HrAgencyController extends AbstractController {
    @Autowired
    private HrAgencyContractService hrAgencyContractService;
    @Autowired
    private BuPayoffOneService buPayoffOneService;
    @Autowired
    private BuImprestService buImprestService;
    @Autowired
    private HrAgencyService hrAgencyService;

    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        params.put("agencyIds", getUser().getAgencyIds());

        Query query = new Query(params);
        List<Map> list = hrAgencyService.queryList(query);
        int total = hrAgencyService.queryTotal(query);
        PageUtils page = new PageUtils(list, total, query.getCurrPage(), query.getLimit());
        return R.ok().put("page", page);
    }

    /**
     * 根据Id查询机构
     * @param id 机构ID
     * @return
     */
    @RequestMapping("info/{id}")
    public R info(@PathVariable("id") Integer id){
        return hrAgencyService.selectAgency(id);
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids) {
        for (Integer id : ids) {
            int count = hrAgencyContractService.selectCount(new EntityWrapper<HrAgencyContractEntity>().eq("agency_id", id));
            if (count > 0) {
                return R.error(1, "因机构合同存在，机构不能删除【" + id + "】");
            }
        }

        for (Integer id : ids) {
            int count = buPayoffOneService.selectCount(new EntityWrapper<BuPayoffOneEntity>().eq("agency_id", id));
            if (count > 0) {
                return R.error(2, "单核结算表存在数据，机构不能删除【" + id + "】");
            }
        }

        for (Integer id : ids){
            int count = buImprestService.selectCount(new EntityWrapper<BuImprestEntity>().eq("agency_id",id));
            if (count > 0){
                return R.error(3,"预付款表存在数据，机构不能删除【"+id+"】");
            }
        }

        hrAgencyService.updateDelFlag(ids);

        return R.ok();
    }

}
