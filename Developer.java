public class Developer extends Employee {
    public String position;
    private String department;
    public Developer(String name){
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
    public double calculateBonus(){
        return 2 * getSalary();
    }

}
