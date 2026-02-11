/**
 *  Write a Java program that reads an unspecified number of integers from the user 
 *  until the user enters -1. For each number, indicate whether it is odd or even. 
 *  After the user enters -1, print the count of even and odd numbers entered.
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number=0;
        int even =0;
        int odd=0;
        while(true){
            System.out.println("Give a number");
            number= Integer.valueOf(scanner.nextLine());
            if(number%2==0){
                System.out.println("Number is even");
                even++;
            } else if(number==-1)
                break;
            else{
                System.out.println("number is odd");
                odd++;
            }
        }
        System.out.println("There are "+even+" even numbers. There are "+odd+" odd numbers");

        }

    }

