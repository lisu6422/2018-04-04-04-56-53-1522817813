package com.thoughtworks;

import java.util.*;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private Map<Integer, String> map = new HashMap<>();

    {
        map.put(3, "Fizz");
        map.put(5, "Buzz");
        map.put(7, "Whizz");
    }

    public void start(int count) {

        for (int i = 1; i <= count; i++) {
            results.add(get(i));
        }


    }

    public String get(int i){
        StringBuffer sb = new StringBuffer();
        if (String.valueOf(i).contains("3")) {
            sb.append(map.get(3));
        } else if (i % 3 == 0) {
            sb.append(map.get(3));

            if (i % 5 == 0) {
                sb.append(map.get(5));
            }

            if (i % 7 == 0) {
                sb.append(map.get(7));
            }

        } else if (i % 5 == 0) {
            sb.append(map.get(5));
            if (i % 7 == 0) {
                sb.append(map.get(7));
            }
        } else if (i % 7 == 0) {
            sb.append(map.get(7));
        } else {
            sb.append(i);
        }

        return sb.toString();
    }


    public List<String> getResults() {
        return results;
    }
}


