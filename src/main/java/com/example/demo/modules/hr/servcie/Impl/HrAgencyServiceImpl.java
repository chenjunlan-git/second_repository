package com.example.demo.modules.hr.servcie.Impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.common.utils.R;
import com.example.demo.modules.hr.dao.HrAgencyDao;
import com.example.demo.modules.hr.entity.HrAgencyEntity;
import com.example.demo.modules.hr.entity.HrAgencyLiaisonEntity;
import com.example.demo.modules.hr.entity.HrAgencyPaymentAccountEntity;
import com.example.demo.modules.hr.servcie.HrAgencyLiaisonService;
import com.example.demo.modules.hr.servcie.HrAgencyPaymentAccountService;
import com.example.demo.modules.hr.servcie.HrAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("hrAgencyService")
public class HrAgencyServiceImpl extends ServiceImpl<HrAgencyDao,HrAgencyEntity> implements HrAgencyService {
    @Autowired
    private HrAgencyLiaisonService hrAgencyLiaisonService;
    @Autowired
    private HrAgencyPaymentAccountService hrAgencyPaymentAccountService;

    @Override
    public List<Map> queryList(Map<String,Object> map) {
        return baseMapper.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return baseMapper.queryTotal(map);

    }

    @Override
    public void updateDelFlag(Integer[] ids) {
         baseMapper.updateDelFlag(ids);
    }

    @Override
    @Transactional
    public R selectAgency(Integer id) {

        HrAgencyEntity hrAgencyEntity = this.selectById(new EntityWrapper<HrAgencyEntity>().eq("id",id));

        List<HrAgencyLiaisonEntity> hrAgencyLiaisonEntityList = hrAgencyLiaisonService.selectList(new EntityWrapper<HrAgencyLiaisonEntity>().eq("agency_id",id).eq("del",0));
        hrAgencyEntity.setHrAgencyLiaisonEntityList(hrAgencyLiaisonEntityList);

        HrAgencyPaymentAccountEntity hrAgencyPaymentAccountEntity = hrAgencyPaymentAccountService.selectOne(new EntityWrapper<HrAgencyPaymentAccountEntity>().eq("agency_id",id).eq("newest",1));
        hrAgencyEntity.setHrAgencyPaymentAccountEntity(hrAgencyPaymentAccountEntity);

        return R.ok().put("hrAgency",hrAgencyEntity);

    }

    @Override
    public R newList(Integer userId) {
        List<Map> list = baseMapper.newList(userId);

        List<Map<Integer,String>> agencyList = new ArrayList<Map<Integer,String>>();
        for(Map obj : list){
            if (list==null || list.isEmpty()){
                continue;
            }
            Map map = new HashMap<Integer,String>();
            if (obj.get("name") != null){
                map.put("agencyId",obj.get("id"));
                map.put("value",obj.get("name"));
            }
            agencyList.add(map);
        }

        return R.ok().put("list",agencyList);
    }


}
