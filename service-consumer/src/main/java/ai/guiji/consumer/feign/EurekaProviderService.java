package ai.guiji.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-provider")
public interface EurekaProviderService {

    @GetMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
