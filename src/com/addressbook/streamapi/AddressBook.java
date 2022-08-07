package com.addressbook.streamapi;

import java.util.Scanner;

public class AddressBook {
	private Contact contact;
	private static Scanner scanner = new Scanner(System.in);
	static AddressBook addressBook;

	// add new Contact -uc2
	public Contact addContact() {
		System.out.print("Enter id  : ");
		int id = scanner.nextInt();

		System.out.print("Enter First Name  : ");
		String firstName = scanner.next();

		System.out.print("Enter Last Name  : ");
		String lastName = scanner.next();

		System.out.print("Enter Address  : ");
		String address = scanner.next();

		System.out.print("Enter City  : ");
		String city = scanner.next();

		System.out.print("Enter State  : ");
		String state = scanner.next();

		System.out.print("Enter Zip  : ");
		int zip = scanner.nextInt();

		System.out.print("Enter Phone Number  : ");
		String phoneNumber = scanner.next();

		contact = new Contact(id, firstName, lastName, address, city, state, phoneNumber, zip, phoneNumber);
		return contact;
	}

	// edit exiting contact -uc3
	private Contact editContact(String fName) {
		if(contact==null) {
			System.out.print(" Address book is ");
			return contact;
		}
		if (contact.getFirstName().equals(fName)) {
			System.out.print("Enter First Name  : ");
			String firstName = scanner.next();

			System.out.print("Enter Last Name  : ");
			String lastName = scanner.next();

			System.out.print("Enter Address  : ");
			String address = scanner.next();

			System.out.print("Enter City  : ");
			String city = scanner.next();

			System.out.print("Enter State  : ");
			String state = scanner.next();

			System.out.print("Enter Zip  : ");
			int zip = scanner.nextInt();

			System.out.print("Enter Phone Number  : ");
			String phoneNumber = scanner.next();

			contact.setFirstName(firstName);
			contact.setLastName(lastName);
			contact.setAddress(address);
			contact.setCity(city);
			contact.setState(state);
			contact.setZip(zip);
			contact.setPhoneNumber(phoneNumber);
			return contact;
		} else
			System.out.println(" Contact Not found ");
		return contact;
	}

	public static void main(String[] args) {
		System.out.println("-----------Welcome to Address Book---------");

		addressBook = new AddressBook();
		String exit = "n";
		while (exit != "y") {
			System.out.println("\n Enter 1 to add new Contact ");
			System.out.println(" Enter 2 to update existing contact ");
			System.out.println(" Enter 3 to Exit ");
			System.out.print(" Enter option : ");
			int input = scanner.nextInt();
			switch (input) {
			case 1:
				System.out.println(" :::::: add Contact ::::::");
				System.out.println(addressBook.addContact());
				break;
			case 2:
				System.out.println(" :::::: edit Contact ::::::");
				System.out.print(" Enter first name to edit contact ");
				String firstName = scanner.next();
				System.out.println(addressBook.editContact(firstName));
				break;
			case 3:
				System.out.println(" :::::: exit from address book ::::::");
				exit = "y";
				break;
			}
		}
		System.out.println("exited ");

	}

}
