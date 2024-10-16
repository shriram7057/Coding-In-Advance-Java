import java.util.*;
class Student 
{
    int rollno;
    String name;
    void get_stud_info()//method for get the student information
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student roll no");
        rollno=sc.nextInt();
        System.out.println("Enter student name");
        name=sc.next();
    }   
    void disp_stud_info()//method for displaying the student information
    {
        System.out.println("Student rollno=>"+rollno);
        System.out.println("Student name=>"+name);
    }
}
class Test extends Student//the extends keyword use for inherit the characteristics and properties of the parent class
{
    int marks1;
    int marks2;
    void get_stud_marks()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the test1 marks");
        marks1=sc.nextInt();
        System.out.println("Enter the test2 marks");
        marks2=sc.nextInt();
    }
    void disp_stud_marks()
    {
        System.out.println("Test1 marks=>"+marks1);
        System.out.println("Test2 marks=>"+marks2);
    }    
}
class singleInheritance
{
    public static void main(String[] args)
    
 {
      Test t1=new Test();
      t1.get_stud_info();
      t1.get_stud_marks();

      System.out.println("***<=STUDENT INFORMATION=>***");
      t1.disp_stud_info();
      t1.disp_stud_marks();  
 }
}

