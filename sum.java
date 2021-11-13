import java.util.*;
class sum
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n=sc.nextInt();
        
    }
    public static int sum (int n)
    {
        int sum=0;
        while(n>0)
        {int rem=n%10;
         sum=sum+rem*rem*rem;
         n=n/10;
        }
    return sum;
}
}