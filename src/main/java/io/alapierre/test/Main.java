package io.alapierre.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 2023.04.15
 */
@Slf4j
public class Main {

    public void method1() {
        System.out.println("Now exception will be throw");
        log.debug("test log on debug");
        log.info("test log on info");
        log.warn("test log on warn");
        throw new RuntimeException("Test exception");
    }

}
