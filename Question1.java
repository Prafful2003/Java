import java.util.*;
class Vehicle
{
    void brand ( )
    {
        String s;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter brand name of vehicle :");
        s=a.nextLine();
        System.out.println("Model name is  "+s);
    }
}
class Car extends Vehicle
{
    void model( )
    {
        String b;
        Scanner c=new Scanner(System.in);
        System.out.println("Enter model name of vehicle :");
        b=c.nextLine();
        System.out.println("Model name is  "+b);
    }
}
class Question1
{
    public static void main(String[]args)
    {
       Car x=new Car();
       x.brand();
       x.model();
    }
}