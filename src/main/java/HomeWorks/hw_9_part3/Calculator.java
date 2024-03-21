package HomeWorks.hw_9_part3;

public class Calculator {




    public int minus(int a, int b){
        return a-b;
    }
    public int plus(int a, int b){
        return a+b;
    }


    public int multiply(int a, int b){
        return a*b;
    }
    public double divide(double a, double b){
        if(b==0){
            System.out.println("нельзя делить на ноль");
            return 666;
        } else {
            return a/b;
        }
    }


}
