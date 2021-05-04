package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object oriented, platform dependent language");
        languages.put("Python", "an interpreted, high level, object oriented language");
        languages.put("Algol", " an algorithmic language");
        languages.put("Lisp", "Therein lies madness" );
//        Overriding existing element
        languages.put("Java","this course is about Java");

        System.out.println(languages.get("Java"));
        if (languages.containsKey("Python")){
            System.out.println("Python is already added");
        } else {
            languages.put("Python", "Adding again");
        }

        System.out.println("------------------------------------------");
        languages.remove("Lisp");
        if (languages.remove("Algol","Something")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed");
        }
        for (String key: languages.keySet()){
            System.out.println(key+" : "+languages.get(key));
        }
    }
}
