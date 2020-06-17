package com.demo.test;

import org.springframework.http.converter.json.GsonBuilderUtils;

public class Proxy implements Rent {
    private Landlord host;

    public Proxy() {
    }

    public Proxy(Landlord host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
    }
    //看房
    public void seeHose(){
        System.out.println("带你看房");
    }
    //签合同
    public void signContract(){
        System.out.println("签合同");
    }
    //收中介费
    public void Charge(){
        System.out.println("收费");
    }
}
