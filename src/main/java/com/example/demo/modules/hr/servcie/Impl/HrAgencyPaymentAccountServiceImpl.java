package com.example.demo.modules.hr.servcie.Impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.modules.hr.dao.HrAgencyPaymentAccountDao;
import com.example.demo.modules.hr.entity.HrAgencyPaymentAccountEntity;
import com.example.demo.modules.hr.servcie.HrAgencyPaymentAccountService;
import org.springframework.stereotype.Service;

@Service("hrAgencyPaymentAccountService")
public class HrAgencyPaymentAccountServiceImpl extends ServiceImpl<HrAgencyPaymentAccountDao,HrAgencyPaymentAccountEntity> implements HrAgencyPaymentAccountService {
}
