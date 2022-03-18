package exercise.lab_07;
/*
 * Create a book class with: ISBN, authorName, Year
 * Create a simple menu to allow user to input books
 * Find book by using ISBN and print the found book by implementing toString method
 * */

import java.util.*;

public class HashMapWithBook {
    public static void main(String[] args) {

        Map<String, BookInformation> bookList = new HashMap<>();
        bookList.put(new String(), new BookInformation());

        boolean isContinuing = true;

        while (isContinuing) {
            System.out.println("==================MENU==================");
            System.out.println("1. Input book Info [ISBN, AuthorName, Year]");
            System.out.println("2. Find book by ISBN");
            System.out.println("3. Show list of book");
            System.out.println("0. Exit programing!\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number, please!");
            int optionNumber = scanner.nextInt();

            if (optionNumber == 0) {
                isContinuing = false;
            } else {
                switch (optionNumber) {
                    case 1:
                        System.out.println("Input ISBN, pls!");
                        Scanner scanner1 = new Scanner(System.in);
                        String inputISBN = scanner1.nextLine();

                        System.out.println("Input AuthorName, pls!");
                        Scanner scanner2 = new Scanner(System.in);
                        String inputAuthor = scanner2.nextLine();

                        System.out.println("Input Year, pls!");
                        Scanner scanner3 = new Scanner(System.in);
                        String inputYear = scanner3.nextLine();

                        bookList.put(inputISBN, new BookInformation(inputAuthor, inputYear));
                        break;
                    case 2:
                        System.out.println("Input ISBN, pls!");
                        Scanner scanner4 = new Scanner(System.in);
                        String ISBN = scanner4.nextLine();

                        if (bookList.containsKey(ISBN)){
                            System.out.println("Book information is: " + bookList.get(ISBN));
                        }else {
                            System.out.println("ISBN not found!");
                        }
                        break;
                    case 3:
                        Set<Map.Entry<String, BookInformation>> getBookList = bookList.entrySet();
                        System.out.println("List books you entered");

                        for (Map.Entry<String, BookInformation> entry : getBookList){
                            System.out.println("ISBN " + entry + 1);
                        }
                }
            }
        }
    }
}
