package myPackage;

import com.company.ITalk;

public class User implements ITalk {


    @Override
    public void sayHello() {
        System.out.println("Also Implemented");
    }
}
}
