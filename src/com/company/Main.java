package com.company;

public class Main {

    public static void main(String[] args) {

        MyList<Object> list = new MyList<>(5);

        System.out.println("Listedeki eleman sayısı: " + list.size());
        System.out.println("Listenin kapasitesi: " + list.getCapacity());

        list.add(1);
        list.add("Merhaba");
        list.add(2);
        System.out.println("Listenin 20. elemanı: " + list.get(20));
        list.add("Merhaba2");
        list.add(3);
        list.add("Merhaba3");
        list.add(4);



        System.out.println(list.getoArray());
        System.out.println("Listedeki eleman sayısı: " + list.size());
        System.out.println("Listenin kapasitesi: " + list.getCapacity());

        list.add(5);
        list.add(6);
        list.add("Hello");
        list.add(7);
        list.add(9);
        list.add(234234);

        System.out.println(list.getoArray());
        System.out.println("Listedeki eleman sayısı: " + list.size());
        System.out.println("Listenin kapasitesi: " + list.getCapacity());
    }
}
