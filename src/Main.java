import Homework_04_04.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static Homework_04_04.HTTP.method;
import static Homework_04_04.Dog.theOldestDog;

public class Main {
    public static void main(String[] args) throws IOException {
        // homework 04.04
        /*
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


        FifthTaskAItem ft = new FifthTaskAItem();
        ft.ASecondItem();

        method();

*/
        Dog s = new Dog("DD", 12, Dog.Breed.Akita);
        Dog f = new Dog("DD", 14, Dog.Breed.Dorgi);
        Dog x = new Dog("SS", 19, Dog.Breed.Boxer);
        System.out.println(s.equals(f));
        System.out.println(s.equals(x));
        System.out.println(f.equals(x));
    }
}