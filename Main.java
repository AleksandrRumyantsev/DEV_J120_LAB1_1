import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Проверяем работу
        Phone p = new Phone("123", "1234567");
        Phone p2 = new Phone("1234", "123456");
        //Phone p3 = new Phone("123", "123456");.............Ошибка
        //Phone p4 = new Phone("1234", "1234567");.............Ошибка
        //Phone p5 = new Phone("1234", "1234567");.............Ошибка
        //Phone p6 = new Phone("12345", "1234567");.............Ошибка
        //Phone p6 = new Phone("12345", "12345678");............Ошибка
        System.out.println(p.toString());
        System.out.println(p2.toString());
        System.out.println();

        //Пример с множествами:
        System.out.println("Проверяем работу с множествами:");
        HashSet <Phone> hashSet = new HashSet<>();
        hashSet.add(new Phone("123","1234567"));
        hashSet.add(new Phone("1234","123456"));
        hashSet.add(new Phone("123","1234567"));
        hashSet.add(new Phone("1234","123456"));
        hashSet.add(new Phone("124","1234568"));
        hashSet.add(new Phone("1235","123457"));
        hashSet.add(new Phone("123","1234568"));
        hashSet.add(new Phone("1235","123456"));
        //hashSet.add(new Phone("1234","1234567")); .............Ошибка
        //hashSet.add(new Phone("123","123456"));.............Ошибка
        Iterator<Phone> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        
        System.out.println();

        //Пример с ассоциативными массивами:
        System.out.println("Проверяем работы с ассоциативными массивами:");
        HashMap hashMap = new HashMap();
        hashMap.put(new Phone("123","1234567"), "Иванов");
        hashMap.put(new Phone("1234","123456"), "Петров");
        hashMap.put(new Phone("123","1234567"), "Сидоров");
        hashMap.put(new Phone("1234","123456"), "Таибов");
        hashMap.put(new Phone("124","1234568"), "Румянцев");
        hashMap.put(new Phone("1235","123457"), "Козлов");
        hashMap.put(new Phone("123","1234568"), "Путин");
        hashMap.put(new Phone("1235","123456"), "Навальный");
        System.out.println(hashMap);
    }
}
