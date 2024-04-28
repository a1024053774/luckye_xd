package com.luckye.service;

import com.luckye.mapper.CompanyMapper;
import com.luckye.pojo.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    private CompanyMapper companyMapper;
    @Override
    public Company selectById(int id) {
        return companyMapper.selectById(id);
    }

}