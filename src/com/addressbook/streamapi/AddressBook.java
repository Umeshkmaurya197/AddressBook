package com.addressbook.streamapi;

import java.util.Scanner;

public class AddressBook {
	private Contact contact;
	private Scanner scanner = new Scanner(System.in);

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

	public static void main(String[] args) {
		System.out.println("-----------Welcome to Address Book---------");

		AddressBook addressBook = new AddressBook();
		System.out.println("::::: add Contact::::::");
		System.out.println(addressBook.addContact());

	}

}
