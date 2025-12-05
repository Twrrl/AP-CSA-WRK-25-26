import java.util.*;

public class Main {
    public static void main(String[] args) {
      Employee sam = new Employee();
      System.out.println("sam's hours are " + sam.getHours());
      System.out.println("sam'salary is " + sam.getSalary());
      System.out.println("sams num of vac days is " + sam.vacationDays());
      System.out.println(sam.getVacationForm());
      
      System.out.println();
      
      Secretary elion = new Secretary();
      System.out.println(elion.getHours());
      elion.takeDictation("10");
      
      System.out.println();
      
      Lawyer nick = new Lawyer();
      System.out.println(nick.vacationDays());
      System.out.println("salary is: $" + nick.getSalary());
      System.out.println("nicks vacation form is: " + nick.getVacationForm());
      nick.sue();
      
      LegalSecretary ethan = new LegalSecretary();
      System.out.println("\nEthan's salary is: $" + ethan.getSalary());//no get salary in parent class
      
      Marketer isaac = new Marketer();
      System.out.println("Isaacs salary is: $" + isaac.getSalary());
  }
}