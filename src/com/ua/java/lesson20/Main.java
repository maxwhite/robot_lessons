package com.ua.java.lesson20;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String [] translation = translate("Понеділок");

        System.out.println("Понеділок:");
        System.out.println(translation[0]);
        System.out.println(translation[1]);
        System.out.println(translation[2]);

        translation = translate("Березень");

        System.out.println("Березень:");
        System.out.println(translation[0]);
        System.out.println(translation[1]);
        System.out.println(translation[2]);

    }

    private static String[] translate(String word) {

        Map<String, String []> vocabulary = new HashMap<>();

        vocabulary.put("Понеділок", new String[]{"Monday", "Montag", "月曜日"});
        vocabulary.put("Вівторок", new String[]{"Tuesday", "Dienstag", "火曜日"});
        vocabulary.put("Середа", new String[]{"Wednesday", "Mittwoch", "水曜日"});
        vocabulary.put("Четвер", new String[]{"Thursday", "Donnerstag", "木曜日"});
        vocabulary.put("П'ятниця", new String[]{"Friday", "Freitag", "金曜日"});
        vocabulary.put("Субота", new String[]{"Saturday", "Samstag", "土曜日"});
        vocabulary.put("Неділя", new String[]{"Sunday",   "Sonntag", "日曜日"});

        vocabulary.put("Січень", new String[]{"January", "Januar", "1月"});
        vocabulary.put("лютий", new String[]{"February", "Februar", "2月"});
        vocabulary.put("Березень", new String[]{"March", "März", "行進"});

        if(vocabulary.containsKey(word) ) {
            return vocabulary.get(word);
        }

        return new String[]{};
    }
}
