package com.bootcoding.project.utils;
import java.util.Random;
public class PhoneNumberGenerator {
    final static int MAX = 999999999;
    final static int MIN = 980000000;
    static Random random = new Random();

    public static int getPhoneNumber() {
        int number = random.nextInt(MAX - MIN); // 899999
        int otp = MIN + number;
        System.out.println(" Phone Number = " + otp);
        return otp;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            PhoneNumberGenerator.getPhoneNumber();
        }
    }
}
//