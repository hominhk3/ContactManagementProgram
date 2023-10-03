/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.Collections;
import model.Contact;
import view.Validation;

/**
 *
 * @author dell
 */
public class Program {
    public static void createContact(ArrayList<Contact> contact) {
        int contactId = Validation.checkId(contact);
        System.out.println("Enter name: ");
        String Name = Validation.checkInputName();
        String[] fullName = Name.split("\\s");
        String firstName = fullName[0];
        String lastName = fullName[fullName.length - 1];
        System.out.print("Enter group: ");
        String group = Validation.checkInputString();
        System.out.print("Enter address: ");
        String address = Validation.checkInputString();
        System.out.print("Enter phone: ");
        String phone = Validation.checkInputPhone();
        contact.add(new Contact(contactId, Name, group, address, phone, firstName, lastName));
        System.err.println("Add successful.");
    }

    //allow user display all contact
    public static void displayAllContact(ArrayList<Contact> contacts) {
        if (contacts.isEmpty()) {
            System.err.println("List is empty. You must add a new contact.");
        } else {
            Collections.sort(contacts);
            System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name", "First name", "Last name", "Group", "Address", "Phone");
            //print infomation of contact from first to last list contact
            for (Contact contact : contacts) {
                System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n", contact.getId(), contact.getFullName(), contact.getFirstName(), contact.getLastName(), contact.getGroup(), contact.getAddress(), contact.getPhone());
            }
        }
    }

    //allow user delete contact
    public static void deleteContact(ArrayList<Contact> contacts) {
        if (contacts.isEmpty()) {
            System.err.println("List is empty. You must add a new contact.");
        } else {
            System.out.print("Enter id: ");
            int id = Validation.checkInputInt();
            for (Contact contact : contacts) {
                if (contact.getId() == id) {
                    contacts.remove(contact);
                    System.err.println("Delete successful.");
                    return;
                }
            }
            System.err.println("Not found contact");
        }
    }
}
