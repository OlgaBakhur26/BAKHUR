package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Ten_Most_Popular_Words {

    public static void main(String[] args) {
        String text = readAllBytesJava7("Война и мир.txt");
        text = text.replaceAll("\\.|\\,|\\!|\\?|\\:|\\...|\\-|\\(|\\)|\\\"|\\;|\\\n", " "); // убрать знаки препинания
        String[] words = text.split(" "); // разделить строку на множество строк по пробелам
        for (String word : words) {
            word.trim(); // удалить лишние пробелы: не работает (Result of 'String.trim()' is ignored). Все равно не понятно, почему.
        }

        Map<String, Integer> data = new HashMap<>(); // Записать пары "ключ-значение" в Map
        for(String word : words){
            if(!data.containsKey(word)){
                data.put(word, 1);
            }else {
                data.put(word, data.get(word) + 1);
            }
        }

        for(Map.Entry<String, Integer> entry : data.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue()); // Распечатать пары "ключ-значение" в консоль
        }
        System.out.println();

        // 10 наиболее часто встречающихся слов
        List<Integer> values = new ArrayList<>(); // 1. Создать List, куда запишем все значения из Map
        for(Map.Entry<String, Integer> entry : data.entrySet()){
            if (!entry.getValue().equals(" ")){ // В итоге пробел все равно участвует. Не работает, потому что сравниваются Integer и String?
                values.add(entry.getValue()); // 2. Записать в List все значения из Map
            }
        }
        values.sort(Collections.reverseOrder()); // 3. Отсортировать List по убыванию значений
        List<Integer> subValues = values.subList(0, 10); // 4. Создать второй List, в который скопируем только 10 первых
        // значений (это 10 самых больших значений)

        System.out.println("10 НАИБОЛЕЕ ЧАСТО ВСТРЕЧАЮЩИХСЯ СЛОВ:");
        int counter = 0;
        for (Integer subValue : subValues) { // Сравнить 10 наибольших значений из List со всеми значениями из Map и,
            for(Map.Entry<String, Integer> entry : data.entrySet()){ // если значения совпали, то вывести в консоль пары "ключ-значение"
                if (subValue.equals(entry.getValue())){
                    counter++;
                    System.out.println(counter + " место: " + entry.getKey() + " = " + entry.getValue());
                    // 1 место: пробел. Не знаю, как от него избавиться
                }
            }
        }
    }

    private static String readAllBytesJava7(String filePath){
        String content = "";
        try{
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        }catch (IOException e){
            e.printStackTrace();
        }
        return content;
    }
}
