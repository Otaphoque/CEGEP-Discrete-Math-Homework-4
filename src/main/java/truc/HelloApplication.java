package truc;

import java.io.IOException;

public class HelloApplication {
    
    public static void main(String[] args) {
        Question1 question1 = new Question1();
        Question2 question2 = new Question2();
        Question3 question3 = new Question3();
        Question4 question4 = new Question4();

//        int q1 = question1.EuclidGCD(234, 7630);
//        System.out.println("Euclid says the Greatest Common Divisor is : " + q1);

        //question2

//        int q31 = question3.AddBinaries("1010111", "10100");
//        System.out.println("The sum of 1010111 and 10100 is : " + q31);

        int q32 = question3.AddBinaries("10011", "11010");
        System.out.println("\nThe sum of 10011 and 11010 is : " + q32);

        //question4

    }
}

// À ENLEVER AVANT DE REMETTRE À LA PROF
// https://www.geeksforgeeks.org/euclidean-algorithms-basic-and-extended/

// OUBLIEZ PAS DE COMMENTER LES GENS