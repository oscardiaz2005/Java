import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] number = { 5,9, 7, 3,1,2,4};
        System.out.println(number [5]);
        System.out.println(Arrays.toString(number));
        int sum =  0;
        for ( int i = 0; i< number.length;i++){
            System.out.println(number [i] );
            sum  += number[i];
        }
        System.out.println(" ");
        System.out.println(sum);
        System.out.println(" ");

        for (int j : number){
            System.out.println( " - " + j);
        }
        String names[] = new String[5];
        names[2] ="viviana";

        Scanner x = new Scanner(System.in);
        for ( int i = 0 ; i < names.length;i ++){
            names[i] = x.nextLine();
        }

        for (String n : names){
            System.out.println(n);
        }
        // System.out.println( names[10]);

        //bidimensional arrays / matricees

        int [] [] matriz = { {2, 8, 6}, { 8, 4 ,3} , {5, 4, 0} }  ;
        for (int i = 0; i<matriz.length;i++){
            for (int j = 0 ; j<matriz[i].length ; j++){
                System.out.println( matriz[i] [j]);

            }
        }
        System.out.println("------------------------------------------");
        for (int[] fila : matriz){
            System.out.println(Arrays.toString(fila)); // print 3x3
            for (int col : fila){
                System.out.println(col);
            }
        }


    }
}