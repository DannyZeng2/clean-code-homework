package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    String toAddress;
    Address toAddressObj;
    String fromAddress;
    Address fromAddressObj;

    public DeliveryManager(Address fromAddressObj,
        Address toAddress) {
        this.toAddressObj =toAddressObj;
        this.fromAddressObj = fromAddressObj;
        //this.fromAddress = fromAddress.getAddress();
    }

    public DeliverCenter allocate(){
        if (isSameProvince() && isSameCity()){
            return DeliverCenter.LOCAL;
        }
        if (isSameProvince()) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private boolean isSameCity() {
        return getCity(toAddress).equals(getCity(fromAddress));
    }

    private boolean isSameProvince() {
        return getProvince(toAddress).equals(getProvince(fromAddress));
    }

    private String getCity(String address) {
        return address.substring(address.indexOf("Province") + 1, address.indexOf("City"));
    }

    private String getProvince(String address) {
        return address.substring(0, address.indexOf("Province"));
    }
}
