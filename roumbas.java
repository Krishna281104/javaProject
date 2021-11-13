class roumbas
{
    public static void main()
    {
        int sp=4;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=sp;j++)
               System.out.print("  ");
            for(int k=1;k<=i;k++)
               System.out.print("*   ");  
             sp--; 
             System.out.println();
        }
        sp=1;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=sp;j++)
            System.out.print("  ");
            for(int k=4;k>=i;k--)
            System.out.print("*   ");
            sp++;
            System.out.println();
        }
    }
}