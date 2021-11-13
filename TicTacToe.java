import java.util.*;
class TicTacToe
{
    Scanner sc=new Scanner(System.in);
    public static void main()
    {
     TicTacToe obj=new TicTacToe();
       String board[][]=obj.getBoard();
       obj.print(board);
      
        int tictac[][]=new int[3][3];
        boolean flag=true;
      
        boolean result=true;
        while(result)
        {
            if(flag){
                System.out.println("Player 1 Chance");
                int input[]=obj.acceptInput();
                int row=input[0]-1;
                int col=input[1]-1;
                tictac[row][col]=1;
                result=obj.checkWinner(tictac,1);
                obj.tictacToBoardConveter(row,col,board,1);
            }
            else
            {
               System.out.println("Player 2 Chance");
                int input[]=obj.acceptInput();
                int row=input[0]-1;
                int col=input[1]-1;
                tictac[row][col]=2; 
                result=obj.checkWinner(tictac,2);
                obj.tictacToBoardConveter(row,col,board,2);
            }
            if(!result)
            {
                obj.print(board);
                break;
            }
            result=obj.checkDraw(tictac);
            flag=!flag;
            obj.print(board);
        }
    }
    public void tictacToBoardConveter(int row,int col,String board[][],int player)
    {
        int r=row*2;
        int c=col*2;
     if(player==1)
     {
        board[r][c]="X";
     }
     else
     {
          board[r][c]="O";
     }
    }
    public boolean checkDraw(int tictac[][])
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(tictac[i][j]==0)
                  return true;
            }
        }
        System.out.println("No Moves !  Match is drawn"); 
        return false;
    }
    public boolean checkWinner(int tictac[][],int player)
    {
        if(tictac[0][0]==player && tictac[1][0]==player && tictac[2][0]==player)
        {
          System.out.println("Player"+player+" Win");
          return false;
        }
        if(tictac[0][1]==player && tictac[1][1]==player && tictac[2][1]==player){
          System.out.println("Player"+player+" Win");
          return false;
        }
        if(tictac[0][2]==player && tictac[1][2]==player && tictac[2][2]==player){
          System.out.println("Player"+player+" Win");
          return false;
        }
        if(tictac[0][0]==player && tictac[0][1]==player && tictac[0][2]==player){
          System.out.println("Player"+player+" Win");
          return false;
        }
        if(tictac[1][0]==player && tictac[1][1]==player && tictac[1][2]==player){
          System.out.println("Player"+player+" Win");
          return false;
        }
        if(tictac[2][0]==player && tictac[2][1]==player && tictac[2][2]==player){
          System.out.println("Player"+player+" Win");
          return false;
        }
        if(tictac[0][0]==player && tictac[1][1]==player && tictac[2][2]==player){
          System.out.println("Player"+player+" Win");
          return false;
        }
        if(tictac[0][2]==player && tictac[1][1]==player && tictac[2][0]==player){
          System.out.println("Player"+player+" Win");
          return false; 
        }
          return true;
    }
    public  int[] acceptInput()
    {
                System.out.println("Enter the row");
                int row=sc.nextInt();
                System.out.println("Enter the column");
                int col=sc.nextInt();
                int input[]={row,col} ;
                return input;
    }
    public  void print(String board[][])
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(board[i][j]+"");
                if(j==1||j==3)
                continue;
            }
            System.out.println();
        }
        System.out.println();
       
    }
    public String[][] getBoard(){
            String board[][]=new String[5][5];
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++)
                {
                    if(i==3||i==1){
                        board[i][j]="-";
                    }
                    else{
                    if(j==1||j==3)
                    board[i][j]="|";
                    else
                    board[i][j]=" ";
                }
                }
            }
            return board;
        }
}