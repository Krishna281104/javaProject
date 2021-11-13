
import java.util.*;
class min
{
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        int marks[]=new int[10];
        for(int i=0;i<10;i++)
        {
            marks[i]=sc.nextInt();
        }
        int min=marks[0];
        for(int i=0;i<10;i++)
        {
            if(min>marks[i])
            min=marks[i];
        }
        System.out.println(min);
    }
}