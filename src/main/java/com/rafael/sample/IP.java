package com.rafael.sample;

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

    public int getIpValue(){
        return Integer.valueOf(""+ip[0]+ip[1]+ip[2]+ip[3]);
    }
}
