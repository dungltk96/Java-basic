package exercise.lab_06;
/*
* String myStr = "100 minutes";
* NOT using REGEX, extract digit character from that String
* Expected output: "100".
* EX: "12345nabc678" -> "12345678"
* */

public class Lab03 {
    public static void main(String[] args) {
        String myStr = "100 minutes";
        String myDigitNumber = "";

        char[] myCharacter = myStr.toCharArray();
        for (char character : myCharacter) {
            if (Character.isDigit(character)){
                 myDigitNumber =  myDigitNumber.concat(String.valueOf(character));
            }
        }
        System.out.println(myDigitNumber);
    }
}