public class Lawyer extends Employee {
  @Override
  public int vacationDays(){
    return 15;
  }
  @Override
  public double getSalary(){
    return super.getSalary() + 20000;//super calls the parent class' methods
  }

  public String getVacationform(){
    return "pink";
  }
  
  public void sue(){
    System.out.println("See u in court haha");
  }
}