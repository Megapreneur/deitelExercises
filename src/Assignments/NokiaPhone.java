package Assignments;
import java.util.Scanner;

public class NokiaPhone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                1. Phone Book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                """);
        System.out.println("Enter 1 to 13 to choose an option in menu: ");
        int menu = input.nextInt();

        switch(menu){
            case 1: System.out.println("Phonebook");
                System.out.println("""
                        1. Search
                        2. Service Nos
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b'card
                        8. Options
                        9. Speed dials
                        10. Voice tags
                        """);
                System.out.print("Enter a number from 1 to 10 for phone book menu: ");
                int phonebook = input.nextInt();
                switch (phonebook){
                    case 1: System.out.println("Search");
                    case 2: System.out.println("Service Nos");
                    case 3: System.out.println("Add name");
                    case 4: System.out.println("Erase");
                    case 5: System.out.println("Edit");
                    case 6: System.out.println("Assign tone");
                    case 7: System.out.println("Send b'card");
                    case 8: System.out.println("Option");
                        System.out.println("""
                                1. Type of view
                                2. Memory status
                                """);
                        System.out.print("Enter a number between 1 and 2 for Options menu: ");
                        int option = input.nextInt();
                        switch (option){
                            case 1: System.out.println("Type of view");
                            case 2: System.out.println("Memory status");
                        }
                    case 9:  System.out.println("Speed dials");
                    case 10: System.out.println("Voice tags");
                }
            case 2: System.out.println("Messages");
                System.out.println("""
                        1. Write messages
                        2. Inbox
                        3. Outbox
                        4. Picture messages
                        5. Templates
                        6. Smileys
                        7. Message settings
                        8. Info service
                        9. Voice mailbox number
                        10. Service command editor
                        """);
                System.out.print("Enter a number from 1 to 10 for messages menu: ");
                int messages = input.nextInt();
                switch (messages){
                    case 1: System.out.println("Write messages");
                    case 2: System.out.println("Inbox");
                    case 3: System.out.println("Outbox");
                    case 4: System.out.println("Picture messages");
                    case 5: System.out.println("Templates");
                    case 6: System.out.println("Smileys");
                    case 7: System.out.println("Message settings");
                        System.out.println("""
                                1. Set
                                2. Common
                                """);
                        System.out.print("Enter a number between 1 and 2 for Message settings menu: ");
                        int messageSettings = input.nextInt();
                        switch (messageSettings){
                            case 1: System.out.println("Set");
                                System.out.println("""
                                        1. Message centre number
                                        2. Messages sent as
                                        3. Message validity
                                        """);
                                System.out.print("Enter a number from 1 t0 3 for Set menu: ");
                                int set = input.nextInt();
                                switch (set){
                                    case 1: System.out.println("Message centre number");
                                    case 2: System.out.println("Message sent as");
                                    case 3: System.out.println("Message validity");
                                }
                            case 2: System.out.println("Common");
                                System.out.println("""
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support
                                        """);
                                System.out.print("Enter a number from 1 to 3 for Common menu: ");
                                int common = input.nextInt();
                                switch (common){
                                    case 1: System.out.println("Delivery reports");
                                    case 2: System.out.println("Rely via same centre");
                                    case 3: System.out.println("Character support");
                                }
                        }
                    case 8: System.out.println("Info service");
                    case 9: System.out.println("Voice mailbox number");
                    case 10: System.out.println("Service command editor");
                }
            case 3: System.out.println("Chat");
            case 4: System.out.println("Call register");
                System.out.println("""
                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent call lists
                        5. Show call duration
                        """);
                System.out.print("Enter a number from 1 to 5 for Set menu: ");
                int callRegister = input.nextInt();
                switch (callRegister){
                    case 1: System.out.println("Missed calls");
                    case 2: System.out.println("Received calls");
                    case 3: System.out.println("Dialled numbers");
                    case 4: System.out.println("Erase recent call lists");
                    case 5: System.out.println("Show call duration");
                        System.out.println("""
                                1. Last call duration
                                2. All calls' duration
                                3. Received calls' duration
                                4. Dialled calls' duration
                                5. Clear timers
                                """);
                        System.out.print("Enter a number from 1 to 5 for Show call duration menu: ");
                        int showCallDuration = input.nextInt();
                        switch(showCallDuration){
                            case 1: System.out.println("Last call duration");
                            case 2: System.out.println("All call's duration");
                            case 3: System.out.println("Received calls' duration");
                            case 4: System.out.println("Dialled calls' duration");
                            case 5: System.out.println("Clear timers");
                        }
                    case 6: System.out.println("Show call costs");
                        System.out.println("""
                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters
                                """);
                        System.out.print("Enter a number from 1 to 3 for Show call costs menu: ");
                        int showCallCosts = input.nextInt();
                        switch(showCallCosts){
                            case 1: System.out.println("Last call cost");
                            case 2: System.out.println("All calls' cost");
                            case 3: System.out.println("Clear counters");
                        }
                    case 7: System.out.println("Call cost settings");
                        System.out.println("""
                                1. Call cost limit
                                2. Show costs in
                                """);
                        System.out.print("Enter a number between 1 and 2 for Show call costs menu: ");
                        int callCostSettings = input.nextInt();
                        switch(callCostSettings){
                            case 1: System.out.println("Call cost limit");
                            case 2: System.out.println("Show costs in");
                        }
                    case 8: System.out.println("Prepaid credit");
                }
            case 5: System.out.println("Tones");
                System.out.println("""
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9. Screen saver
                        """);
                System.out.print("Enter a number from 1 to 9 for Tones menu: ");
                int tones = input.nextInt();
                switch(tones){
                    case 1: System.out.println("Ringing tone");
                    case 2: System.out.println("Ringing volume");
                    case 3: System.out.println("Incoming call alert");
                    case 4: System.out.println("Composer");
                    case 5: System.out.println("Message alert tone");
                    case 6: System.out.println("Keypad tones");
                    case 7: System.out.println("Warning and game tones");
                    case 8: System.out.println("Vibrating alert");
                    case 9: System.out.println("Screen saver");
                }
            case 6: System.out.println("Settings");
                System.out.println("""
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings
                        """);
                System.out.print("Enter a number from 1 to 4 for Settings menu: ");
                int settings = input.nextInt();
                switch(settings){
                    case 1: System.out.println("Call settings");
                        System.out.println("""
                                1. Automatic redial
                                2. Speed dialling
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                """);
                        System.out.print("Enter a number from 1 to 6 for Call settings menu: ");
                        int callSettings = input.nextInt();
                        switch(callSettings){
                            case 1: System.out.println("Automatic redial");
                            case 2: System.out.println("Speed dialling");
                            case 3: System.out.println("Call waiting options");
                            case 4: System.out.println("Own number sending");
                            case 5: System.out.println("Phone line in use");
                            case 6: System.out.println("Automatic answer");
                        }
                    case 2: System.out.println("Phone settings");
                        System.out.println("""
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm SIM service actions
                                """);
                        System.out.print("Enter a number from 1 to 6 for Phone settings menu: ");
                        int phoneSettings = input.nextInt();
                        switch(phoneSettings){
                            case 1: System.out.println("Language");
                            case 2: System.out.println("Cell info display");
                            case 3: System.out.println("Welcome note");
                            case 4: System.out.println("Network selection");
                            case 5: System.out.println("Lights");
                            case 6: System.out.println("Confirm SIM service actions");
                        }
                    case 3: System.out.println("Security settings");
                        System.out.println("""
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                """);
                        System.out.print("Enter a number from 1 to 6 for Security settings menu: ");
                        int securitySettings = input.nextInt();
                        switch(securitySettings){
                            case 1: System.out.println("PIN code request");
                            case 2: System.out.println("Call barring service");
                            case 3: System.out.println("Fixed dialling");
                            case 4: System.out.println("Closed user group");
                            case 5: System.out.println("Phone security");
                            case 6: System.out.println("Change access codes");
                        }
                    case 4: System.out.println("Restore factory settings");
                }
            case 7: System.out.println("Call divert");
            case 8: System.out.println("Games");
            case 9: System.out.println("Calculator");
            case 10: System.out.println("Reminders");
            case 11: System.out.println("Clock");
                System.out.println("""
                        1. Alarm clock
                        2. Clock settings
                        3. Date settings
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time
                        """);
                System.out.print("Enter a number from 1 to 6 for Clock menu: ");
                int clock = input.nextInt();
                switch(clock){
                    case 1: System.out.println("Alarm clock");
                    case 2: System.out.println("Clock settings");
                    case 3: System.out.println("Date setting");
                    case 4: System.out.println("Stopwatch");
                    case 5: System.out.println("Countdown timer");
                    case 6: System.out.println("Auto update of date and time");
                }
            case 12: System.out.println("Profiles");
            case 13: System.out.println("SIM services");
        }
    }
}
