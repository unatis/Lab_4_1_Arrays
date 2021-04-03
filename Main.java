package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String Names[] = new String[10];

        System.out.println("Please 10 people names: ");

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < Names.length; i++){

            Names[i] = scanner.nextLine();

        }

        System.out.println("Please enter name id: ");

        while(true){

            int index = scanner.nextInt();

            if(index != 0){
                System.out.println("Index " + index-- + " has Name " + Names[index--]);
            }else{
                break;
            }

            System.out.println("Please enter name id: ");
        }

        System.out.println("Exit");

    }

}
