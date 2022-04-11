import Homework_04_04.Task_1.checkBrick;
import Homework_04_04.Task_2.naturalNumber;
import Homework_04_04.Task_3.ThirdTask;
import Homework_04_04.Task_4.Person;
import Homework_04_04.Task_5.*;
import static Homework_04_04.Task_5.HTTP.method;
import Homework_04_04.Task_6.Button;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // homework 04.04

        //Task#1
        checkBrick first = new checkBrick();
        first.check(3, 2, 1, 1, 2);

        //Task#2
        naturalNumber number = new naturalNumber();
        number.result(3852);

        //Task#3
        ThirdTask task = new ThirdTask();
        try{
            task.firstItem();
            task.secondItem();
            task.thirdItem();
        }
        catch (IOException e){
            System.out.println("You input wrong value");
        }
        //Task#4
        Person A = new Person();
        A.input();
        A.output();

        Person B = new Person("Dima", 2003);
        B.output();

        Person C = new Person("Kate", 2004);
        C.output();
        C.changeName("Olena");
        C.output();

        //Task#5
        FifthTaskAItem ft = new FifthTaskAItem();
        ft.AFirstItem();
        ft.ASecondItem();
        method();

        Dog s = new Dog("DD", 12, Dog.Breed.Akita);
        Dog f = new Dog("DD", 14, Dog.Breed.Dorgi);
        Dog x = new Dog("SS", 19, Dog.Breed.Boxer);
        System.out.println(s.equals(f));
        System.out.println(s.equals(x));
        System.out.println(f.equals(x));

        //Task#6
        Button loginButton = new Button();
        loginButton.setTextButton("Login");
        loginButton.setColorButton("Red");
        loginButton.setWidthButton(300);
        loginButton.setHeightButton(40);
        loginButton.setStatusButton(Button.statusButton.Default);
        System.out.println(loginButton);

        Button submitButton = new Button("Submit", "Green", 100, 35, Button.statusButton.Hover);
        System.out.println(submitButton.getTextButton());
        System.out.println(submitButton.getStatusButton());

        
    }
}