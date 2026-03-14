class Student{

    int id;
    String name;
    String book_name;
    String date_issue;
    long mobile_no;

    Student(int id, String name, String book_name, String date_issue, long mobile_no){

        this. id = id;
        this. name = name;
        this. book_name = book_name;
        this. date_issue = date_issue;
        this. mobile_no = mobile_no;
    }

    void display(){
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Book Name: "+ book_name);
        System.out.println("DATE Issue: "+ date_issue);
        System.out.println("Mobile No. : "+ mobile_no);

        System.out.println("-------------------------------------------");
    
    }
}