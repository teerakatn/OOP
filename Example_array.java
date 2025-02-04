import java.util.ArrayList;
import java.util.List;

public class Example_array {
    public static void main(String[] args) {
        List<Double> setNumber1=new ArrayList<>();
        setNumber1.add(12.0);
        setNumber1.add(20.0);
        setNumber1.add(15.0);
        setNumber1.add(45.0);
        System.out.println("List:"+setNumber1+",List Size ="+setNumber1.size());

        double number= setNumber1.get(2);
        System.out.println("Accessed Element:"+number);

        double removeNumber= setNumber1.remove(1);
        System.out.println("Remove Element:"+removeNumber);
        System.out.println("List:"+setNumber1+",List Size="+setNumber1.size());
    }
}
