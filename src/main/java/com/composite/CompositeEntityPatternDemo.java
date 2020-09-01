package com.composite;

public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();

        client.setData("test", "data1");
        client.printData();

        client.setData("second", "data2");
        client.printData();
    }
}

