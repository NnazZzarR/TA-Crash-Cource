import Homework_04_04.ThirdTask;
import Homework_04_04.checkBrick;
import Homework_04_04.naturalNumber;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        // homework 04.04
        checkBrick first = new checkBrick();
        first.check(3, 2, 1, 1, 2);

        naturalNumber number = new naturalNumber();
        number.result(3852);

        ThirdTask task = new ThirdTask();
        try{
            task.firstItem();
            task.secondItem();
            task.thirdItem();
        }
        catch (IOException e){
            System.out.println("You input wrong value");
        }
    }
}
