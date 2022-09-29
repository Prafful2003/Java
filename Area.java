import java.util.Scanner;

class Area
{
    public static void main(String[] args)
    {
        int l,b,area;
        System.out.println("Enter length");
        Scanner a=new Scanner(System.in);
        l=a.nextInt();
        System.out.println("Enter width");
        b=a.nextInt();
        area=l*b;
        System.out.println("area of rectangle is "+area);

    }
}