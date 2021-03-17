package com.hazelcast.HazelcastSessionReplication;

import java.io.Serializable;

public class TestClass implements Serializable {
    private String text;
    private int anInt;

    public TestClass() {
    }

    public TestClass(String text, int anInt) {
        this.text = text;
        this.anInt = anInt;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }
}
