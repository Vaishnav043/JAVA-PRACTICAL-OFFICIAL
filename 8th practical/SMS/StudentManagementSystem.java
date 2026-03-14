import java.util.Scanner;
public class StudentManagementSystem{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Management m= new Management();

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
                    int ID = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String Name = sc.nextLine();

                    System.out.print("Enter Age:- ");
                    int Age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Branch(CS/IT/ENTC/INST/TEXT/PROD/CHEM/CIVIL):- ");
                    String Branch =sc.nextLine();
                    
                    System.out.print("Enter Address:- ");
                    String Address =sc.nextLine();

                    System.out.print("Enter Mobile_No:- ");
                    long Mobile_No = sc.nextLong();
                    sc.nextLine();

                    Student s = new Student(ID, Name, Age, Branch, Address, Mobile_No);
                    m.addStudent(s);
                    break;

                case 2:
                    m.viewStudent();
                    break;
                
                case 3:
                    System.out.print("Enter ID to delete: ");
                    int deleteID =sc.nextInt();
                    m.deleteStudent(deleteID);
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