package org.example;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakExample {
    static class Data {
        byte[] memoryConsumer = new byte[1024 + 1024];
    }

    public static void main(String[] args) throws InterruptedException {
        List<Data> list = new ArrayList<>();
        while (true) {
            list.add(new Data());
            Thread.sleep(50);
        }
    }
}