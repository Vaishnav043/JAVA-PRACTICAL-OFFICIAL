import java.util.ArrayList;

class Management{

ArrayList <Student> students = new ArrayList<>();

void addStudent(Student s){
    students.add(s);
    System.out.println("Student Added Successfully");
}

void viewStudent(){
    if(students.isEmpty()){
        System.out.println("No Student Found");
    }else{
        for(int i=0;i<students.size();i++){
            students.get(i).display();
        }
    }
}

void deleteStudent(int id){
    students.removeIf(s->s.ID==id);
    System.out.println("Student Deleted");
}

}