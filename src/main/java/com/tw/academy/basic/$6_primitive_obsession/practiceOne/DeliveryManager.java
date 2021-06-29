package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    String toAddress;
    Address toAddressObj;
    String fromAddress;
    Address fromAddressObj;

    public DeliveryManager(Address fromAddressObj,
        Address toAddressObj) {
        this.toAddressObj =toAddressObj;
        this.fromAddressObj = fromAddressObj;
        //this.fromAddress = fromAddress.getAddress();
    }

    public DeliverCenter allocate(){
        if (getProvince(toAddressObj).equals(getProvince(fromAddressObj)) && getCity(toAddressObj).equals(getCity(fromAddressObj))){
            return DeliverCenter.LOCAL;
        }
        if (getProvince(toAddressObj).equals(getProvince(fromAddressObj))) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private String getCity(Address address) {
        return address.getAddress().substring(address.getAddress().indexOf("Province") + 1, address.getAddress().indexOf("City"));
    }

    private String getProvince(Address address) {
        return address.getAddress().substring(0, address.getAddress().indexOf("Province"));
    }
}
