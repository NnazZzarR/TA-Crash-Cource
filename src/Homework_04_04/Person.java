package Homework_04_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    private String name;
    private int birthYear;

    private String getName(){
        return name;
    }

    private int getBirthYear(){
        return birthYear;
    }

    public Person(){}

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    private int age(){
        return (2022 - getBirthYear());
    }

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input your name : ");
        try{
            name = br.readLine();
            if(name.length() == 0){
                throw new RuntimeException("Empty name");
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Input your birthday year: ");
        try{
            birthYear = Integer.parseInt(br.readLine());
            if (birthYear < 1900 || birthYear > 2022){
                System.out.println("Invalid birthday year");
                input();
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public void output(){
        System.out.println("Name of person : " + getName());
        System.out.println("Birthday : " + + getBirthYear());
        System.out.println("Age : " + age());
    }

    public void changeName(String newName){
        this.name = newName;
    }
}
