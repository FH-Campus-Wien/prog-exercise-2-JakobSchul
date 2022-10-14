package at.ac.fhcampuswien;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;  // Import the Scanner class


public class App {
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object

    public App() {


    }

    //todo Task 1
    public void largestNumber() {


        double biggestNum = 0d;

        for (int i = 1; ; i++) {
            System.out.print("Number " + i + ": ");
            double num1 = scanner.nextDouble();

            if (num1 <= 0) {
                if (biggestNum != 0) {

                    //                    String formattedString = String.format("%.02f", biggestNum);
                    System.out.printf("The largest number is " + "%.2f" +System.lineSeparator(), biggestNum);
                    return;
                }
                System.out.println("No number entered.");
                return;
            }

            if (num1 > biggestNum) {
                biggestNum = num1;


            }
        }
    }

    //todo Task 2
    public void stairs() {
        // input your solution here
        System.out.print("n: ");
        int num1 = scanner.nextInt();
        int abc = 1;


        if (num1 <= 0) {
            System.out.println("Invalid number!");
        }

        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++, abc++) {
                System.out.print(abc + " ");
            }
            System.out.println();
        }


    }


    //todo Task 3
    public void printPyramid() {
        int reihen = 6;

        for (int a = 0; a < reihen; a++) {

            for (int i = 4; i >= a; i--) {
                System.out.print(" ");
            }

            for (int st = 0; st < a * 2 + 1; st++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }


// input your solution here


    //todo Task 4
    public void printRhombus() {

        int höhe = 0;
        int spalte = -1;
        int richtung = 1;
        for (int z = 1; z <= höhe; z++) {
            if (z >= höhe / 2 + 2) {
                spalte = -2;
            } else spalte = 2;
            spalte += spalte;
            for (int buchstabe = 1; buchstabe <= spalte; buchstabe++) {
                System.out.println("g");
            }


        }


        // input your solution here
    }

    //todo Task 5
    public void marks() {

        Scanner scanner1 = new Scanner(System.in);
        double summe = 0;      // Sum of marks
        int inpt = 1;       //Nummerierung der Note
        int negatife = 0;   // neg. marks
        int stop = 0;

        while (stop != 1) { //stop = ende und Ausgabe von Durchschnitt
            System.out.print("Mark " + inpt + ": ");
            int mark = scanner.nextInt();
            if (mark > 5 || mark < 0) {             // wenn 5er oder 0niedriger0 = Invalid
                System.out.println("Invalid mark!");
            }
            if (mark <= 4 && mark >= 1) {
                summe = summe + mark;
                inpt = inpt + 1;   //wieviele marks habe ich schon counter
            }
            if (mark == 5) {
                summe = summe + 5;
                inpt = inpt + 1;
                negatife++;
            }
            if (mark == 0 && inpt <= 1) {
                System.out.println("Average: 0.00");
                System.out.println("Negative marks: 0");
                break;
            }
            if (mark == 0 && inpt != 1) {
                double avg = 0;
                avg = summe / (inpt - 1);
                System.out.println("Average: " + String.format("%.2f", avg));
                System.out.println("Negative marks: " + negatife);
                stop = stop + 1;
            }
        }
    }

    //todo Task 6
    public void happyNumbers() {
        //     int summe = 0;
        //   int nummer = 0;

        // while (nummer != 1) {

        //     int remainder = nummer % 10;
        //    summe = summe + (remainder * remainder);
        //  nummer = nummer / 10;


        //}
    }

    public static void main(String[] args) {
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}
