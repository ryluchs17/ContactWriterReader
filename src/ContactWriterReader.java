/**
 * Reads and writes the info in Contact classes
 * @author Ryan Luchs
 * 
 */

import java.io.*;
import java.util.Scanner;

/**
 * ContactReaderWriter main class
 * @author Ryan Luchs
 *
 */
public class ContactWriterReader {

	/**
	 * ContactReaderWriter main method
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		int i = 0;
		boolean keepWriting = true;
		String line;
		
		// Array to store contact classes in
		Contact[] contacts = new Contact[256];
		
		// The file the program interacts with
		File file;
		
		// To write to file
		PrintWriter write;
		
		// To read from file
		BufferedReader read;
		
		// For to read keyboard input
		Scanner scan = new Scanner(System.in);
		
		// get a file name from the user, without the / character, and ending in txt
		do {
			System.out.print("Enter a filename: ");
			line = scan.nextLine();
			
			if (!line.matches("[^/]+")) {
				System.out.println("Name must not include / character");
			}
			
			if (!line.matches("[ -~]+.txt")) {
				System.out.println("Filename must end in .txt");
			}
		} while (!line.matches("[^/]+") || !line.matches("[ -~]+.txt"));
		
		file = new File(line);
		
		// If the file exists, read it, if not, create it
		if (file.exists()) {
			
			read = new BufferedReader(new FileReader(file));
			
			System.out.printf("\n");
			
			// Read data into program
			while (read.ready() && i < 256) {
				
				contacts[i] = new Contact();
				
				contacts[i].setLastName(read.readLine());
				contacts[i].setFirstName(read.readLine());
				contacts[i].setMiddleName(read.readLine());
				contacts[i].setPrefix(read.readLine());
				contacts[i].setPhone(read.readLine());
				contacts[i].setEmail(read.readLine());
				contacts[i].setStreet(read.readLine());
				contacts[i].setCity(read.readLine());
				contacts[i].setState(read.readLine());
				contacts[i].setZip(read.readLine());
				contacts[i].setOccupation(read.readLine());
				read.readLine();
				
				i++;
			}
			
			// fixes an indexing error in the file
			i--;
			
			// fun facts
			if (i > 150) {
				System.out.printf("Did you know that the human brain can only comfortable maintain\n150 realtionaships at a time? It's called Dunbar's number.\n\n");
			}
			
			// print data
			for(int ctr = 0; ctr <= i; ctr++) {
		        System.out.println("Last name: " + contacts[ctr].getLastName());
		        System.out.println("First name: " + contacts[ctr].getFirstName());
		        System.out.println("Middle name: " + contacts[ctr].getMiddleName());
		        System.out.println("Prefix: " + contacts[ctr].getPrefix());
		        System.out.println("Phone number: " + contacts[ctr].getPhone());
		        System.out.println("Email address: " + contacts[ctr].getEmail());
		        System.out.println("Street: " + contacts[ctr].getStreet());
		        System.out.println("City: " + contacts[ctr].getCity());
		        System.out.println("State: " + contacts[ctr].getState());
		        System.out.println("ZIP code: " + contacts[ctr].getZip());
		        System.out.println("Occupation: " + contacts[ctr].getOccupation());
		        System.out.print('\n');
			}
			
//			while(read.ready()) {
//		        	System.out.println(read.readLine());
//		    }
			
			read.close();
			
		} else {
			
			write = new PrintWriter(file);
			
			// Get user input
			while (keepWriting && i < 256) {
				
				// Create the current contact class
				contacts[i] = new Contact();
				
				// Set and validate last name
		        do {
			        System.out.print("Enter the last name: ");
			        
			        line = scan.nextLine();
			        contacts[i].setLastName(line);
		        } while (!contacts[i].nameIsValid(line));
		        
		        // Set and validate first name
		        do {
			        System.out.print("Enter the first name: ");
			        
			        line = scan.nextLine();
			        contacts[i].setFirstName(line);
		        } while (!contacts[i].nameIsValid(line));
		        
		        // Set and validate middle name
		        do {
			        System.out.print("Enter the middle name: ");
			        
			        line = scan.nextLine();
			        contacts[i].setMiddleName(line);
		        } while (!contacts[i].nameIsValid(line));
		        
		        // Set prefix
		        System.out.print("Enter the prefix: ");
		        line = scan.nextLine();
		        contacts[i].setPrefix(line);
		        
		        // Set and validate phone number
		        do {
			        System.out.print("Enter the phone number: ");
			        
			        line = scan.nextLine();
			        contacts[i].setPhone(line);
		        } while (!contacts[i].phoneIsValid(line));
		        
		        // Set email address
		        System.out.print("Enter the email address: ");
		        line = scan.nextLine();
		        contacts[i].setEmail(line);
		        
		        // Set and validate street name
		        do {
			        System.out.print("Enter the street name: ");
			        
			        line = scan.nextLine();
			        contacts[i].setStreet(line);
		        } while (!contacts[i].nameIsValid(line));
		        
		        // Set and validate city name
		        do {
			        System.out.print("Enter the city name: ");
			        
			        line = scan.nextLine();
			        contacts[i].setCity(line);
		        } while (!contacts[i].nameIsValid(line));
		        
		        // Set and validate state name
		        do {
			        System.out.print("Enter the state name: ");

			        line = scan.nextLine();
			        contacts[i].setState(line);
		        } while (!contacts[i].nameIsValid(line));

		        // Set and validate zip code
		        do {
		        	System.out.print("Enter the zip code: ");

		        	line = scan.nextLine();
		        	contacts[i].setZip(line);
		        } while (!contacts[i].zipIsValid(line));

		        // Set occupation
		        System.out.print("Enter the occupation: ");
		        line = scan.nextLine();
		        contacts[i].setOccupation(line);
				
		        // Ask user if they are finished
		        System.out.print("Enter 'y' to continue: ");
		        line = scan.nextLine().toLowerCase();
		        
		        if (line.equals("y")) {
		        	i++;
		        	System.out.print('\n');
		        } else {
		        	keepWriting = false;
		        }
		        
			}
			
			// Write data to file
			for(int ctr = 0; ctr <= i; ctr++) {
		        write.println(contacts[ctr].getLastName());
		        write.println(contacts[ctr].getFirstName());
		        write.println(contacts[ctr].getMiddleName());
		        write.println(contacts[ctr].getPrefix());
		        write.println(contacts[ctr].getPhone());
		        write.println(contacts[ctr].getEmail());
		        write.println(contacts[ctr].getStreet());
		        write.println(contacts[ctr].getCity());
		        write.println(contacts[ctr].getState());
		        write.println(contacts[ctr].getZip());
		        write.println(contacts[ctr].getOccupation());
		        write.print('\n');
			}
			
			//write.println("[END OF LIST]");
			
			// Close the file
			write.close();
			
			// Thank the user
			System.out.printf("\nThank you! Your Contact information has been saved!\n");
			
		}

	}

}
