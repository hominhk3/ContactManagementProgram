/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Contact;

/**
 *
 * @author dell
 */
public class Validation {
    private final static Scanner in = new Scanner(System.in);
    private static final String[] VALID_PHONE = {"[0-9]{10}",
        "[0-9]{3}\\-[0-9]{3}\\-[0-9]{4}",
        "[0-9]{3}\\-[0-9]{3}\\-[0-9]{4}\\s[x][0-9]{4}",
        "[0-9]{3}\\-[0-9]{3}\\-[0-9]{4}\\sext[0-9]{4}",
        "\\([0-9]{3}\\)\\-[0-9]{3}\\-[0-9]{4}",
        "[0-9]{3}\\.[0-9]{3}\\.[0-9]{4}",
        "[0-9]{3}\\s[0-9]{3}\\s[0-9]{4}"};

    //check user input string
    public static String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static int checkId(ArrayList<Contact> contact) {
        int i;
        for (i = 0; i < contact.size(); i++) {
            if (i + 1 != contact.get(i).getId()) {
                break;
            }
        }
        return i + 1;
    }

    //check input int
    public static int checkInputInt() {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch (Exception e) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            }
        }
    }

    //check input name
    public static String checkInputName() {
        //loop until user input correct
        while (true) {
            String name = checkInputString();
            name = name.trim();
            name = name.replaceAll("\\s+", " ");
            String[] strings = name.split("\\s");
            //appen every word and character special distance is one space
            if (strings.length <= 1) {
                System.err.println("Please input Name follow\n" + "First Name + Last Name");
                System.out.print("Enter again: ");
            } else {
                return name;
            }
        }
    }

    //check input phone
    public static String checkInputPhone() {
        //loop until user input correct
        while (true) {
            String result = checkInputString();
            for (int i = 0; i < VALID_PHONE.length; i++) {
                if (result.matches(VALID_PHONE[i])) {
                    return result;
                }
            }
            System.err.println("Please input Phone follow\n"
                    + "• 1234567890\n"
                    + "• 123-456-7890 \n"
                    + "• 123-456-7890 x1234\n"
                    + "• 123-456-7890 ext1234\n"
                    + "• (123)-456-7890\n"
                    + "• 123.456.7890\n"
                    + "• 123 456 7890");
            System.out.print("Enter again: ");
        }
    }

}
