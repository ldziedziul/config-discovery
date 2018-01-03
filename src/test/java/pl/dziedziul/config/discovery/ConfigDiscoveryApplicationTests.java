package pl.dziedziul.config.discovery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigDiscoveryApplicationTests {

    @Autowired
    private SomeBean someBean;

    @Test
    public void contextLoads() {
        someBean.doSomething();
    }

    @Configuration
    static class TestConfig {
        @Bean
        SomeBean someBean() {
            return new SomeBean();
        }
    }

}
