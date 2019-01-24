package com.rafael.sample;


public class Main {

    public static void main(String[] args) {
        double m = System.currentTimeMillis();
        IP ip1 = Validator.getValidIp();
        IP ip2 = Validator.getValidIp();

        IPCalculate ipCalculate = new IPCalculate(ip1,ip2);
        ipCalculate.start();

        System.out.println((System.currentTimeMillis() - m) + " millisecond");

    }
}
