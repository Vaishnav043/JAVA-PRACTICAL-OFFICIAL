import java.util.Scanner;

public class LibraryManagementSystem{

    public static void main (String[] args){
    Scanner sc =new Scanner(System.in);
    Librarien L = new Librarien();

    
    while(true){
            System.out.println("\n1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Delete Student");
            System.out.println("4. EXIT");
            System.out.println("5. Enter choice: ");

            int choice = sc.nextInt();

        switch(choice){
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Book Name:- ");
                    String book_name =  sc.nextLine();
                   
                    System.out.print("Enter DATE Issue:- ");
                    String date_issue = sc.nextLine();
                    

                    System.out.print("Enter Mobile_No:- ");
                    long mobile_no = sc.nextLong();
                    sc.nextLine();

                    Student s = new Student(id, name,book_name,date_issue,mobile_no);
                    L.addStudent(s);
                    break;

                case 2:
                    L.viewStudent();
                    break;
                
                case 3:
                    System.out.print("Enter ID to delete: ");
                    int deleteID =sc.nextInt();
                    L.deleteStudent(deleteID);
                    break;

                case 4:
                    System.out.println("Exit....");
                    return;

                default:
                    System.out.println("Invalid choice");

         }
            
     }
 }
}
