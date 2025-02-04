import java.util.Arrays;


public class SimpleNumeric {
    public double getMin(double[] number){
        Arrays.sort(number);
        double min=number[0];
        return  min;
    }
    public double getMax(double[] number){
        double max=number[0];
        for(int i=1; i<number.length; i++){
            if (number[i]>max) {
                max=number[i];
            }
        }
        return  max;
    }
    public double getAvg(double[] number){
        double avg=0,sum=0;
        for(int i=0; i<number.length; i++){
            sum=sum+number[i];
            }
        avg=sum/number.length;
        return  avg;
    }
    public double getSum(double[] number){
        double sum=0;
        for(int i=0; i<number.length; i++){
                sum+=number[i];
            }
        return  sum;
    }
}
