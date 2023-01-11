package hello;

import java.io.*;
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

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("test.txt"));
            writer.println("Hello World");
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            String line = null;
            // First line should be the Zoo's name
            String data = reader.readLine();
            reader.close();
            System.out.println(data);
            System.out.println(data);
        }
        catch(Exception ex)
        {
            System.out.println("couldn`t read the file");
            ex.printStackTrace();
        }
    }
}