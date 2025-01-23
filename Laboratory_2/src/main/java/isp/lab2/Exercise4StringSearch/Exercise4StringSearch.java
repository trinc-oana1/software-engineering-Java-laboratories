package isp.lab2.Exercise4StringSearch;

import java.util.Scanner;

public class Exercise4StringSearch {
    /**
     * This method should return an array of strings that contain the substring.
     * @param input
     * @param substring what to search for
     * @return
     */

    public static String[] searchSubstrings(String input, String substring) {
        int i,j = 0;
        String[] splitInput = input.split(",");
        String[] containSub = new String[10];
        for(i = 0; i < splitInput.length; i++) {
            if(splitInput[i].contains(substring)) {
                containSub[j] = splitInput[i];
                j++;
            }
        }
        return containSub;
    }

    public static String readFromConsole(String suffix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + suffix);
        return scanner.nextLine();
    }


    public static void main(String[] args) {
        String input = "apples,computer,bread,tea,car"; // = readFromConsole("words");
        String substring = "te"; // = readFromConsole("substring");
        String[] result = searchSubstrings(input, substring);
        for (String string : result) {
            if(string != null) System.out.println(string);
        }
    }
}

