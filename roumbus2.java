class roumbus2
{
    public static void main(){
        int sp=3,c=1,a=1;
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            int cnt=0;
            for(int k=1;k<=c;k++){
                if(k<=a)
                  cnt++;
                else
                  cnt--;
                System.out.print(cnt+" ");  
            }
            if(i<4)
            {
                a++;
                c=c+2;
                sp--;
            }
            else
            {
                a--;
                c=c-2;
                sp++;
            }
            System.out.println();
        }
        
    }
}