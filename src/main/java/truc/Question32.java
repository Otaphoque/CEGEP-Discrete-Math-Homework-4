package truc;

public class Question32 {

    public Question32() {
    }

    public String AddBinaries(String num1, String num2) {

        String big, small;
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
        int result = 0;
        for (int i = big.length() - 1; i >= 0; i--) {       // For every character in big
            int c1 = Integer.parseInt(Character.toString(big.charAt(i)));
            int c2 = Integer.parseInt(Character.toString(small.charAt(i)));

            result = (c1 ^ c2);
            result = (result ^ carryOver);
            carryOver = (c1 & c2);
            carryOver = (carryOver & c2);

            Sum = result + Sum;
            Sum = Integer.toString(result) + Sum;       // Adds the result value in front of the previous result(s)
            if ((i == 0) && (retenue ==1)) {        // Activates if there is a retenue on the final operation
                Sum = retenue + Sum;
            }
        }
        return Sum;
    }

    public int add(String c1, String c2) {
        boolean b1 = false;
        boolean b2 = false;
        int result = 0;
        if (c1.equals("1")) {
            b1 = true;
        }
        if (c2.equals("1")) {
            b2 = true;
        }
        if (b1 ^ b2) {
            result = 1;
        }
        return result;
    }

    public String calculateCarryOver(String c1, String c2) {
        boolean b1 = false;
        boolean b2 = false;
        int carryOver = 0;
        if (c1.equals("1")) {
            b1 = true;
        }
        if (c2.equals("1")) {
            b2 = true;
        }
        if (b1 && b2) {
            carryOver = 1;
        }
        return Integer.toString(carryOver);
    }

    public int addIterative(int a, int b){
        while (b != 0){
            int carry = (a & b) ; //CARRY is AND of two bits

            a = a ^b; //SUM of two bits is A XOR B

            b = carry << 1; //shifts carry to 1 bit to calculate sum
        }
        return a;
    }
}


