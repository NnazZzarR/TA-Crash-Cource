package Homework_04_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FifthTaskAItem {
    public void AFirstItem() throws IOException {
        System.out.println("Task#5_A_1)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float arr[] = new float[3];
        for(byte i = 0; i < 3; i++){
            System.out.println("Input " + (i + 1) + " float number");
            float number = Float.parseFloat(br.readLine());
            try{
                arr[i] = number;
            }catch (NumberFormatException e){
                System.out.println("Input String cannot be parsed to Float.");
                System.out.println(e.getMessage());
            }
        }
        for (byte i = 0; i < 3; i++){
            if(arr[i] > -5 && arr[i] < 5){
                System.out.println(arr[i] + " belong to range (-5;5)");
            }
            else
                System.out.println(arr[i] + " doesn`t belong to range (-5;5)");
        }
    }

    public void ASecondItem() throws IOException {
        System.out.println("Task#5_A_2)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short arr[] = new short[3];
        for(byte i = 0; i < 3; i++){
            System.out.println("Input " + (i + 1) + " integer number");
            short number = Short.parseShort(br.readLine());
            try{
                arr[i] = number;
            }catch (NumberFormatException e){
                System.out.println("Input String cannot be parsed to Integer.");
                System.out.println(e.getMessage());
            }
        }
        Arrays.sort(arr);
        System.out.println("min number : " + arr[0]);
        System.out.println("max number : " + arr[2]);
    }
}
