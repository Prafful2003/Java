import java.util.*;
class Teacher 
{
   void teach ()
   {
    String t; 
    System.out.println("Enter teacher name ");
    Scanner tea=new Scanner(System.in);
    t=tea.nextLine();
    System.out.println("Teacher name is "+t);

    System.out.println("--------teach() Method close--------");
   }
}
class Student extends Teacher 
{
    void listen ()
    {
        System.out.println("Everyone listen carefully ");
        System.out.println("--------listen() Method close--------");

    }
}
class Hometution extends Teacher 
{
    void tution()
    {
        System.out.println("-----------------Shivay Tution classes-----------------");
        System.out.println("--------tutiion() Method close--------");

    }
}
class Hirericial_inheritance
{
    public static void main (String[]args)
    {
        Student s=new Student();
        s.teach();
        s.listen();

        Hometution h=new Hometution();
        h.tution();
        h.teach();
    }
}