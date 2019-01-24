package com.rafael.sample;

import java.util.Arrays;

public class IP {
    private int[] ip;

    public IP() {
    }

    public IP(int[] ip) {
        this.ip = ip;
    }

    public int[] getIp() {
        return ip;
    }

    public void setIp(int[] ip) {
        this.ip = ip;
    }

    public Long getIpValue(){
        return Long.valueOf(ip[0]+ "" +ip[1]+ip[2]+ip[3]);
    }
}
