package isp.lab2.Exercise5EvenOddSearch;
import java.util.*;
import java.lang.*;
import java.util.Scanner;



 class Exercise5EvenOddSearch {

    public  int[] findEvenOdd(String input) {
        String[] num = input.split("[,]", 0);
        int even =Integer.MIN_VALUE;
        int odd = Integer.MAX_VALUE;
        int ieven = 0;
        int iodd = 0;
        for (int i = 0; i< num.length; i++) {
            int nr = Integer.parseInt(num[i].trim());
            if(nr%2==0 && nr>even)
            {
                even = nr;
                ieven = i;
            }
            else if(nr%2!=0 && nr<odd)
            {
                odd = nr;
                iodd = i;
            }
        }


        return new int[]{even,ieven,odd,iodd};
    }

    public  String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        return scanner.nextLine();
    }

}


    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }

