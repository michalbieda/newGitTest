package com.zulusek;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię 1");
        String name1 = scan.nextLine();
        System.out.println("Podaj imię 2");
        String name2 = scan.nextLine();

        if (name1.equals(name2)){
            System.out.println("Takie same imiona");
        }
        else {
            System.out.println("Imiona się różnią");
        }



        File file = new File("files/zulusek.t");
        System.out.println(file.getAbsolutePath());


        System.out.println("What's your callsign? ");
        String callsign = scan.nextLine();

        System.out.println("Your age:");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("What's your sex?");
        String sex = scan.nextLine();

        System.out.println("Hello " + callsign + ".\nWould you like to add your callsign to 'QRZ CALL'? Y/N");
        String saveToDb = scan.nextLine();

        if (saveToDb.equals("y")){

            System.out.println("tylko info że poszło OK");


        }
        else {
            System.out.println("not OK");
        }
    }


}
