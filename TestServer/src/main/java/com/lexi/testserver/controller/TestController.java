package com.lexi.testserver.controller;

import com.lexi.testserver.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    private static final String keyIsAllowedAccess = "IsAllowAccess";
    private static final String keyIsObtainData = "IsObtainData";

    @RequestMapping(value = "/testAPI", method = RequestMethod.GET)
    public String testApi() {
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
        }
        return "Hello Client! This is a testcase!";
    }

    @GetMapping(value = "/AccessDB")
    public String testAccessDB(@RequestParam(value = keyIsObtainData, required = false, defaultValue = "false") boolean isObtainData) {
        if (!isObtainData)
        {
            return "Cannot Obtain Data From Server";
        }

        return testService.getAllStaffData();
    }

    @PostMapping(value = "/AccessDB")
    public String testAccessDB_Post(@RequestHeader(value = keyIsAllowedAccess, required = true) boolean isAllowedAccess,
                               @RequestParam(value = keyIsObtainData, required = false, defaultValue = "false") boolean isObtainData) {
        if (!isAllowedAccess)
        {
            return "The Access is Not Allowed";
        }
        if (!isObtainData)
        {
            return "Cannot Obtain Data From Server";
        }

        return testService.getAllStaffData();
    }
}
