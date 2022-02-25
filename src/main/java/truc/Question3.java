package truc;

public class Question3 {

    public Question3() {}

    /***
     * PSEUDO CODE FOR QUESTION 3 :
     *
     * int carryOver = 0
     * String SumString
     * int SumInt
     *
     * for each of the character of the longest string, i decreases -1
     *      add the characters at index i AND the carryOver
     *      if the result is 2
     *          add 1 to the carryOver
     *      if the result is 1 OR 0
     *          add the result to SumString (Sumstring = result + SumString)
     * convert to Int and store SumString to SumInt
     * return SumInt
     *
     */

    public int AddBinaries(String num1, String num2) {

        String big, small;
        int result, SumInt, indexOfSmall;
        String SumString = "";
        int retenue = 0;

        if (num1.length() < num2.length()) {            // This portion of the code assigns the longest String to the String "big"
            big = num2;                                     // (and the smallest to the String "small")
            small = num1;                                   // It will be useful when looping later in the function
        } else {
            big = num1;
            small = num2;
        }

        if (big.length() != small.length()) {                                   // This portion of the code adds leading zeros in front
            for (int i = 0; i<=big.length() - small.length(); i++) {                // of the smallest number if needed so that
                small = "0" + small;                                                // there is no IndexOutOfBonds Exception later on
            }
        }

        for (int i = big.length()-1; i>=0; i--) {
            result = Character.getNumericValue(big.charAt(i)) + Character.getNumericValue(small.charAt(i)) + retenue;   // Does the basic operation of adding everything
            retenue = 0;
            if (result == 2) {      // Activates the retenue process if there is one
                result = 0;
                retenue = 1;
            }
            SumString = Integer.toString(result) + SumString;       // Adds the result value in front of the previous result(s)
            if ((i == 0) && (retenue ==1)) {        // Activates if there is a retenue on the final operation
                SumString = retenue + SumString;
            }
        }
        SumInt = Integer.parseInt(SumString);
        return SumInt;      // Returns the converted (from String to Int) value
    }
}

// System.out.println("big : " + big);
// System.out.println("small : " + small);

// System.out.println("Result : " + result);
// System.out.println("SumString : " + SumString + "\n");
