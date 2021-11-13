
import java.util.*;
class evenodd
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        } 
        sum(arr);
    }
    public static void sum (int arr[])
        {
         int even=0;
         int odd=0;
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i]%2==0)
             even+=arr[i];
             else
             odd+=arr[i];
         }
            System.out.println("sum of even number"+even);
            System.out.println("sum of odd number"+odd);
        }
    }