package truc;

import java.io.IOException;

public class HelloApplication {
    
    public static void main(String[] args) {
        System.out.println("Patate");

        Question1 question1 = new Question1();
        Question2 question2 = new Question2();
        Question3 question3 = new Question3();
        Question4 question4 = new Question4();

        int q1 = question1.EuclidGCD(5, 5);
        System.out.println("Euclid says the Greatest Common Divisor is : " + q1);
    }
}