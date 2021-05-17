package com.lexi.testserver.dao.mysql.CustomerizedMapper;

import com.lexi.testserver.dao.mysql.DepartmentPOMapper;
import com.lexi.testserver.model.mysql.DepartmentPO;

import java.util.List;

public interface DepartmentPOCustomerizedMapper extends DepartmentPOMapper {
    List<DepartmentPO> findAll();
}
