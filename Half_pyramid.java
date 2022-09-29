import java.util.*;
class Half_pyramid
{
    public static void main (String[ ]args)
    {
        int row;                                              
        Scanner s=new Scanner (System.in);                          //     *
        row=s.nextInt( );                                           //    **
        for (int i=1; i<=row; i++)                                  //   ***
        {                                                           //  ****
            for (int j=1; j<=row; j++)                              //******
            {
                if (j<=row-i)
                {
                System.out.print(" ");
    
                }
                else {
               System.out.print("*");

                }
            }
            System.out.println();

        }
    }
}