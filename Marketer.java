public class Marketer extends Employee {
  @Override
  public double getSalary(){
    return super.getSalary() + 10000;
  }
}