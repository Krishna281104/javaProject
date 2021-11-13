import java.util.*;
class max
{
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        int marks[]=new int[10];
        for(int i=0;i<10;i++)
        {
            marks[i]=sc.nextInt();
        }
        int max=marks[0];
        for(int i=0;i<10;i++)
        {
            if(max<marks[i])
            max=marks[i];
        }
        System.out.println(max);
    }
}

