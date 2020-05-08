package com.evoa.cloud.usercenter.feignclient;

import com.evoa.cloud.usercenter.feignclient.fallback.ContentCenterFeignClientFallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wangxinxin
 */
@FeignClient(name="content-center", fallbackFactory = ContentCenterFeignClientFallBackFactory.class)
public interface ContentCenterFeignClient {
    @GetMapping("/echo/{string}")
    String echoString(@PathVariable String string);
}


