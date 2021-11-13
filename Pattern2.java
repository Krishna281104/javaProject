class Pattern2{
    public static void main(){
        int index=1,flag=0;
        for(int i=1;i<=7;i++){
            for(int j=1;j<=index;j++){
                System.out.print("*");
            }
            if(i==4)
              flag=1;
            if(flag==1)
              index--;
            else
               index++;
            System.out.println();  
        }
    }
}