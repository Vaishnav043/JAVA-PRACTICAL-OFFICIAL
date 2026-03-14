class Student{
    int ID;
    String Name;
    int Age;
    String Branch;
    String Address;
    long Mobile_No;
    
    
    Student(int ID,String Name,int Age, String Branch, String Address, long Mobile_No){
        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
        this.Branch = Branch;
        this.Address = Address;
        this.Mobile_No = Mobile_No;
        
    }

    void display(){
        System.out.println("ID:- "+ID);
        System.out.println("Name: "+ Name);
        System.out.println("Age: "+Age);
        System.out.println("Branch: "+ Branch);
        System.out.println("Address: "+ Address);
        System.out.println("Mobile_No: "+ Mobile_No);
       

        System.out.println("--------------------------------");
    }
}