import java.util.*;
class Fact
{
    public static void main()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=sc.nextInt();
    }
    public static int fact (int n)  
    {
        int fact=1;
        while(n>0)
    {   fact=fact*n;
        n= n-1;
    }
    return fact;
}
}
