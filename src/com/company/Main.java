package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Podaj imię?");
        Scanner scan = new Scanner(System.in);
        String lastIndex = scan.nextLine();


        if (lastIndex.endsWith("a")){

            System.out.print("Twoja płeć to kobieta");
        }else{
            System.out.print("Twoja płeć to mężczyzna");
        }

    }


    }

