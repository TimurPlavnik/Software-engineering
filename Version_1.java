package com.company;
import java.util.Scanner;

public class Version_1 {
    public static void start_random() {

        System.out.println("Random seed the generator (y/n)?");
        Scanner reader = new Scanner(System.in);
        String n = reader.nextLine();
        if( n.equals("y")) {
            System.out.println(786);
        }
    }

}
