import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
     
        //Creating Scanner obj to scan the values in constructor
        Scanner myObj = new Scanner(System.in);
        
        //Overloaded Constructor to not display Menu while creating menu object
        Menu mymenu = new Menu();
        
        //Creating ArryList of object 
        ArrayList<Student> student = new ArrayList<Student>();    

        //Creating infine loops to display menu and not let program quit !!!
        while(true){
            mymenu.displayMenu(myObj);
            int idStorer;  //To search by id's in all Update , delete 
            boolean y = false; //To loop add function

            switch (mymenu.value) {
                    
                // Add object in array list :
                    case 1:
                        
                    while(y != true){
                    
                        student.add(new Student(myObj));
                        System.out.println("DO u want to add more record ? (y/n)");
                        char c = myObj.next().charAt(0);
                        if(c == 'n' || c == 'N' ){
                            y = true;
                        }else{
                            y = false;
                        }
                    
                    }

                    break;
                // Get object by id :
                case 2:

                    System.out.print("Enter the id of the student");
                    idStorer =  myObj.nextInt(); 
                    while(idStorer > student.size()-1 || idStorer < 0){
                        System.out.print("Id not found!!! Try again :");
                        idStorer = myObj.nextInt(); 

                    }
                    System.out.println(student.get(idStorer).getFullName()+ " "+ student.get(idStorer).getStudyDetails());
                
                    break;

                //Get all student data :
                case 3:
                 
                System.out.println("*************************************");
                for(Student st : student){
                    System.out.println(st.getFullName() + " " + st.getStudyDetails());
                    System.out.println("-------------------------------------");
                }
                    break;

                //Update student by id :        
                case 4:
                    System.out.print("Enter the Id of the student to update :");
                    idStorer =  myObj.nextInt(); 
                    while(idStorer > student.size()-1 || idStorer < 0){
                        System.out.print("Update Id not found!!! Try again :");
                        idStorer = myObj.nextInt(); 

                    }
                    student.set(idStorer,new Student(myObj));
                    break;

                //Delete Student by id :   
                case 5:
                    while(y != true){
                        System.out.print("Enter the ID of student to be deleted :");
                        idStorer =  myObj.nextInt(); 
                        while(idStorer > student.size()-1 || idStorer < 0){
                            System.out.print("Update Id not found!!! Try again :");
                            idStorer = myObj.nextInt(); 
    
                        }
                        student.remove(idStorer);
                        System.out.print("Do u want to delete more items ? (y/n)");
                        char c = myObj.next().charAt(0);
                        if(c == 'n' ){
                            y = true;
                        }  
                    }
                    break;
                
                //Exit the program :
                 case 6 :
                  System.exit(0);
                    break;
                
                //for input that is not in the switch case :
                default :
                    System.out.print("Out of bound");
                    break;
            } 
            
        }
        
       
    }
}