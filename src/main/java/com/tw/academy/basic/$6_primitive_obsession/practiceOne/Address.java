package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class Address {

    private  String address;

    public Address(String fromAddress) {
        this.address = fromAddress;
    }

    public String getAddress() {
        return address;
    }

    String getCity() {
        return getAddress().substring(getAddress().indexOf("Province") + 1, getAddress().indexOf("City"));
    }

    String getProvince() {
        return getAddress().substring(0, getAddress().indexOf("Province"));
    }
}
