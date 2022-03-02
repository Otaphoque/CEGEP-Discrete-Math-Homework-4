package truc;

public class Question1 {

    public Question1() {
    }

    public int EuclidGCD2(int number1, int number2) {
        int result = 0;

        while (number1 != number2) {    // This function works so that it subtracts the smaller number to the larger
            if (number1 > number2) {            // Until both number are the same
                number1 -= number2;
                result = number1;
            } else {
                number2 -= number1;
                result = number2;
            }
        }
        return result;
    }
}