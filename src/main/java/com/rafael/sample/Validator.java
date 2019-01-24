package com.rafael.sample;

import java.util.Arrays;
import java.util.Scanner;

public class Validator {
    private static Scanner scanner = new Scanner(System.in);

    public static IP getValidIp(){
        IP ip;
        String stringIp;
        while (true) {
            System.out.println("Please enter ip address");
            stringIp = scanner.nextLine();
            if ((ipValidator(stringIp)) != null) {
                ip = new IP(ipValidator(stringIp));
                System.out.println("good");
                break;
            } else {
                System.out.println("invalid ip " + "'" + stringIp + "'");
            }
        }
        return ip;
    }

    private static int[] ipValidator(String stringIp){
        String[] stringArr = stringIp.split("\\.");
        int [] ip;
        if(stringArr.length!=4){
            System.out.println("IP " + "'" + stringIp + "'" + "is not correct. Try again.");
            return null;
        }

        try {
            ip =  Arrays.stream(stringArr).mapToInt(Integer::parseInt).toArray();
        }catch (NumberFormatException e){
            e.getMessage();
            return null;
        }
        if(!ipLoop(ip)){
            return null;
        }
        return ip;
    }

    private static boolean ipLoop(int[] ip){
        for(int i=0; i<4; i++){
            if(ip[i]>255 || ip[i]<0){
                System.out.println("your ip is not correct");
                return false;
            }
        }
        return true;
    }
}
