import java.util.ArrayList;

public class Example_loop {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Alphard");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Benz");
        cars.add("IZUZU");
        for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
}
