package Homework_04_04;

public class checkBrick {
    public void check(int a, int b, int c, int x, int y){
        System.out.print("Task#1 : ");
        // a - width, b - length, c - height of brick
        // x - width, y - length of rectangle
        if (a <= 0 || b <= 0 || c <= 0 || x <= 0 || y <= 0){
            System.out.println("Variables must be > 0");
        }
        if (((x - a) >= 0 && (y - b) >= 0) || ((x - b) >= 0 && (y - a) >= 0 ) ||
        ((x - a) >= 0 && (y - c) >= 0) || ((x - c) >= 0 && (y - a) >= 0) ||
                ((x - c) >= 0 && (y - b) >= 0) || ((x - b) >= 0 && (y - c) >= 0)){
            System.out.println("Congratulation :)");
        }
        else {
            System.out.println("Error :(");
        }
    }
}
