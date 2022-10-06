package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBookMain addressBook = new AddressBookMain();
        Contact contact = addressBook.createContact();
        addressBook.addContact(contact);
        System.out.println(contact);

        System.out.println("enter name to edit contact");
        String name = scanner.next();
        addressBook.editContact(name);
        System.out.println(contact);
        addressBook.editContact();
        addressBook.deleteContact();
    }

    Contact createContact() {
        System.out.println("Enter first name");
        String firstName = scanner.next();
        System.out.println("Enter last name");
        String lastName = scanner.next();
        System.out.println("Enter address");
        String address = scanner.next();
        System.out.println("Enter city");
        String city = scanner.next();
        System.out.println("Enter state");
        String state = scanner.next();
        System.out.println("Enter ZipCode");
        int zipCode = scanner.nextInt();
        System.out.println("Enter phoneNumber");
        long phoneNumber = scanner.nextLong();
        System.out.println("Enter Email");
        String email = scanner.next();
        Contact contact = new Contact(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
        System.out.println("created new contact");
        return contact;
        @ @ -47, 7 + 43, 9 @ @
                AddressBook.add(contact) ;
        System.out.println("contact added to AddressBook");
    }

    void editContact(String name) {
        void editContact () {
            System.out.println("enter name to edit contact");
            String name = scanner.next();
            for (Contact contact : AddressBook) {
                if (contact.firstName.equalsIgnoreCase(name)) {
                    System.out.println("Enter first name");
                    @ @ -67, 9 + 65, 21 @@void editContact (String name){
                        System.out.println("Enter Email");
                        contact.email = scanner.next();
                        System.out.println("contact updated successfully.");
                        System.out.println(contact);
                        break;
                    }
                }
            }

            void deleteContact () {
                System.out.println("enter name to delete contact");
                String name = scanner.next();
                for (Contact contact : AddressBook) {
                    if (contact.firstName.equalsIgnoreCase(name)) {
                        AddressBook.remove(contact);
                        System.out.println("contact deleted");
                        break;
                    }


                }
            }
        }
    }
}
