package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// java program to find average marks  of five subjects

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of five subjects");
        int c = 0;
        int sum = 0;
        for(int i=0;i<5;i++){
            c = sc.nextInt();
            sum+=c;
        }
        System.out.println((float)sum/5);
    }
}

