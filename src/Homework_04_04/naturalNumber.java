package Homework_04_04;

public class naturalNumber {
    public void result(int n){
        System.out.println("Task#2 : n = " + n);
        if (n <= 0){
            System.out.println("n mus be > 0");
            return;
        }
        numberThree(n);
        reverse(n);
        replace(n);
        add1(n);
    }

    private void numberThree(int n){
        int nn = n * n;
        System.out.print("Number 3 in " + nn);
        do{
            if (nn % 10 == 3){
                System.out.println(" + ");
                return;
            }
            nn /= 10;
        } while (nn > 0);
        System.out.println(" - ");
    }

    private void reverse(int n){
        System.out.print("Reverse : ");
        String str = String.valueOf(n);
        StringBuilder reverse_str = new StringBuilder();
        reverse_str.append(str);
        reverse_str.reverse();
        System.out.println(reverse_str);
    }

    private void replace(int n){
        System.out.print("Replace : ");
        String str = String.valueOf(n);
        if (str.length() < 2){
            System.out.println(str);
            return;
        }
        String new_str = str.substring(str.length() - 1) + str.substring(1, str.length() - 1)
                + str.substring(0, 1);
        System.out.println(new_str);
    }

    private void add1(int n){
        System.out.print("Add 1 : ");
        String str = String.valueOf(n);
        String new_str = 1 + str.substring(0, str.length()) + 1;
        System.out.println(new_str);
    }
}
