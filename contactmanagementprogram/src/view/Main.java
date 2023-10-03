package view;


import controller.ContactManagement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class Main {
      public static void main(String[] args) {
        String title = "========== Contact program ============";
        String[] s = new String[]{"Add a Contact", "Display all Contact", "Delete a Contact", "Exit"};
        ContactManagement manage = new ContactManagement(title, s);
        manage.run();
    
}
}
