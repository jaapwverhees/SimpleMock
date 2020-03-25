package com.hello;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BrutusTest {

    Brutus brutus = new Brutus();
    Hellor hellor = mock(Hellor.class);

    @BeforeEach
    void setUp() {
        brutus.setHello(hellor);
        when(hellor.hello()).thenReturn("Daisy");
    }

    @Test
    public void test(){
        assertEquals("Daisy", brutus.bruter());
    }

}