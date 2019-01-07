package com.ping.wu.api;

/**
 * @author wuping
 * @date 2019/1/5
 */

public class DemoServiceMock implements DemoService {

    @Override
    public void saySomething() {

    }

    @Override
    public void reply(String s) {

    }

    @Override
    public String testMock() {
        return "触发熔断啦!";
    }
}
