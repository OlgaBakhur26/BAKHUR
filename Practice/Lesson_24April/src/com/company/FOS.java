package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class FOS {
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("obj.bin"));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeInt(12345);
        oos.writeLong(999);
//        oos.writeObject("Today");
//        oos.writeObject(new Date());
//        oos.close();

    }
}
