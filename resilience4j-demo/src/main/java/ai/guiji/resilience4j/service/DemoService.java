package ai.guiji.resilience4j.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * author: zhouliliang
 * Date: 2019/12/19 18:28
 * Description:
 */
@Service
public class DemoService {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CircuitBreakerFactory cbFactory;

    public String slow(String name) {
        return cbFactory.create("slow").run(() ->
                        restTemplate.getForObject("http://SERVICE-PROVIDER/hello?name=" + name, String.class),
                throwable -> "fallback");
    }
}
