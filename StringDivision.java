package com.java.Strings;

public class StringDivision {
    String str3;
    String str4;
    String str5;

    static void main(String[] args) {
        String names = "Shiva Kumar,Siddaramayya,SM Krishna, HD Deve gowda";
        String[] cheifMinisters= names.split(",");
        for (String cheifMinister : cheifMinisters) {
            System.out.println(cheifMinister);
        }
    }


}
