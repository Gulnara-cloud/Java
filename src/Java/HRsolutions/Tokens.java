package Java.HRsolutions;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Tokens {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();

            scan.close();
            String[] strings = s.trim().split("[^A-Za-z]+");
            if (s.trim().isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(strings.length);
                for (String item : strings) {
                    System.out.println(item);
                }
            }
        }
    }



