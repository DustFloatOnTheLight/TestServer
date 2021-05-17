package com.lexi.testserver.service;

import com.lexi.testserver.dao.mysql.CustomerizedMapper.StaffPOCustomerizedMapper;
import com.lexi.testserver.model.mysql.StaffPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    
    @Autowired
    private StaffPOCustomerizedMapper staffMapper;

    public String getAllStaffData(){
        return staffMapper.findAll().toString();
    }
}
