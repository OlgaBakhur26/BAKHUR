package com.company;

class MyClass <T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    MyClass(T[] o){
        vals = o;
    }

    // возвратить минимальное значение из массива vals
    public T min(){
        T v = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0)
                v = vals[i];
        }return v;
    }

    // возвратить максимальное значение из массива vals
    public T max(){
        T v = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0)
                v= vals[i];
        }return v;
    }
}

class GenIFDemo{
    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 8, 6 };
        Character chs [] = { 'Ь' , 'r' , 'р' , 'w' } ;

        MyClass<Integer> iOb = new MyClass<Integer>(inums);
        MyClass<Character> cOb = new MyClass<Character>(chs);

        System.out.println("Maкcимaльнoe значение в массиве inums: " + iOb.max());
        System.out.println("Mинимaльнoe значение в массиве inums: " + iOb.min());
        System.out.println("Maкcимaльнoe значение в массиве chs: " + cOb.max());
        System.out.println("Mинимaльнoe значение в массиве chs: " + cOb.min());



    }
}
