package com.evoa.cloud.usercenter.controller;

import com.evoa.cloud.usercenter.service.EchoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class EchoController {
    @Autowired
    private EchoService echoService;

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string){
        log.info("echo something");
        return "user-center " + string;
    }

    @RequestMapping(value = "/fecho/{string}", method = RequestMethod.GET)
    public String fecho(@PathVariable String string){
        log.info("fecho something");
        return echoService.echo(string);
    }
}
