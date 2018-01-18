package com.umf.b2b.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 对应具体服务提供方名称
 */
@FeignClient("umf-b2b-crm")
public interface UserFeignClientService extends com.umf.b2b.service.UserService {

}
