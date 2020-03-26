package com.hello;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeClassTest {

    SomeClass someClass = new SomeClass();
    FakeDBConnector conn = mock(FakeDBConnector.class);

    @BeforeEach
    void setUp() {
        someClass.setConn(conn);
        when(conn.giveString()).thenReturn("Daisy");
    }

    @Test
    void hello() {
        assertEquals("Daisy", someClass.hello());
    }
}