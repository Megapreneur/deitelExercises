package Assignments;


import java.util.ArrayList;
import java.util.Scanner;

public class DiaryMain {
    static Scanner input = new Scanner(System.in);
    static Diary diary;
    private ArrayList<Entry> entries;

    public static void main(String[] args) {
        menu();

    }
    public static void menu(){
        System.out.println("Welcome to My Diary Application");

        System.out.println("""

                1. Create an account.
                2. Unlock Diary.
                3. Create an entry.
                4. Find an entry by Title.
                5. Find an entry by date.
                6. Delete an entry by title.
                7. Delete an entry by date.
                8. Get diary size.
                9. Delete all entries.
                
                """);
        System.out.print("Select a number: ");
        int menuOption = input.nextInt();
        switch (menuOption){
            case 1 -> createDiaryAccount();
            case 2 -> login();
            case 3 -> createEntry();
            case 4 -> findEntryByTitle();
            case 5 -> findEntryByDate();
            case 6 -> deleteEntryByTitle();
            case 7 -> deleteEntryByDate();
            case 8 -> getNumberOfEntry();
            case 9 -> deleteAllEntry();
            default -> menu();

        }
    }

    private static void createDiaryAccount() {
        System.out.print("Enter your first name: ");
        String userName1 = input.next();
        System.out.print("Enter your last name: ");
        String userName2 = input.next();
        System.out.print("Enter your preferred password: ");
        String userPassword = input.next();

        String name = userName1 +" "+ userName2;

        diary = new Diary(name, userPassword);

        


        System.out.println(diary);
        getNumberOfEntry();


    }

    private static void deleteAllEntry() {
//        diary.deleteAllEntry();
    }

    private static void getNumberOfEntry() {
        diary = new Diary();
        System.out.println(diary.getNumberOfEntry());

    }

    private static void deleteEntryByDate() {
//        diary.deleteEntryByDate();
    }

    private static void deleteEntryByTitle() {
//        diary.deleteEntryByTitle();
    }

    private static void findEntryByDate() {
//        diary.findEntryByDate();
    }

    private static void login() {
        System.out.print("Enter your first name: ");
        String userName1 = input.next();
        System.out.print("Enter your last name: ");
        String userName2 = input.next();

        String name = userName1 +" "+ userName2;

        System.out.print("Enter your password: ");
        String userPassword = input.next();




    }

    private static void findEntryByTitle() {
//        diary.findEntryByTitle()
    }

    private static void createEntry() {
        System.out.print("What is the title of your entry: ");
        String entryTitle = input.next();
        System.out.print("What is the date of your entry: ");
        String date = input.next();
        System.out.print("What is the body of your entry: ");
        String bodyOfEntry = input.next();
        diary = new Diary();
        diary.createEntry(entryTitle, date, bodyOfEntry);

    }


}
