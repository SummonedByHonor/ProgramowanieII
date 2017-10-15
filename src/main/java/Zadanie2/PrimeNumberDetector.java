package Zadanie2;

import java.util.Scanner;

public class PrimeNumberDetector {

    private static boolean isNumberPrime(Integer numberToCheck){
       for (int i = 2; i<numberToCheck; i++){
           if (numberToCheck % i == 0){
               return false;
           }
        }
        return true;
    }

    public static int getThenearestPrimeNumber(Integer inputNumber){
        int higherPrimeNumber = 0;
        int lowerPrimeNumber = 0;
        int counterOfHigerNumberDistance = 0;
        int counterOfLowerNumberDistance = 0;

        for (int i = inputNumber - 1; i > 0; i--){
            counterOfLowerNumberDistance++;
            if (isNumberPrime(i)){
                lowerPrimeNumber = i;
                break;
            }
        }

        for (int i = inputNumber + 1; true; i++ ){
            counterOfHigerNumberDistance++;
            if(isNumberPrime(i)){
                higherPrimeNumber = i;
                break;
            }
        }

        if (counterOfHigerNumberDistance <= counterOfLowerNumberDistance){
            return higherPrimeNumber;
        } else return lowerPrimeNumber;
    }

    public static void main(String[] args) {
        System.out.println(getThenearestPrimeNumber(45));
    }
}
