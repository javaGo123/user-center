package com.evoa.cloud.usercenter.feignclient.fallback;

import com.evoa.cloud.usercenter.feignclient.ContentCenterFeignClient;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author wangxinxin
 */
@Slf4j
@Component
public class ContentCenterFeignClientFallBackFactory implements FallbackFactory<ContentCenterFeignClient>{
    @Override
    public ContentCenterFeignClient create(Throwable cause) {
        return new ContentCenterFeignClient() {
            @Override
            public String echoString(String string) {
                log.info("You have been traffic limited based on qps. Root cause is "+ cause);
                return "You have been traffic limited based on qps";
            }
        };
    }


}
