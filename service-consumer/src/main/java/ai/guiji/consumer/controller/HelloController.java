package ai.guiji.consumer.controller;

import ai.guiji.consumer.feign.EurekaProviderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * author: zhouliliang
 * Date: 2019/12/19 15:02
 * Description:
 */
@Slf4j
@RestController
public class HelloController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private EurekaProviderService eurekaProviderService;

    @GetMapping("/test")
    public String hello(@RequestParam String name) {
        List<ServiceInstance> instances = discoveryClient.getInstances("SERVICE-PROVIDER");
        ServiceInstance serviceInstance = instances.get(0);
        String url = String.format("%s://%s:%s/hello?name=%s", serviceInstance.isSecure() ? "https" : "http", serviceInstance.getHost(), serviceInstance.getPort(), name);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        return responseEntity.getBody();
    }

    @GetMapping("/test2")
    public String hello2(@RequestParam String name) {
        return eurekaProviderService.hello(name);
    }
}
