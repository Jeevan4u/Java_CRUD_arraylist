import java.util.Scanner;

public class Menu{
     int value ;

      // Default Constructor
    Menu(){

    }

     //Parameterized Constructor
    Menu( Scanner myObj){
        this.displayMenu(myObj);
    }

    //Display Main Menu details for User :
    public void displayMenu(Scanner myObj){
        // System.out.println("-----------------------------------");
        System.out.println("1. Add");
        System.out.println("-----------------------------------");
        System.out.println("2. Get Student by id");
        System.out.println("-----------------------------------");
        System.out.println("3. Get All Student");
        System.out.println("-----------------------------------");
        System.out.println("4. update Student");
        System.out.println("-----------------------------------");
        System.out.println("5. delete Student");
        System.out.println("-----------------------------------");
        System.out.println("6. exit");
        System.out.println("-----------------------------------");
        System.out.print("Enter the Value to execute the program:");
        this.value = myObj.nextInt();
    }
}