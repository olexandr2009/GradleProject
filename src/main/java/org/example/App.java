package org.example;

import com.google.gson.Gson;

public class App {
    public static final Gson gson = new Gson();
    public static void main(String[] args) {
        User user = User.builder()
                .name("Olexandr")
                .lastName("Khrystevich")
                .build();
        String answer = gson.toJson(user);
        System.out.println(answer);
    }
}