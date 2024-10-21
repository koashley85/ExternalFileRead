import java.io.*;
import java.util.Scanner;
//This program was created by Kavion Ashley
// 10-20-2024
// This program reads values from an external file
// and tells you the total amount of numbers and calculate the average.

public class Main {
    public static void main(String[] args) throws IOException{
        System.out.println("Hello and welcome!\n");
        int num, total=0, smallest=9999, largest=0;
        double average = 0.0,counter = 0.0;
        File myFile = new File("integer.dat");
        Scanner inputFile = new Scanner(myFile);
        do {
            num = inputFile.nextInt();

            if(num > 0) {
                total += num;
                counter++;
                if (largest < num){
                    largest = num;
                };
            //    System.out.println(largest);

                if (smallest > num){
                    smallest = num;
                };
            }
        }
        while (num != -1);

        average = total/counter;
        System.out.printf("The amount of values included in file is %.0f \n", counter);
        System.out.printf("The average of values included in file is %.2f \n", average);
        System.out.println("The smallest values included in file is " + smallest);
        System.out.printf("The largest values included in file is " + largest);
        inputFile.close();
        };
    }