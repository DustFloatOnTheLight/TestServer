package com.lexi.testserver.dao.mysql.CustomerizedMapper;

import com.lexi.testserver.dao.mysql.StaffPOMapper;
import com.lexi.testserver.model.mysql.StaffPO;

import java.util.List;

public interface StaffPOCustomerizedMapper extends StaffPOMapper {
    List<StaffPO> findAll();
}
