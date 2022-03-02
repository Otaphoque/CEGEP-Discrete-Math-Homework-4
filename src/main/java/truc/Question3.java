package truc;

public class Question3 {

    public Question3() {}

    /***
     * PSEUDO CODE FOR QUESTION 3 :
     *
     * int carryOver = 0
     * String SumString
     * int SumInt
     * String big, small
     *
     * if num1 is the longest String
     *      assign num1 to big
     *      assign num2 to small
     * if num2 is the longest String
     *      assign num2 to big
     *      assign num1 to small
     *
     *  while small has fewer characters (its length is smaller) than big,
     *      add zeros in front of it so they small and big are the same length
     *
     * for each of the character of big, i decreases of 1 each loop
     *      add the characters at index i AND the carryOver and assign it to result
     *      reset the carryOver to 0
     *      if result is 2
     *          add 1 to the carryOver
     *      if result is 3
     *          add 1 to carryOver and 1 to result
     *      add (concat) result to SumString (Sum = result + Sum)
     * return Sum
     */

    public String AddBinaries(String num1, String num2) {

        String big, small;
        int result;
        String Sum = "";
        int retenue = 0;

        if (num1.length() < num2.length()) {            // This portion of the code assigns the longest String to the String "big"
            big = num2;                                     // (and the smallest to the String "small")
            small = num1;                                   // It will be useful when looping later in the function
        } else {
            big = num1;
            small = num2;
        }

        while (big.length() != small.length()) {        // This portion of the code adds leading zeros in front
            small = "0" + small;                            // of the small number so that
        }                                                   // there is no IndexOutOfBonds Exception later on

        for (int i = big.length()-1; i>=0; i--) {
            result = Character.getNumericValue(big.charAt(i)) + Character.getNumericValue(small.charAt(i)) + retenue;   // Does the basic operation of adding everything
            retenue = 0;
            if (result == 2) {      // Activates the retenue process if there is one
                result = 0;
                retenue = 1;
            } else if (result == 3) {
                result = 1;
                retenue = 1;
            }
            Sum = Integer.toString(result) + Sum;       // Adds the result value in front of the previous result(s)
            if ((i == 0) && (retenue ==1)) {        // Activates if there is a retenue on the final operation
                Sum = retenue + Sum;
            }
        }
        return Sum;
    }
}
