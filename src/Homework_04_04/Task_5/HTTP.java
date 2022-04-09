package Homework_04_04.Task_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public enum HTTP {
    Error400("Bad Request"),
    Error401("Unauthorized"),
    Error402("Payment Required"),
    Error403("Forbidden"),
    Error404("Not Found"),
    Error405("Method Not Allowed"),
    Error406("Not Acceptable"),
    Error407("Proxy Authentication Required"),
    Error408("Request Timeout"),
    Error409("Conflict"),
    Error410("Gone");

    private String errorContent;

    HTTP(String errorContent){
        this.errorContent = errorContent;
    }

    public String getErrorContent(){
        return errorContent;
    }

    public void inputNumberOfRequest() throws IOException {
        System.out.println("Task#5_A_3");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short number = Short.parseShort(br.readLine());
        try{
            if(number < 400 || number > 410){
                System.out.println("Error Code");
                return;
            }
            else{
                String str = "Error" + String.valueOf(number);
                HTTP http =  HTTP.valueOf(str);
            }

        }catch (NumberFormatException e){
            System.out.println("Input String cannot be parsed to Integer.");
            System.out.println(e.getMessage());
        }


    }

    public static void method() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short number = Short.parseShort(br.readLine());
        try{
            if(number < 400 || number > 410){
                System.out.println("Error HTTP Code");
                return;
            }
            else{
                String str = "Error" + number;
                HTTP http =  HTTP.valueOf(str);
                System.out.println(http.getErrorContent());
            }

        }catch (NumberFormatException e){
            System.out.println("Input String cannot be parsed to Integer.");
            System.out.println(e.getMessage());
        }
    }

}
