package com.addressbook.streamapi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("\n-------------Welcome to Address Book-----------");
		Scanner scanner = new Scanner(System.in);
		Map<Integer, AddressBook> multiAddressBook = new HashMap<>();
		AddressBook comapnyAddressBook = new AddressBook();
		AddressBook employeeAddressBook = new AddressBook();
		AddressBook customerAddressBook = new AddressBook();
		char c='n';
		while (c!='y') {
			System.out.println("\n Enter 1 to access company address book  "
							 + "\n Enter 2 to access employee address book "
					    	 + "\n Enter 3 to access customer address book "
						     + "\n Enter 4 to exit ");
			System.out.print(" Enter you choice : ");
			int input = scanner.nextInt();
			
			switch (input) {
			case 1:
				System.out.println("\n------- Welcome to company address Book -------- ");
				multiAddressBook.put(1, comapnyAddressBook.addressBookRunner("company"));
				break;
			case 2:
				System.out.println("\n------ Welcome to employee address book -------- ");
				multiAddressBook.put(2, employeeAddressBook.addressBookRunner("employee"));
				break;
			case 3:
				System.out.println("\n------ Welcome to customer address book -------- ");
				multiAddressBook.put(3, customerAddressBook.addressBookRunner("customer"));
				break;
			case 4:
				System.out.println("\n------------------ exited ---------------------- ");
				c='y';
				break;
			default:
				System.out.println("\n----------------- Wrong Input ------------------ ");
				break;
			}
		}
		scanner.close();
	}
}
