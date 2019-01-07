package com.ping.wu.controller;

import com.ping.wu.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wuping
 * @date 2019/1/4
 */
@Controller
@RequestMapping("/test")
public class TestController {
    private final DemoService demoService;

    @Autowired
    public TestController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/mock")
    @ResponseBody
    public String testMock() {
        return demoService.testMock();
    }

    @GetMapping
    @ResponseBody
    public String testGet() {
//        demoService.test("world");
        demoService.saySomething();
        return "success";
    }

}
