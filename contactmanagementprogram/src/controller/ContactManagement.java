/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Program;
import java.util.ArrayList;
import model.Contact;
import view.Menu;

/**
 *
 * @author dell
 */
public class ContactManagement extends Menu {
    private static ArrayList<Contact> arr = new ArrayList();

    public ContactManagement() {
    }

    public ContactManagement(String title, String[] s) {
        super(title, s);
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                Program.createContact(arr);
                break;
            case 2:
                Program.displayAllContact(arr);
                break;
            case 3:
                Program.deleteContact(arr);
                break;
            case 4:
                System.out.println("Exited");
                return;
            default:
                System.err.println("Choose 1-4");
                break;
        }
    }
}
