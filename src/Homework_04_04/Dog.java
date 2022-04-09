package Homework_04_04;


import java.util.Objects;

public class Dog {
    private int age;
    private String name;
    private static Dog DOG;
    public enum Breed{
        Akita,
        Beabull,
        Boxer,
        Chipin,
        Dorgi,
        Goldador,
        Puli;
    }
    Breed breed;
    public Dog(String name, int age, Breed breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public int ageDog(){
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    public static Dog theOldestDog(){
        int maxAge = 0;
        if(Dog.DOG.age > maxAge){
            maxAge = DOG.ageDog();
        }
        return Dog.DOG;
    }

    @Override
    public String toString() {
        return this.name + " " + this.breed;
    }

}
