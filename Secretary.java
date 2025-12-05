public class Secretary extends Employee {
  //adding behavior to child class
  //calls the constructor from super class
  private boolean bilingual;
  
  public Secretary(){
    super();
  }
  
  public Secretary(String name, int id, int years, boolean ilingual){
    super(name, id, years);
    this.bilingual = bilingual;
  }
    
  
  public void takeDictation(String text){
    System.out.println("mins are: " + text);
  }
}