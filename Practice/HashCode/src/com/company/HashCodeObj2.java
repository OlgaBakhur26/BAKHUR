package com.company;

public class HashCodeObj2 {
    public static void main(String[] args) {
        HashCodeObject1 obj1 = new HashCodeObject1(2, 5);
        HashCodeObject1 obj2 = new HashCodeObject1 (2, 5);
        HashCodeObject1 obj3 = new HashCodeObject1 (4, 7);


        int hCode1 = obj1.hashCode();
        int hCode2 = obj2.hashCode();
        int hCode3 = obj3.hashCode();

        System.out.println("Это хэш-код obj1: " + hCode1);
        System.out.println("Это хэш-код obj2: " + hCode2);
        System.out.println("Это хэш-код obj3: " + hCode3);

        if (obj1.hashCode() == obj2.hashCode())
            System.out.println("Хэш-коды объектов obj1 и obj2 равны.");
        else
            System.out.println("Хэш-коды объектов obj1 и obj2 НЕ равны.");
        // Вывод: даже если содержимое двух разных объектов одинаковое, все равно их хэш-коды разные.

        // Проверим эквивалентность  объектов.
        if (obj1.equals(obj2)) {
            System.out.println("obj1 и obj2 равны.");
        } else
            System.out.println("obj1 и obj2 не равны.");
        // Объекты не равны



        // Неравенство имеет место потому, что объекты из класса Object.
        // Нужно сделать @Override, чтобы корректно генерировались хэш-коды,
        // Тогда будет сравниваться содержимое, а не ссылки на объекты.
    }
}
