package com.hello;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


import java.util.concurrent.TimeUnit;



class HellorTest {


    Hellor hello = new Hellor();

    @Test
    @Timeout(5)
    void setUpDB() throws InterruptedException {
        TimeUnit.SECONDS.sleep(6);
    }

}