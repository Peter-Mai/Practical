// Java program to read from file "friendsContact.txt"
// and display the contacts

package dictionary;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;

class Dictionary {

	public static void main(String data[])
	{

		try {

			String nameNumberString;
			String name;
			String number;

			// Using file pointer creating the file.
			File file = new File("dictionary.txt");

			if (!file.exists()) {

				// Create a new file if not exists.
				file.createNewFile();
			}

			// Opening file in reading and write mode.

			RandomAccessFile raf
				= new RandomAccessFile(file, "rw");
			boolean found = false;

			// Traversing the file
			// getFilePointer() give the current offset
			// value from start of the file.
			while (raf.getFilePointer() < raf.length()) {

				// reading line from the file.
				nameNumberString = raf.readLine();

				// splitting the string to get name and
				// number
				String[] lineSplit
					= nameNumberString.split("!");

				// separating name and number.
				name = lineSplit[0];
				number = "fruit";

				// Print the contact data
				System.out.println(
					 name + "-"
					 + number + "\n");
			}
		}

			catch (IOException ioe)
			{

				System.out.println(ioe);
			}
			catch (NumberFormatException nef)
			{

				System.out.println(nef);
			}
		}
	}

