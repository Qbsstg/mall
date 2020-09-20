package com.macro.mall.service.impl;

import org.springframework.beans.factory.annotation.Value;

public class Test {

    @Value("jwt.tokenHeader")
    private static String a;

    private static String sys(){
        return a;
    }

    public static void main(String[] args) {
        System.out.println(sys());
    }
}
