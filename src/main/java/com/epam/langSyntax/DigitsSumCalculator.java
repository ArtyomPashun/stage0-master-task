package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int counter = 0;
        String str = Integer.toString(number);
        String[] subStr = str.split("");
        for (String s : subStr) {
            counter += Integer.parseInt(s);
        }
        System.out.println(counter);
    }
}
