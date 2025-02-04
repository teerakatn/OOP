public class TestEmployee {
    public static void main(String[] args) {
        Developer DV=new Developer("Batman");
        DV.setPosition("Programmer");
        DV.setDepartment("It Solution");
        DV.setSalary(35000);

        Developer DV1=new Developer("Robin");
        DV1.setPosition("Junior Tester");
        DV1.setDepartment("Computer Audit");
        DV1.setSalary(25000);


        System.out.println("Position:"+DV.getPosition());
        System.out.println("Name:"+DV.getName());
        System.out.println("Department:"+DV.getDepartment());
        System.out.println("Salary:"+DV.getSalary());
        System.out.println("Bonus rate:"+DV.calculateBonus());
        System.out.println();
        System.out.println("Position:"+DV1.getPosition());
        System.out.println("Name:"+DV1.getName());
        System.out.println("Department:"+DV1.getDepartment());
        System.out.println("Salary:"+DV1.getSalary());
        System.out.println("Bonus rate:"+DV1.calculateBonus());

    }
}
