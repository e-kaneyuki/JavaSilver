package packagemain.package2;

import packagemain.package1.MyClass;

public class MyOtherClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("John Doe");
        System.out.println(myClass.getName());
    }
}
