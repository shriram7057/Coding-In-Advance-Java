import java.util.*;
class Student 
{
    int rollno;
    String name;
    void get_stud_info()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student RollNo");
        rollno=sc.nextInt();
        System.out.println("Enter Student name");
        name=sc.next();
    }
    void disp_stud_info()
    {
        System.out.println("Student Rollno=>"+rollno);
        System.out.println("Student Name=>"+name);
    }
}
class Test extends Student
{
    int marks1;
    int marks2;
    void get_stud_marks()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Test-1 marks1");
        marks1=sc.nextInt();
        System.out.println("Enter student Test-2 Marks");
        marks2=sc.nextInt();
    }
    void disp_stud_marks()
    {
        System.out.println("Student test-1 marks>"+marks1);
        System.out.println("Student test-2 marks=>"+marks2);
    }
}
class Sport extends Student
{
    int sport_wt;
    void get_stud_sport_wt()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student Sport Weightage");
        sport_wt=sc.nextInt();
    }  
    void disp_stud_sport_wt()
    {
        System.out.println("Student sport Weightage="+sport_wt);
    }
}
class HierarchicalinheritanceDemo
{
    public static void main(String[] args) {
        Test t1=new Test(); 
        Sport s1=new Sport(); 
        System.out.println("****Test Class*****"); 
        t1.get_stud_info(); 
        t1.get_stud_marks(); 
        t1.disp_stud_info(); 
        t1.disp_stud_marks(); 
        System.out.println("****Sport Class*****"); 
        s1.get_stud_info(); 
        s1.get_stud_sport_wt();
        s1.disp_stud_info(); 
        s1.disp_stud_sport_wt(); 
       } 
      }