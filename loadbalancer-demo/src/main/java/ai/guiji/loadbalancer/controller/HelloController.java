package ai.guiji.loadbalancer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * author: zhouliliang
 * Date: 2019/12/19 15:02
 * Description:
 */
@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test2")
    public String hello2(@RequestParam String name) {
        return restTemplate.getForEntity("http://SERVICE-PROVIDER/hello?name=" + name, String.class).getBody();
    }
}
