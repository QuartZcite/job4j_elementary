package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ivanov@yandex.ru", "Ivanov Ivan Sidorovich");
        map.put("petrov@yandex.ru", "Petrov Petr Igorevich");
        for (String key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
