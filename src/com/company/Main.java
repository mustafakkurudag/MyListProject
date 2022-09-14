package com.company;

public class Main {

    public static void main(String[] args) {

        MyList<Object> list = new MyList<>(5);

        System.out.println("Listedeki eleman sayısı: " + list.size());
        System.out.println("Listenin kapasitesi: " + list.getCapacity());

        list.add(1);
        list.add("Merhaba");
        list.add(2);
        list.add("Bu bir");
        list.add(3);
        list.add("liste projesi");
        list.add(4);
        list.add(2);

        System.out.println(list);
        System.out.println("Listedeki eleman sayısı: " + list.size());
        System.out.println("Listenin kapasitesi: " + list.getCapacity());

        //girilen parametredeki indisteki elemanı siler
        list.remove(0);
        System.out.println(list);

        list.set(0, "Hello");
        System.out.println(list);
        System.out.println("Listedeki eleman sayısı: " + list.size());
        System.out.println("Listenin kapasitesi: " + list.getCapacity());
        System.out.println("1. indisteki eleman: " + list.get(1));
        //girilen parametrenin bulunduğu ilk indis
        System.out.println(list.indexOf(2));
        //girilen parametrenin bulunduğu son indis
        System.out.println(list.lastIndexOf(2));

        //listenin boş ise true dolu ise false döndürür.
        System.out.println(list.isEmpty());
        MyList<String> myStrList = new MyList<>();
        System.out.println(myStrList.isEmpty());

        //toArray() metodu liste elemanlarını diziye çevirir.
        Object[] objArr = list.toArray();
        for (Object o :
                objArr) {
            System.out.println(o);
        }

        //listedeki elemanları temizler.
        //list.clear();
        System.out.println(list);
        System.out.println("Listedeki eleman sayısı: " + list.size());
        System.out.println("Listenin kapasitesi: " + list.getCapacity());

        //listenin ilgili parametreleri aralığında bir alt liste döndürür.
        MyList<Object> subMylist = list.subList(2,5);
        System.out.println("2. ve 5. indis aralığındaki alt liste: ");
        System.out.println(subMylist);
        //parametredeki eleman listede varsa true yoksa false döndürür
        System.out.println(list.contains(4));
        System.out.println(list.contains(40));

    }
}
