package ai.guiji.resilience4j.controller;

import ai.guiji.resilience4j.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: zhouliliang
 * Date: 2019/12/19 18:55
 * Description:
 */
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/slow")
    public String hello2(@RequestParam String name) {
        return demoService.slow(name);
    }
}
