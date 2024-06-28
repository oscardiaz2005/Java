import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n1=0,n2=0,result=0;
        Scanner object=new Scanner(System.in);
        System.out.println("ingrese el primer numero ");
        n1=object.nextInt();
        System.out.println("ingrese el segundo numero ");
        n2=object.nextInt();

        result=n1+n2;

        System.out.println("el resultado de la operacion es = " + result);


}
}
