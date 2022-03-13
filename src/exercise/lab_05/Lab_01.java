package exercise.lab_05;

import java.util.*;

/*
* 1. Input student Info [ID, Name]
* 2. Find student by ID
* 3. Exit
* */
public class Lab_01 {
    public static void main(String[] args) {
        boolean isContinuing = true;
        Map<Integer,  String> studentList = new HashMap<>();

        while (isContinuing){
            System.out.println("================MENU================");
            System.out.println("1. Input student Info [ID, Name]");
            System.out.println("2. Find student by ID");
            System.out.println("3. Show list of student");
            System.out.println("0. Exit programing!\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number, Please!");
            int optionNumber = scanner.nextInt();

            if (optionNumber == 0){
                isContinuing = false;
            }else {
                switch (optionNumber){
                    case 1:
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("Input student ID:");
                        int studentId =  scanner1.nextInt();

                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("Input student Name:");
                        String studentName = scanner2.nextLine();

                        studentList.put(studentId, studentName);
                        break;
                    case 2:
                        System.out.println("Input student ID to find, Please!");
                        Scanner scanner3 = new Scanner(System.in);
                        int studentIdFind =  scanner3.nextInt();

                        if (studentList.containsKey(studentIdFind)){
                            System.out.println("Student ID find is: " + studentList.get(studentIdFind));
                        }else {
                            System.out.printf("Student with ID %d not found!\n", studentIdFind);
                        }
                        break;
                    case 3:
                        Set<Map.Entry<Integer, String>> getAllListStudent = studentList.entrySet();
                        System.out.println("List Student you entered: ");

                        for (Map.Entry<Integer, String> entry : getAllListStudent) {
                            System.out.println("Student ID " + entry.getKey() + " --> " + "Name: " + entry.getValue());
                        }
                        break;
                }
            }
        }
    }
}
