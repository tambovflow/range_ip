package com.rafael.sample;

import java.util.*;

public class IPCalculate {
    private int[] ipMin;
    private int[] ipMax;
    private Set<String> ipSet;

    public IPCalculate() {
    }

    public IPCalculate(IP ipMin, IP ipMax) {
        if (ipMin.getIpValue() > ipMax.getIpValue()){
            this.ipMin = ipMax.getIp();
            this.ipMax = ipMin.getIp();
        }else {
            this.ipMin = ipMin.getIp();
            this.ipMax = ipMax.getIp();
        }
        this.ipSet = new LinkedHashSet<>();
    }

    public void start(){
        findIpRange(ipMin,ipMax);
       // System.out.println(ipSet);
    }

    private void findIpRange(int[] ipMin, int[] ipMax){
        while (ipMin[0]<256){
            while (ipMin[1]<256){
                while (ipMin[2]<256){
                    while (ipMin[3]<256){
                        //addSet(ipMin);
                        printIp(ipMin);
                        if(Arrays.equals(ipMin, ipMax)) return;
                        ipMin[3]+=1;
                    }
                    ipMin[3] = 0;
                    ipMin[2]+=1;
                }
                ipMin[3] = 0;
                ipMin[2] = 0;
                ipMin[1]+=1;
            }
            ipMin[3] = 0;
            ipMin[2] = 0;
            ipMin[1] = 0;
            ipMin[0]+=1;
        }
    }

    private void addSet(int[] ip){
        ipSet.add(ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3]);
    }

    private void printIp(int[] ip){
        System.out.println(ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3]);
    }

}
