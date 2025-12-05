public class Employee {
  private String name;
  private int id;
  private int years;
  
  public Employee(){//defaulkt constructor has to be the first and has to explicitly stated if a parameterized constructor is defined
    name = "";
    id = 0;
    years = 0;
  }
  
  public Employee(String name, int id, int years){
    this.name = name;
    this.id = id;
    this.years = years;
  }

  public int getHours(){
    return 40;
  }
  
  public double getSalary(){
    return 50000.0;
  }
  
  public int vacationDays(){
    return 10;
  }
  
  public String getVacationForm(){
    return "yellow";
  }
}