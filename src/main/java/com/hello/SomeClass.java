package com.hello;

public class SomeClass {

    FakeDBConnector conn = new FakeDBConnector();

    public String hello(){
        return conn.giveString();
    }

    public void setConn(FakeDBConnector conn) {
        this.conn = conn;
    }
}
