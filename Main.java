package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String Names[] = new String[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 5 names ");

        for(int i = 0; i < 5; i++){

            Names[i] = scanner.nextLine();

        }

        while(true){

            System.out.println("Please enter index");

            int index = scanner.nextInt();

            if(index != 0){
                System.out.println("Index " + index-- + " has name " + Names[index--]);
            }else{
                break;
            }
        }

        System.out.println("THE END");

        //Write program asks you to input 5 names and then asks you to input number from 1 up to 5 and prints name according its index in array
        //Add this: -  Program asks to input while - Exit program by pressing 0


    }
}
