package truc;

public class Question32 {

    public Question32() {
    }

    public String AddBinaries(String num1, String num2) {

        String big, small;
        int result = 0;
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

        int carryOver = 0;
        for (int i = big.length()-1; i>=0; i--) {       // For every character in big
            char c1 = big.charAt(i);
            char c2 = small.charAt(i);

            result = this.add(c1, c2);                              // Calculates the result between the two char
            result = this.add((char) carryOver, (char) result);     // Adds the carryOver
            carryOver = this.calculateCarryOver(c1, c2);            // Calculates the carryOver

            Sum = Integer.toString(result) + Sum;       // Adds the result value in front of the previous result(s)
            if ((i == 0) && (retenue ==1)) {        // Activates if there is a retenue on the final operation
                Sum = retenue + Sum;
            }
        }
        return Sum;
    }

    public int add(char c1, char c2) {
        int result = 0;
        if ((c1 == 0) ^ (c2 == 0)) {
            result = 0;
        } else if ((c1 == 0) ^ (c2 == 1)) {
            result = 1;
        } else if ((c1 == 1) ^ (c2 == 0)) {
            result = 1;
        } else if ((c1 == 1) ^ (c2 == 1)) {
            result = 0;
        }
        return result;
    }

    public int calculateCarryOver(char c1, char c2) {
        int carryOver = 0;

        if ((c1 == 0) && (c2 == 0)) {
            carryOver = 0;
        } else if ((c1 == 0) && (c2 == 1)) {
            carryOver = 1;
        } else if ((c1 == 1) && (c2 == 0)) {
            carryOver = 1;
        } else if ((c1 == 1) && (c2 == 1)) {
            carryOver = 0;
        }
        return carryOver;
    }

}
