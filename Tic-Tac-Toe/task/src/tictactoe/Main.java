package tictactoe;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       int f=0;
       int f1=0;
       int f2=0;
       char ar[]=new char[s.length()];
       int i[]=new int[s.length()];
       for(int x=0;x<=s.length()-1;x++)
       {
           ar[x]=s.charAt(x);
       }
       for(int x=1;x<=5;x++)
       {
           for(int y=1;y<=9;y++)
           {
               if(x==1 || x==5)
               {
                   System.out.print("-");
               }
               else if(y==1 || y==9)
               {
                   System.out.print("|");
               }
               else if(y>=2 && y<=8)
               {
                   if(f==0 && x==2)
                   {
                       System.out.print(" "+ar[0]+" "+ar[1]+" "+ar[2]+" ");
                       f=1;
                   }
                   else if(f1==0 && x==3)
                   {
                       System.out.print(" "+ar[3]+" "+ar[4]+" "+ar[5]+" ");
                       f1=1;
                   }
                   else if(f2==0 && x==4)
                   {
                       System.out.print(" "+ar[6]+" "+ar[7]+" "+ar[8]+" ");
                       f2=1;
                   }
                   else
                   {
                   }
               }
               else
               {
               }
           }
           System.out.println();
       }
       for(int x=0;x<s.length();x++)
       {
           i[x]=(int)ar[x];
       }
       boolean r=false;
       int c1=0;
       int c2=0;
       for(int e:i)
       {
           if(e==95)
           {
               r=true;
           }
           if(e==88)
           {
               c1++;
           }
           else if(e==79)
           {
               c2++;
           }
       }
       if((((i[0]+i[1]+i[2])==264 || (i[0]+i[3]+i[6])==264 || (i[0]+i[4]+i[8])==264 || (i[3]+i[4]+i[5])==264 || (i[6]+i[7]+i[8])==264 || (i[1]+i[4]+i[7])==264 || (i[2]+i[5]+i[8])==264 || (i[2]+i[4]+i[6])==264) && ((i[0]+i[1]+i[2])==237 || (i[0]+i[3]+i[6])==237 || (i[0]+i[4]+i[8])==237 || (i[3]+i[4]+i[5])==237 || (i[6]+i[7]+i[8])==237 || (i[1]+i[4]+i[7])==237 || (i[2]+i[5]+i[8])==237 || (i[2]+i[4]+i[6])==237)) || c1-c2>=2 || c2-c1>=2)
       {
           System.out.println("Impossible");
       }
       else if((i[0]+i[1]+i[2])==264 || (i[0]+i[3]+i[6])==264 || (i[0]+i[4]+i[8])==264 || (i[3]+i[4]+i[5])==264 || (i[6]+i[7]+i[8])==264 || (i[1]+i[4]+i[7])==264 || (i[2]+i[5]+i[8])==264 || (i[2]+i[4]+i[6])==264)
       {
            System.out.println("X wins");
       }
       else if((i[0]+i[1]+i[2])==237 || (i[0]+i[3]+i[6])==237 || (i[0]+i[4]+i[8])==237 || (i[3]+i[4]+i[5])==237 || (i[6]+i[7]+i[8])==237 || (i[1]+i[4]+i[7])==237 || (i[2]+i[5]+i[8])==237 || (i[2]+i[4]+i[6])==237)
       {
           System.out.println("O wins");
       }
       else if(!r)
       {
           System.out.println("Draw");
       }
       else
       {
           System.out.println("Game not finished");
       }

    }
}
