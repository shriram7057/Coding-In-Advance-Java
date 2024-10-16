import java.util.*;
class StudentDetails
{
    private
    int id;
    String name;
    float marks;
    StudentDetails(int id,String name,float marks)
    {
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public StudentDetails() 
    {

    }
    void get_stud_info()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter student id");
     id = sc.nextInt();
    System.out.println("Enter student name");
     name = sc.next();
    System.out.println("Enter student marks");
     marks=sc.nextFloat();
}
    void disp_stud_info()
    {
        System.err.println("Student id->"+id);
        System.out.println("Student name->"+name);
        System.out.println("Student marks->"+marks);
    }
}
public class MiniProject extends StudentDetails
{   
public MiniProject(int id, String name, float marks) 
{
        super(id, name, marks);
}
public static void main(String args[])
{
    StudentDetails s1=new StudentDetails();  
    s1.get_stud_info();
    s1.disp_stud_info();

}
}


    