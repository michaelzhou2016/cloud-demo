package ai.guiji.oauth2server.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: zhouliliang
 * Date: 2019/12/19 10:28
 * Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/currentUser")
    public Object user(Authentication authentication) {
        return authentication.getPrincipal();
    }
}