package com.bridgelabz.addressbook;

import java.util.Scanner;
import java.sql.Array;

public class AddressBookMain {
    public static void main(String[] args) {
        Contact contact;
        static int contactID;
        static Contact AddressBook[] = new Contact[10];

        public static void main (String[]args){
            System.out.println("Welcome to Address Book");

            AddressBookMain addressBook = new AddressBookMain();
            Contact contact1 = addressBook.createContact();

            addressBook.addContact(contact1);
            System.out.println(contact1);
        }

        Contact createContact() {
            System.out.println("Enter Email");
            String email = scanner.next();

            System.out.println("created new contact\n");
            Contact contact = new Contact(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
            System.out.println("created new contact");
            return contact;
        }

        void addContact (Contact contact){
            AddressBook[contactID++] = contact;
            System.out.println("contact added to AddressBook");


        }
    }
}
