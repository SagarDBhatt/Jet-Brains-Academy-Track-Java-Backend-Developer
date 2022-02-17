package Project_1_Cinema_Management_Application.SingletonClass;

import org.w3c.dom.ls.LSOutput;

public class TestSingletonMain {

    public static void main(String[] args) {
        Singleton object = Singleton.getInstance();
        Singleton getObject = Singleton.getInstance();

        System.out.println(object.hashCode());
        System.out.println(getObject.hashCode());
    }

}
