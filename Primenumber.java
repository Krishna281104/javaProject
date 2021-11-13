
import java.util.*;
class Primenumber
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=1000;i++)
         {
             if(prime(i))
              System.out.println(i);
         }
    }
    public static boolean prime(int n)
    {
        int cnt=0;
      for(int i=1;i<=n;i++)
      {
       if(n%i==0)
       cnt++;
      }
      if(cnt ==2)
       return true;
       else
       return false;
    }
}



    
    






