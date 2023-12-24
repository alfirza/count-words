package id.co.fasyah;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* create scanner instance for input */
        Scanner scanner = new Scanner(System.in);
        System.out.println(String.format("Enter the File path or use sample file in (%s): ",
                System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "list_names.txt"));
        String fileName = scanner.nextLine();

        Result result = countTheWords(fileName);
        /* print out the result of count and words */
        System.out.println("Count of words start with M : " + result.getCount());
        System.out.println("Longer than 5 Characters : " + result.getLongestThan5());
    }

    public static Result countTheWords(String fileName) {
        /* initialize the variable that will return */
        Result result = new Result();
        int count = 0;
        List<String> longerThan5 = new ArrayList<>();

        try {
            String line;
            /* read words from an input stream */
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            /* loop the words from file */
            while ((line = br.readLine()) != null) {
                /* business rule for counting the number of words that start with 'M' or 'm' by uppercasing the words*/
                if (line.toUpperCase().startsWith("M")) {
                    count++;
                }
                /* business rule for keep the words that longer than 5 chars */
                if (line.length() > 5) {
                    longerThan5.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException e) {
            System.out.println("Error reading file '" + fileName + "'");
        }

        result.setCount(count);
        result.setLongestThan5(longerThan5);
        return result;
    }
}