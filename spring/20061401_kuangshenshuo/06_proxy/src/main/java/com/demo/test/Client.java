package com.demo.test;

import javafx.util.converter.ShortStringConverter;

public class Client {
    public static void main(String[] args) {
        Landlord host = new Landlord();
        Proxy proxy = new Proxy(host);
        proxy.seeHose();
        proxy.signContract();
        proxy.rent();
        proxy.Charge();
    }
}
