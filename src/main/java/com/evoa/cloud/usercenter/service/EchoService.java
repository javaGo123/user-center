package com.evoa.cloud.usercenter.service;

import com.evoa.cloud.usercenter.feignclient.ContentCenterFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EchoService {

    private final ContentCenterFeignClient fc;

    public EchoService(ContentCenterFeignClient fc) {
        this.fc = fc;
    }

    public String echo(String ss){
        return this.fc.echoString(ss);
    }
}
