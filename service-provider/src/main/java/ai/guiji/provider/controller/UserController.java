package ai.guiji.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * author: zhouliliang
 * Date: 2019/12/19 14:54
 * Description:
 */
@RestController
public class UserController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello:" + name;
    }
}
