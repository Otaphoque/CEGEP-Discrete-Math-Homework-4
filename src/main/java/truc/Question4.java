package truc;

public class Question4 {

    public Question4() {}

    public String MultiBinaries(String num1, String num2) {

        // Object to access the AddBinaries function
        Question3 q3 = new Question3();

        String big, small;
        String zero = "0";

        // Assign the longer string to big variable and shorter to small
        if (num1.length() > num2.length()) {
            big = num1;
            small = num2;
        } else {
            big = num2;
            small = num1;
        }

        // Init pointer variables for both strings
        int bigIndex = big.length() - 1;
        int smallIndex = small.length() - 1;

        String results = "";
        // Loop all small characters backwards
        for (int i = smallIndex; i >= 0; i--) {
            String tempResult = "";

            // Loop all big characters backwards
            for (int j = bigIndex; j >= 0; j--) {

                if (big.charAt(j) == '0' || small.charAt(i) == '0'){
                    tempResult += "0";
                } else {
                    tempResult += "1";
                }
            }
            // Reverses the string using StringBuilder
            StringBuilder reversedTemp = new StringBuilder();
            reversedTemp.append(tempResult);
            reversedTemp.reverse();

            reversedTemp.append(zero.repeat(smallIndex - i));
            results += reversedTemp + ",";
        }

        String[] numbers = results.split(",");
        String addedBinaries = "";

        // Loop to add all the binary numbers
        for (int k = 0; k < small.length(); k++) {
            if (k == 0) {
                addedBinaries = q3.AddBinaries(numbers[k], numbers[k + 1]);
                continue;
            } else if (k == 1) {
                continue;
            }
            addedBinaries = q3.AddBinaries(addedBinaries, numbers[k]);
        }
        return addedBinaries;
    }
}
