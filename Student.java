import java.util.Scanner;

public class Student {
    
    private static int  id = 0;
    private String firstName;
    private String lastName;
    private String level; 
    private String study;
    private int roll ;
    
    // Default Constructor
    Student(){

    }
    
    //Parameterized Constructor
    public Student(Scanner myObj){
      this.setFullName(myObj);
      this.roll += this.id ++;
      this.setStudyDetails(myObj);
    }

    //Settor Methord () :
  public void setFullName(Scanner myObj){
      
          System.out.println("");
          this.firstName = myObj.nextLine();   
          
          System.out.println("Enter first name :");
          this.firstName = myObj.nextLine();
          System.out.println("*****************");
          System.out.println("Enter last name :");
          this.lastName = myObj.nextLine();
         
    }

    //Settor Methord () :
    public void setStudyDetails(Scanner myObj){
        System.out.println("*****************");
        System.out.println("Enter Level:");
        this.level = myObj.nextLine(); 
        System.out.println("*****************");
        System.out.println("Enter Your Study:");  
        this.study = myObj.nextLine();   
        System.out.println("*****************");
    }

    //Gettor Methord():
    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }
    
    //Gettor Methord():
    public String getStudyDetails(){
        return this.roll + " " + this.level+ " " + this.study;
    }
}