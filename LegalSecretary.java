public class LegalSecretary extends Secretary {//second level of hierarchy
  @Override
  public double getSalary(){
    return super.getSalary() + 5000;
  }
}