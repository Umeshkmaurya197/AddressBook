package com.addressbook.streamapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
	static Scanner scannerInt = new Scanner(System.in);
	static Scanner scannerStr = new Scanner(System.in);
	static AddressBook addressBook;
	Map<Integer, AddressBook> multiAddressBook = new HashMap<>(); ;
	static List<String> addressBookList = new ArrayList<>();;

	public void multiAddressBook(String addressBookName) {
		
		char c = 'n';
		int i = 1;
		while (c != 'y') {
			System.out.println("\n Enter 1 to access "+addressBookName+" address book  " + "\n Enter 2 to exit ");
			System.out.print(" Enter you choice : ");
			int input = scannerInt.nextInt();

			switch (input) {
			case 1:
				multiAddressBook.put(i, addressBook.addressBookRunner(addressBookName));
				i++;
				System.out.println("Address Book List :"+addressBookList);
				break;
			case 2:
				System.out.println("\n------------------ exited ---------------------- ");
				c = 'y';
				break;
			default:
				System.out.println("\n----------------- Wrong Input ------------------ ");
				break;
			}
		}
	}

	

	public static void main(String[] args) {
		System.out.println("-------------Welcome to Address Book-----------");
		AddressBookMain addressBookMain = new AddressBookMain();

		addressBook = new AddressBook();
		char c = 'n';
		while (c != 'y') {
			System.out.println("\n Enter 1 to add new address book \n Enter 2 to exit  ");
			System.out.print("\n Enter your choice : ");
			int input = scannerInt.nextInt();
			switch (input) {
			case 1:
				System.out.print(" Enter address book name :");
				String addressBookName = scannerStr.nextLine();
				addressBookList.add(addressBookName);
				addressBookMain.multiAddressBook(addressBookName);
				break;
			case 2:
				System.out.println(" ----------------- Exited -------------------- ");
				c = 'y';
				break;
			default:
				System.out.println("---------------- Wrong input ----------------- ");
			}
		}
	}
}
