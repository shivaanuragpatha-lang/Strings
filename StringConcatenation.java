package com.java.Strings;

public class StringConcatenation {
    String str1;
    String str2;

    static void main(String[] args) {
        String str1 = "PV";
        String str2 = "Narasimha rao";
        str1 = str1.concat(" "+str2);
        System.out.println(str1);
        String str3 = "Kalvakuntla";
        String str4 = "Chandra";
        String str5 = "shekhar";
        String str6 = "Rao";
        String telanganaCM = String.join(" ", str3, str4, str5, str6);
        System.out.println(telanganaCM);

    }
}
