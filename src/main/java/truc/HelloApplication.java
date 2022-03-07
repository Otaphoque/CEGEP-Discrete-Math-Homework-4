package truc;

import java.io.IOException;

public class HelloApplication {

    public static void main(String[] args) {
        Question1 question1 = new Question1();
        Question2 question2 = new Question2();
        Question3 question3 = new Question3();
        Question4 question4 = new Question4();

        int q1 = question1.EuclidGCD2(3, 24);
        System.out.println("Euclid says the Greatest Common Divisor between 3 and 24 is : " + q1 + "\n");

        String q2 = question2.TransformBase(7, "14261", 16);
        System.out.println("The number 14261 in base 7 is equal to " + q2 + " in base 16\n");

        String q31 = question3.AddBinaries("1110111", "111100");
        System.out.println("The sum of 1110111 and 111100 is : " + q31 + "\n");

        String q4 = question4.MultiBinaries("11001010100101", "1001010011110");
        System.out.println("The product of 11001010100101 and 1001010011110 is " + q4);
    }
}