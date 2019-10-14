package com.example.demo.modules.hr.servcie;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.common.utils.R;
import com.example.demo.modules.hr.entity.HrAgencyEntity;

import java.util.List;
import java.util.Map;

public interface HrAgencyService extends IService<HrAgencyEntity> {
    /**
     * 机构列表
     * @param map
     * @return
     */
    List<Map> queryList(Map<String,Object> map);

    /**
     * 查询机构数
     * @param map
     * @return
     */
    int queryTotal(Map<String,Object> map);

    /**
     * 删除机构
     * @param ids
     */
    void updateDelFlag(Integer[] ids);

    /**
     * 根据Id查询机构
     * @param id
     * @return
     */
    R selectAgency(Integer id);

}
