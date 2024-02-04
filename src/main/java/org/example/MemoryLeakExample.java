package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MemoryLeakExample {
    static class Data {

        Long[] list;

        public Data(Long[] list) {
            this.list = list;
        }

        String memory = "Hello Memory";
    }

    public static void main(String[] args) throws InterruptedException {
        List<Data> list = new ArrayList<>();
        int i = 0;
        while (true) {
            list.add(new Data(new Long[1]));
//            i++;
//            if (i % 10000 == 0) {
//                System.out.println(i);
//            }
        }
    }
}