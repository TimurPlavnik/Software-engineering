package com.company;
import java.util.Scanner;

public class Version_2 {
    public static void start_random() {

        System.out.println("Random seed the generator (y/n)?");
        String a=input_analyser();
        if( a.equals("y")) {
            double x = Math.random();
            int y= (int) (x*1000);
            System.out.println(y);
            ongoing_random();
        }
    }
    private static void ongoing_random() {
        System.out.println("Another random number? (y/n)?");
        String a=input_analyser();
        if( a.equals("y")) {
            double x = Math.random();
            int y= (int) (x*1000);
            System.out.println(y);
            ongoing_random();
        }
    }

    private static String input_analyser(){
        Scanner reader = new Scanner(System.in);
        String n = reader.nextLine();
        if (n.equals("y")){
            String a="y";
            return a;
        }else if (n.equals("n")){
            String a="n";
            return a;
        }else{
            System.out.println("Choose another character");
            String a=input_analyser();
            return a;
        }
    }
}
