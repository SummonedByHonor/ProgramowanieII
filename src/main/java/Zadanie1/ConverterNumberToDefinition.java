package Zadanie1;

import java.util.HashMap;
import java.util.Scanner;

public class ConverterNumberToDefinition {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        HashMap<Integer, String> indexOnesses = new HashMap<>();

        indexOnesses.put(1, "jeden");
        indexOnesses.put(2, "dwa");
        indexOnesses.put(3, "trzy");
        indexOnesses.put(4, "cztery");
        indexOnesses.put(5, "pięć");
        indexOnesses.put(6, "sześć");
        indexOnesses.put(7, "siedem");
        indexOnesses.put(8, "osiem");
        indexOnesses.put(9, "dziewięć");

        HashMap<Integer, String> indexTens = new HashMap<>();
        indexTens.put(1, "naście");
        indexTens.put(2, "dwadzieścia");
        indexTens.put(3, "trzydzieści");
        indexTens.put(4, "czterdzieści");
        indexTens.put(5, "pięćdziesiąt");
        indexTens.put(6, "sześćdziesiąt");
        indexTens.put(7, "siedemdziesiąt");
        indexTens.put(8, "osiemdziesiąt");
        indexTens.put(9, "dziewięćdziesiąt");
        indexTens.put(0, "");


        System.out.println("Podaj liczbę:");
        String enteredNumber = scanner.nextLine();
        Integer oneAsInt = Character.getNumericValue(enteredNumber.charAt(0));
        Integer tenAsInt = 0;
        if (enteredNumber.length() > 1) {
            tenAsInt = Character.getNumericValue(enteredNumber.charAt(1));
        }


        if (enteredNumber.length() == 2) {
            if (enteredNumber.equals("10")) {
                System.out.println("dziesięć");
            } else if (enteredNumber.charAt(0) == 1) {
                System.out.println(indexTens.get(oneAsInt) + indexTens.get(1));
            } else if (enteredNumber.equals("20")) {
                System.out.println(indexTens.get(2));
            } else if (enteredNumber.equals("30")) {
                System.out.println(indexTens.get(3));
            } else if (enteredNumber.equals("40")) {
                System.out.println(indexTens.get(4));
            } else if (enteredNumber.charAt(0) != 1) {
                if (enteredNumber.charAt(1) != '0')
                    System.out.println(indexTens.get(tenAsInt) + " " + indexOnesses.get(oneAsInt));
                else {
                    System.out.println(indexTens.get(oneAsInt));
                }
            }
        } else if (enteredNumber.length() == 1) {
            System.out.println(indexOnesses.get(oneAsInt));
        }
    }


}
