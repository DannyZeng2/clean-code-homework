package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    Address toAddress;
    Address fromAddress;

    public DeliveryManager(Address fromAddress, Address toAddress) {
        this.toAddress =toAddress;
        this.fromAddress = fromAddress;
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

    private boolean isSameProvince() {
        return this.fromAddress.isSameProvince(this.toAddress);
    }

    boolean isSameCity() {
        return this.fromAddress.isSameCity(this.toAddress);
    }

}
