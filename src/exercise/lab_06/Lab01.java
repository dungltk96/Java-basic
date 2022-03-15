package exercise.lab_06;
/*
* Given input string: "2hrs and 5 minutes"
* Please calculate how many minutes in total
* */
public class Lab01 {
    public static void main(String[] args) {
        String myStringInput = "2hrs and 5 minutes";

        // Split subStr hour and subStr minute
        String[] splitTime = myStringInput.split("and");

        // Index subString
        String hourStr = splitTime[0];
        String minuteStr = splitTime[1];

        // Split hour and minute
        int hours = Integer.parseInt(hourStr.replaceAll("[^0-9]",""));
        int minutes = Integer.parseInt(minuteStr.replaceAll("[^0-9]",""));

        // Total minutes
        int totalTime = hours*(60) + minutes;
        System.out.println("Total minutes is: " + totalTime);
    }
}
