package truc;

import java.util.Scanner;

public class Question1 {

    public Question1() {
    }

    public int EuclidGCD(int number1, int number2) {
        int small, big;
        if (number1 < number2) {
            small = number1;
            big = number2;
        } else if (number1 > number2) {
            small = number2;
            big = number1;
        } else {
            return number1;
        }
        return 0;
    }
}
