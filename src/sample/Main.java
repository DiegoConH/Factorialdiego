package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        //primaryStage.show();
        System.out.println("Ingrese numero: ");
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();

        if(input>=0&&input<=100){
            System.out.println(doFactorial(input,input));
        }else{
            System.out.println("Numero fuera de rango.");
        }
    }


    public static void main(String[] args) {
        launch(args);
    }

    private int doFactorial(int numero,int number){
        numero=numero*(number-1);
        number-=1;

        if(number==1){
            return numero;
        }else{

            return doFactorial(numero,number);
        }
    }
}
