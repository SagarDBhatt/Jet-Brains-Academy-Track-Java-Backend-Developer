package Project_1_Cinema_Management_Application.SingletonClass;

import org.w3c.dom.ls.LSOutput;

public class Singleton {

    private static Singleton singletonVar = null;

    /**
     * Private constructor.
     * In a singleton class, the object is created using getInstance() method.
     */
    private Singleton(){
        System.out.println("Inside the private constructor of the singleton classes!!");
    }

    public static Singleton getInstance(){
        if(singletonVar == null)
            singletonVar = new Singleton();

        return singletonVar;
    }
}// END OF Singleton Class

