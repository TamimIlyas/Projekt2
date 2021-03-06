package com.h2;
import java.util.Scanner;
import java.util.Map;

public class BestLoanRates {

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hallo " + name);
        System.out.println("Enter the loan term (in years)");
        int loanTermInYears = scanner.nextInt();
        System.out.println("years" + loanTermInYears);

        System.out.println(getRates(loanTermInYears));
        scanner.close();
    }

    public static final Map<Integer, Float> bestRates = Map.of(1, 5.50f, 2, 3.45f, 3, 2.67f);

    public static float getRates(int loanTermInYears) {
        if (bestRates.containsKey(loanTermInYears)) {
            System.out.println("No available rates for term: " + loanTermInYears + "years");
            System.out.println("Best Available Rate: " + loanTermInYears + "%");
            return bestRates.get(loanTermInYears);

        }
        else {
            return 0.0f;
        }

    }

}
