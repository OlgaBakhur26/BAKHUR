package com.company;

public class Table implements Chair.Furniture{
    // Когда вложенный интерфейс используется за пределами объемлющей его области действия, его
    //имя должно быть дополнительно уточнено именем класса или интерфейса, членом
    //которого он является. Это означает, что за пределами класса или интерфейса, в котором
    //объявлен вложенный интерфейс, его имя должно быть уточнено полностью.

    @Override
    public boolean isWooden(String answer) {
        return answer == "yes"? true: false;
    }
String title;
    Table(String name){
        title = name;
    }
}
