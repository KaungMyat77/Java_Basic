package com.kaungmyat;

import java.text.DecimalFormat;

public class numberFormat {
    public static void main(String[] args) {
        String number="1234566345346524334";
        double amount = Double.parseDouble(number);
        DecimalFormat formatter = new DecimalFormat("#,###");

        System.out.println(formatter.format(amount));
    }
}
