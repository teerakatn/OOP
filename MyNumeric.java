import java.util.Arrays;

public class MyNumeric {
    public static void main(String[] args) {
        double[] myNumber={19.0,12.0,14.0,15.0,11.0,21.5,18.5,22.5,25.0,13.0};

        SimpleNumeric num=new SimpleNumeric();

        System.out.println("All number : "+ Arrays.toString(myNumber));
        System.out.println("Min : "+num.getMin(myNumber));
        System.out.println("Max : "+num.getMax(myNumber));
        System.out.println("Average : "+num.getAvg(myNumber));
        System.out.println("Summary : "+num.getSum(myNumber));

    }
}
