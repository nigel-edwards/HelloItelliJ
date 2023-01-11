package hello;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ToDo Add some stuff in main
        System.out.println("Hello world!");
        Scanner keyboard = new Scanner(System.in);
        int num = 0;
        try {
            System.out.print("Please enter an integer: ");
            num = keyboard.nextInt();
        }
       catch (Exception ex)
       {
           System.out.println(ex.getMessage());
       }

        System.out.println(num);
    }
}