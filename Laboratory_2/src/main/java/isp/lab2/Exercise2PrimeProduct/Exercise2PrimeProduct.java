package isp.lab2.Exercise2PrimeProduct;

import java.util.Scanner;

public class Exercise2PrimeProduct {
    public static void prime(int m, int n) {



        while (m < n) {
            boolean flag = false;

            for(int i = 2; i <= m/2; ++i) {
                // condition for nonprime number
                if(m % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && m != 0 && m != 1)
                System.out.print(m + " ");

            ++m;
        }
    }



    /**
     * This method should return the product of the first n prime numbers
     * @param n
     * @param m
     * @return
     */
    public static long getPrimeProduct(int n, int m) {

        long p = 1;
        int i,j,isPrim;
        for(i = n; i <= m; i++){
            isPrim = 1;
            for(j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrim = 0;
                    break;
                }
            }
            if(isPrim == 1) p = p * i;
        }
        return p;
    }

    /**
     * This method should read from the console a number
     * @return the number read from the console
     */
    public static int readfromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args) {
        System.out.println("The product of the first 10 prime numbers is: " + getPrimeProduct(1, 10));
        System.out.println("The product of prime numbers between m and n: " + getPrimeProduct(readfromConsoleInt(), readfromConsoleInt()));
    }

}
