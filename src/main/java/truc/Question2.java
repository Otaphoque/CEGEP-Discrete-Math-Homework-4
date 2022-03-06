package truc;

public class Question2 {

    public Question2() {}

    /***
     * PSEUDO CODE FOR QUESTION 2 :
     *
     * int base1
     * int number
     * int base2
     * int power
     * int coefficient
     *
     * Find the higher power base2 can take, so that if it is subtracted to number, number will not be negative
     * For every power i base2 can take (as previously found)
     *      Find the higher coefficient can be place in front of it before number goes negative
     *  Add that coefficient to the result String
     */

    public String TransformBase(int base1, int number, int base2) {
        int remainder = number;
        int power = 0;
        String resultString = "";
        int coefficientInt;
        String coefficientString;

        while ((number - (Math.pow(base2, power))) > 0) {       // Does base2^power and substracts it to number
            power++;                                                // If the number is negative, we found the highest power possible
        }                                                                                                   // (power -1 therefore)

        for (int i = power-1; i>=0; i--) {  // For every power possible
            int current = (int) Math.pow(base2, i);    // base2^n is called current in this loop
            coefficientInt = 0;
            while ((remainder - (coefficientInt*current)) >= 0) {   // Finding the highest coefficient possible before number goes negative
                coefficientInt++;                                           // Using a while loops, same strategy as when finding the max power
            }
            coefficientInt--;
            remainder -= (coefficientInt*current);      // Calculating the remainder for which we will have to use smaller power
            switch (Integer.toString(coefficientInt)) {     // For base 11 and higher, to convert numbers to letters
                case ("10"):
                    coefficientString = "A";
                    break;
                case ("11"):
                    coefficientString = "B";
                    break;
                case ("12"):
                    coefficientString = "C";
                    break;
                case ("13"):
                    coefficientString = "D";
                    break;
                case ("14"):
                    coefficientString = "E";
                    break;
                case ("15"):
                    coefficientString = "F";
                    break;
                default:
                    coefficientString = Integer.toString(coefficientInt);
            }
            resultString += (coefficientString);            // Adds the coefficient of current to the result String
        }
        return resultString;
    }
}
