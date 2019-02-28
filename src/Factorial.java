import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        System.out.println("Ingrese numero: ");
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();

        if(input>=0&&input<=100){
            System.out.println(doFactorial(input,input));
        }else{
            System.out.println("Numero fuera de rango.");
        }
    }


    private static int doFactorial(int numero, int number){
        numero=numero*(number-1);
        number-=1;

        if(number==1){
            return numero;
        }else{

            return doFactorial(numero,number);
        }
    }
}
