package com.company.helloheroku.models;

import java.util.Objects;

public class HelloHeroku {
    private String hello;

    public HelloHeroku(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelloHeroku that = (HelloHeroku) o;
        return Objects.equals(hello, that.hello);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hello);
    }

    @Override
    public String toString() {
        return "HelloHeroku{" +
                "hello='" + hello + '\'' +
                '}';
    }
}
