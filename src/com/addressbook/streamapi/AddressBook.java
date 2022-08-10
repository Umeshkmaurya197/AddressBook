package com.addressbook.streamapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	private Contact contact;
	private static Scanner scannerInt = new Scanner(System.in);
	private static Scanner scannerStr = new Scanner(System.in);
	static AddressBook addressBook;
	Collection<Contact> contactList = new ArrayList<>();

	public void addContact() {
		System.out.print(" Enter id  : ");
		int id = scannerInt.nextInt();

		System.out.print(" Enter First Name  : ");
		String firstName = scannerStr.nextLine();

		System.out.print(" Enter Last Name  : ");
		String lastName = scannerStr.nextLine();

		System.out.print(" Enter Address  : ");
		String address = scannerStr.nextLine();

		System.out.print(" Enter City  : ");
		String city = scannerStr.nextLine();

		System.out.print(" Enter State  : ");
		String state = scannerStr.nextLine();

		System.out.print(" Enter email : ");
		String email = scannerStr.nextLine();

		System.out.print(" Enter Zip  : ");
		int zip = scannerInt.nextInt();

		System.out.print(" Enter Phone Number  : ");
		String phoneNumber = scannerStr.nextLine();

		contact = new Contact(id, firstName, lastName, address, city, state, email, zip, phoneNumber);
		contactList.add(contact);
		System.out.println("Contact List :" + contactList);
	}

	public void editContact() {
		System.out.print(" Enter first name to edit contact ");
		String firstName = scannerStr.nextLine();
		Iterator<Contact> contactItr = contactList.iterator();
		while (contactItr.hasNext()) {
			Contact c = contactItr.next();
			if (c.getFirstName().equals(firstName)) {
				System.out.println(
						" Enter 1 to edit firstname \n Enter 2 to edit lastname \n Enter 3 to edit address \n Enter 4 to edit city \n Enter 5 to edit state \n Enter 6 to edit email \n Enter 7 to edit zip \n Enter 8 to edit phone number ");
				System.out.println("\n Enter your choice : ");
				int input = scannerInt.nextInt();
				switch (input) {
				case 1:
					System.out.print(" Enter the new first name : ");
					String fName = scannerStr.nextLine();
					c.setFirstName(fName);
					System.out.println(c);
					break;
				case 2:
					System.out.print(" Enter the new last name : ");
					String LName = scannerStr.nextLine();
					c.setLastName(LName);
					System.out.println(c);
					break;
				case 3:
					System.out.print(" Enter the new address : ");
					String address = scannerStr.nextLine();
					c.setAddress(address);
					System.out.println(c);
					break;
				case 4:
					System.out.print(" Enter the new city : ");
					String city = scannerStr.nextLine();
					c.setCity(city);
					System.out.println(c);
					break;
				case 5:
					System.out.print(" Enter the new state : ");
					String state = scannerStr.nextLine();
					c.setState(state);
					System.out.println(c);
					break;
				case 6:
					System.out.print(" Enter the new email : ");
					String email = scannerStr.nextLine();
					c.setEmail(email);
					System.out.println(c);
					break;
				case 7:
					System.out.print(" Enter the new zip : ");
					int zip = scannerInt.nextInt();
					c.setZip(zip);
					System.out.println(c);
					break;
				case 8:
					System.out.print(" Enter the new phone number : ");
					String phone = scannerStr.nextLine();
					c.setPhoneNumber(phone);
					System.out.println(c);
					break;
				default:
					System.out.println("  worng input ");
				}
			}
		}
	}

	public void deleteContact() {
		System.out.print(" Enter first name to delete contact ");
		String firstName = scannerStr.nextLine();
		Iterator<Contact> contactItr = contactList.iterator();
		Contact c = null;
		while (contactItr.hasNext()) {
			if (contactItr.next().getFirstName().equals(firstName)) {
				contactItr.remove();
				System.out.println(" -- Contact  Deleted --");
			}
		}
		System.out.println("Contact List :" +contactList);

	}

	public static void main(String[] args) {
		System.out.println("-----------Welcome to Address Book---------");
		addressBook = new AddressBook();
		char exit = 'n';
		while (exit != 'y') {
			System.out.println("\n Enter 1 to add new Contact ");
			System.out.println(" Enter 2 to edit existing contact ");
			System.out.println(" Enter 3 to delete existing contact ");
			System.out.println(" Enter 4 to Exit ");
			System.out.print(" Enter your choice : ");
			int input = scannerInt.nextInt();
			switch (input) {
			case 1:
				System.out.println(" :::::: add Contact :::::: ");
				addressBook.addContact();
				break;
			case 2:
				System.out.println(" :::::: edit Contact :::::: ");
				addressBook.editContact();
				break;
			case 3:
				System.out.println(" :::::: delete Contact :::::: ");
				addressBook.deleteContact();
				break;
			case 4:
				System.out.println(" :::::: exit from address book :::::: ");
				exit = 'y';
				break;
			}
		}
		System.out.println("exited ");
	}

}
