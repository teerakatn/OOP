public class Tester extends Employee{
    private String position;
    private String department;
    private Boolean testCertificated;

    public Tester(String name,boolean cert){
        super(name);
    }

    public String getPosition(){
        return position;
    }
    public String getDepartment(){
        return department;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void displayInfo(){
        this.displayInfo();
    }
    public double calculateBonus(){
        return 2 * getSalary();
    }
}
