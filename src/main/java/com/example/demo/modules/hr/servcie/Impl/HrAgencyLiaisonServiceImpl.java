package com.example.demo.modules.hr.servcie.Impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.modules.hr.dao.HrAgencyLiaisonDao;
import com.example.demo.modules.hr.entity.HrAgencyLiaisonEntity;
import com.example.demo.modules.hr.servcie.HrAgencyLiaisonService;
import org.springframework.stereotype.Service;



@Service("hrAgencyLiaisonService")
public class HrAgencyLiaisonServiceImpl extends ServiceImpl<HrAgencyLiaisonDao, HrAgencyLiaisonEntity> implements HrAgencyLiaisonService {

}
