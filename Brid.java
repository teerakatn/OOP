public class Brid extends Animal{
    public  Brid(String name){
        super(name);
    }
    @Override
    public void sound() {

        System.out.println("KTAK"+super.getName());
    }
}
