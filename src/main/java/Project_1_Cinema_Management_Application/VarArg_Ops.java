package Project_1_Cinema_Management_Application;

import java.util.Arrays;

public class VarArg_Ops {

    public static void main(String[] args) {
        //printVarArg(40, 2, 4, 4, 5, 6);
        onlyVarArgs();

        int[] array = {1, 2, 3};
        //changeOrgArray(array);
        //System.out.println("Original Array - " +  Arrays.toString(array));

    }

    public static void printVarArg(int a, Object... b){
        System.out.println(a + " -- " + Arrays.asList(b));
    }

    public static void onlyVarArgs(Object... c){
        System.out.println("Var length Args == " + Arrays.asList(c));
    }

    public static void changeOrgArray(int[] array){
        array[0] = 10;
        //System.out.println(Arrays.toString(array));
    }
}
