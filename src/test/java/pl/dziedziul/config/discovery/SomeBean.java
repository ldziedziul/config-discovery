package pl.dziedziul.config.discovery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SomeBean {
    private static final Logger log = LoggerFactory.getLogger(SomeBean.class);

    void doSomething() {
        log.info("Doing something");
    }
}
