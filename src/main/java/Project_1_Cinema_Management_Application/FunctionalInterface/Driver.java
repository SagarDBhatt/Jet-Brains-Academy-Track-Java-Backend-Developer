package Project_1_Cinema_Management_Application.FunctionalInterface;

public class Driver{
//    @Override
//    public int Calculate(int a) {
//        return a * a;
//    }

    public static void main(String[] args) {

//        //1. Use the interface as traditional method.
//        Driver driver = new Driver();
//        int sq = driver.Calculate(5);
//        System.out.println("Square of 5 = " + sq);

        //2. Use of Anonymous inner class (Nested class without name)
//        Square driver = new Square() {
//            @Override
//            public int Calculate(int a) {
//                return a * a;
//            }
//        };
//        System.out.println(driver.Calculate(5));

        //3. Lambda expression
        Square square = (int a) -> a * a;
        square.Calculate(5);
    }


}
