package CharlieClose;

import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menuPrompt = """
                1. Phone Book
                2. Messages
                3. Chat
                4. Call Register
                5. Tones
                6. Settings
                7. Call Divert
                8. Games
                9. Calculator
                10.Reminders
                11.Clock
                12.Profiles
                13.Sim services
                """;
        System.out.println(menuPrompt);
        int menu = input.nextInt();
        switch (menu) {
            case 1 -> {
                System.out.println("Phone Book");
                String phoneBookPrompt = """
                        1. Search
                        2. Service Numbers
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send Business Card
                        8. Options
                        9. Speed Dials
                        10.Voice tags
                        """;
                System.out.println(phoneBookPrompt);
                int phoneBook = input.nextInt();
                switch (phoneBook) {
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service Numbers");
                        break;
                    case 3:
                        System.out.println("Add Name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign Tone");
                        break;
                    case 7:
                        System.out.println("Send Business Card");
                        break;
                    case 8:
                        System.out.println("Options");
                        String options = """
                                1. Type of View
                                2. Memory Status
                                 """;
                        System.out.println(options);
                        int option = input.nextInt();
                        switch (option) {
                            case 1 -> System.out.println("Type of View");
                            case 2 -> System.out.println("Memory Status");
                        }
                        break;
                    case 9:
                        System.out.println("Speed Dials");
                    case 10:
                        System.out.println("Voice tags");
                }
            }
            case 2 -> {
                System.out.println("Messages");
                String MessagesPrompt = """
                        1. Write Messages
                        2. Inbox
                        3. Outbox
                        4. Picture Messages
                        5. Templates
                        6. Smileys
                        7. Message Settings
                        8. Info service
                        9. Voice mailbox number
                        10.Service Command editor
                        """;
                System.out.println(MessagesPrompt);
                int Messages = input.nextInt();
                switch (Messages) {
                    case 1 -> System.out.println("Write Messages");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture Messages");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {
                        System.out.println("Messages Settings");
                        String MessagesSettings = """
                                1. Set
                                2. Common
                                 """;
                        System.out.println(MessagesSettings);
                        int messageSetting = input.nextInt();
                        switch (messageSetting) {
                            case 1 -> {
                                System.out.println("Set");
                                String setPrompt = """
                                        1. Message Center Number
                                        2. Message Sent As
                                        3. Message Validity 
                                                                            
                                        """;
                                System.out.println(setPrompt);
                                int set = input.nextInt();
                                switch (set) {
                                    case 1 -> System.out.println("Message Center Number");
                                    case 2 -> System.out.println("Message Sent As");
                                    case 3 -> System.out.println("Message Validity");
                                }
                            }
                            case 2-> {
                                System.out.println("Common");
                                String commonPrompt = """
                                        1. Delivery Reports
                                        2. Reply via same centre 
                                        3. Character support
                                        """;
                                System.out.println(commonPrompt);
                                int common = input.nextInt();
                                switch (common){
                                    case 1:
                                        System.out.println("Delivery Reports");
                                    case 2:
                                        System.out.println("Reply via same centre");
                                    case 3:
                                        System.out.println("Character support");
                                }
                            }
                        }
                    }
                case 8 ->{
                    System.out.println("Info service");
                }
                case 9 -> {
                    System.out.println("Voice mailbox number");
                }
                case 10 -> {
                    System.out.println("Service command editor");}
                }
            }
        case 3-> { System.out.println("Chat");
            }
        case 4 -> {
            System.out.println("Call Register");
            System.out.println("""
                    1. Missed Calls
                    2. Received Calls
                    3. Dialled Calls
                    4. Erase recent call lists
                    5. Show call duration
                    6. Show calls costs
                    7. Call Cost Settings
                    8. Prepaid credit
                    """);
            int callRegister = input.nextInt();
            switch(callRegister){
                case 1:
                    System.out.println("Missed Calls");
                case 2:
                    System.out.println("Received Calls");
                case 3:
                    System.out.println("Dialled Calls");
                case 4:
                    System.out.println("Erase recent calls lists");
                case 5:
                    System.out.println("Show call duration");
                    System.out.println("""
                            1. Last Call Duration
                            2. All calls' duration
                            3. Received calls' duration
                            4. Dialled calls' duration
                            5. Clear timers
                            """);
                    int callDuration = input.nextInt();
                    switch(callDuration){
                        case 1:
                            System.out.println("Last Call Duration");
                        case 2:
                            System.out.println("All calls' duration");
                        case 3:
                            System.out.println("Received calls' duration");
                        case 4:
                            System.out.println("Dialled calls' duration");
                        case 5:
                            System.out.println("Clear timers");
                    }
                case 6:
                    System.out.println("Show calls cost");
                    System.out.println("""
                                1. Last call cost
                                2. All calls cost
                                3. Clear counters 
                                """);
                    int showCalls = input.nextInt();
                    switch(showCalls){
                        case 1:
                            System.out.println("Last call cost");
                        case 2:
                            System.out.println("All calls cost");
                        case 3:
                            System.out.println("Clear counters ");
                    }
                case 7:
                    System.out.println("Call Cost Settings");
                    System.out.println("""
                            1. Call cost limit
                            2. Show costs in
                            """);
                    int callCost =  input.nextInt();
                    switch(callCost){
                        case 1:
                            System.out.println("Call cost limit");
                        case 2:
                            System.out.println("Show cost in");
                    }
                case 8:
                    System.out.println("Prepaid Cost");
            }

            }
            case 5->{
                System.out.println("Tones");
                System.out.println("""
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and Game tones
                        8. Vibrating alert
                        9. Screen Saver
                        """);
                int tone =  input.nextInt();
                switch(tone){
                    case 1:
                        System.out.println("Ringing tone");
                    case 2:
                        System.out.println("Ringing volume");
                    case 3:
                        System.out.println("Incoming call alert");
                    case 4:
                        System.out.println("Composer");
                    case 5:
                        System.out.println("Message alert tone");
                    case 6:
                        System.out.println("Keypad tones");
                    case 7:
                        System.out.println("Warning and Game tones");
                    case 8:
                        System.out.println("Vibrating alert");
                    case 9:
                        System.out.println("Screen Saver ");


                }
            }
            case 6-> {System.out.println("Settings");
                System.out.println("""
                        1. Call Settings
                        2. Phone Settings
                        3. Security Settings
                        4. Restore factory settings
                        """);
                int settings = input.nextInt();
                switch (settings) {
                    case 1:
                        System.out.println("Call Settings");
                        System.out.println("""
                                1. Automatic redial
                                2. Speed dialling
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                """);
                        int callSettings = input.nextInt();
                        switch (callSettings) {
                            case 1:
                                System.out.println("Automatic redial");
                            case 2:
                                System.out.println("Speed dialling");
                            case 3:
                                System.out.println("Call waiting options");
                            case 4:
                                System.out.println("Own number sending");
                            case 5:
                                System.out.println("Phone line in use");
                            case 6:
                                System.out.println("Automatic answer");

                        }
                    case 2:
                        System.out.println("Phone Settings");
                        System.out.println("""
                                1. Language
                                2. Cell info Device
                                3. Welcome Note
                                4. Network selection
                                5. Lights
                                6.Confirm SIM service actions                  
                                """);
                        int phoneSettings = input.nextInt();
                        switch (phoneSettings) {
                            case 1:
                                System.out.println("Language");
                            case 2:
                                System.out.println("Cell Info Device");
                            case 3:
                                System.out.println("Welcome note");
                            case 4:
                                System.out.println("Network selection");
                            case 5:
                                System.out.println("Lights");
                            case 6:
                                System.out.println("Network selection");

                        }
                    case 3:
                        System.out.println("Security Settings");
                        System.out.println("""
                                1. PIN Code request
                                2. Call barring service
                                3. Fixed Dialling
                                4. Closed User group
                                5. Phone Security
                                6. Change access codes
                                """);
                        int securitySettings = input.nextInt();
                        switch (securitySettings) {
                            case 1:
                                System.out.println("PIN Code Request");
                            case 2:
                                System.out.println("Call barring services");
                            case 3:
                                System.out.println("Fixed Dialling");
                            case 4:
                                System.out.println("Closed User group");
                            case 5:
                                System.out.println("Phone Security");
                            case 6:
                                System.out.println("Change access codes");

                        }
                    case 4:
                        System.out.println("Restore factory settings");
                        System.out.println("""
                                1. Restore factory settings
                                """);
                        int factorySettings = input.nextInt();
                        switch (factorySettings){
                            case 1:
                                System.out.println("Restore factory settings");
                        }
                }
            }
        case 7-> {
            System.out.println("Call Divert");
            System.out.println("""
                    Call Divert
                    """);
            int callDivert = input.nextInt();
            switch (callDivert) {
                case 1:
                    System.out.println("Call Divert");
            }

        }

        case 8->{
            System.out.println("Games");
            System.out.println("""
                    1. Games
                    """);
            int games = input .nextInt();
            switch(games){
                case 1:
                    System.out.println("Games");
            }
        }
        case 9-> {
            System.out.println("Calculator");
            System.out.println("""
                    1. Calculator
                    """);
            int calculator = input.nextInt();
            switch(calculator){
                case 1:
                    System.out.println("Calculator");
            }
            }
        case 10 ->{
            System.out.println("Reminder");
            System.out.println("""
                    1. Reminder
                    """);
            int reminder = input.nextInt();
            switch(reminder){
                case 1:
                    System.out.println("Reminder");
            }
        }

        case 11 -> {
            System.out.println("Clock");
            System.out.println("""
                    1. Alarm Clock
                    2. Clock settings
                    3. Date settings
                    4. Stopwatch
                    5. Countdown Timer
                    6. Auto update of date and time 
                    """);
            int clock = input.nextInt();
            switch(clock){
                case 1:
                    System.out.println("Alarm Clock");
                case 2:
                    System.out.println("Clock settings");
                case 3:
                    System.out.println("Date settings");
                case 4:
                    System.out.println("Stopwatch");
                case 5:
                    System.out.println("Countdown Timer ");
                case 6:
                    System.out.println("Auto update of date and time");
            }


            }
            case 12 -> {
                System.out.println("Profiles");
                System.out.println("""
                        1. Profiles
                        """);
                int profile = input.nextInt();
                switch(profile){
                    case 1:
                        System.out.println("Profiles");
                }
            }

        case 13 ->{
            System.out.println("SIM Services");
            System.out.println("""
                    1. SIM Services
                    """);
            int simServices = input.nextInt();
            switch (simServices){
                case 1:
                    System.out.println("Sim Services");
            }
        }
        }
        }

    }
