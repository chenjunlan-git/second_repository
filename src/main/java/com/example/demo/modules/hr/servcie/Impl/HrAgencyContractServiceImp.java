package com.example.demo.modules.hr.servcie.Impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.modules.hr.dao.HrAgencyContractDao;
import com.example.demo.modules.hr.entity.HrAgencyContractEntity;
import com.example.demo.modules.hr.servcie.HrAgencyContractService;
import org.springframework.stereotype.Service;

@Service("hrAgencyContractService")
public class HrAgencyContractServiceImp extends ServiceImpl<HrAgencyContractDao,HrAgencyContractEntity> implements HrAgencyContractService {

}
