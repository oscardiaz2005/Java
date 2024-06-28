import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int minorTime = 3000;
        int mayorTime = -34;
        Scanner x = new Scanner(System.in);
        System.out.println("welcome , please enter the number of competitors in the race");
         int amount=x.nextInt();
         while (amount<=0){
             System.out.println("please enter a result bigger than o ");
             amount= x.nextInt();
         }

        int competitors[] = new int[amount];
        System.out.println("please enter the time of each competitor ");
        for (int i = 0; i<competitors.length;i++){
            System.out.println("what was the time of the competitor number " + (i+1) + " ?");
            competitors[i]=x.nextInt();
            while (competitors[i]<=0){
                System.out.println("please enter a result bigger than o ");
                competitors[i]=x.nextInt();
            }
            if (competitors[i]<minorTime){
                minorTime=competitors[i];
            }
            if (competitors[i] > mayorTime){
                mayorTime=competitors[i];
            }
        }
        int [] result ={ amount , mayorTime ,minorTime};

        System.out.println("the number of competitor is " + (competitors.length+1));
        System.out.println( "the minor time was " + minorTime);
        System.out.println( "the mayor time was " + mayorTime);
        System.out.println(Arrays.toString(result));




    }
}