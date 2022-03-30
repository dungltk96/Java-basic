package exercise.lab_07;

import java.util.*;

public class SimpleBookMenu {
    public static void main(String[] args) {
        Map<String, List<BookInfo>> bookInfo = new HashMap<>();

        boolean isContinuing = true;
        while (isContinuing){
            System.out.println("=============MENU=============");
            System.out.println("1. Input book Info including: [ISBN, Title, AuthorName, Year, Price]");
            System.out.println("2. Find book by ISBN");
            System.out.println("3. Show list of book");
            System.out.println("0. Exit programing!\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number option, pls!");
            int optionNumber = scanner.nextInt();

            if (optionNumber == 0){
                isContinuing = false;
            }else {
                switch (optionNumber){
                    case 1:
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("Input ISBN:");
                        String inputISBN = scanner1.nextLine();

                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("Input Title:");
                        String inputTitle = scanner2.nextLine();

                        Scanner scanner3 = new Scanner(System.in);
                        System.out.println("Input Author:");
                        String inputAuthor = scanner3.nextLine();

                        Scanner scanner4 = new Scanner(System.in);
                        System.out.println("Input Year:");
                        String inputYear = scanner4.nextLine();

                        Scanner scanner5 = new Scanner(System.in);
                        System.out.println("Input Price:");
                        String inputPrice = scanner5.nextLine();

                        BookInfo bookListInfo = new BookInfo(inputTitle, inputAuthor, inputYear, inputPrice);
                        bookInfo.put(inputISBN, Arrays.asList(bookListInfo));
                        break;

                    case 2:
                        Scanner scanner6 = new Scanner(System.in);
                        System.out.println("Input ISBN:");
                        String findISBN = scanner6.nextLine();
                        if (bookInfo.containsKey(findISBN)){
                            System.out.println(bookInfo.get(findISBN));
                        }else {
                            System.out.println("Book not found!");
                        }
                        break;
                    case 3:
                        Set<Map.Entry<String, List<BookInfo>>> entrySet = bookInfo.entrySet();
                        System.out.println("List books you entered:");

                        for (Map.Entry<String, List<BookInfo>> stringListEntry : entrySet) {
                            System.out.println("ISBN" + stringListEntry);
                        }
                    default:
                        System.out.println("Wrong option number");
                }
            }
        }
    }
}
