public class Contact {
	Contact() {
	}

	/**
	 * Sets last name
	 * @param n Last name
	 */
	public void setLastName(String n) {

		if( !nameIsValid(n) ) {
			System.out.println( "Invalid characters in last name" );
		} else {
			lName = n;
		}
	}

	/**
	 * Gets the last name
	 * @return Last name
	 */
	public String getLastName() {
		return lName;
	}

	/**
	 * Sets first name
	 * @param n First name
	 */
	public void setFirstName(String n) {
		if( !nameIsValid(n) ) {
			System.out.println( "Invalid characters in first name" );
		} else {
			fName = n;
		}
	}

	/**
	 * Gets the first name
	 * @return First name
	 */
	public String getFirstName() {
		return fName;
	}

	/**
	 * Sets middle name
	 * @param n Middle name
	 */
	public void setMiddleName(String n) {
		if( !nameIsValid(n) ) {
			System.out.println( "Invalid characters in middle name" );
		} else {
			mName = n;
		}
	}

	/**
	 * Gets the middle name
	 * @return Middle name
	 */
	public String getMiddleName() {
		return mName;
	}

	/**
	 * Sets prefix
	 * @param n prefix
	 */
	public void setPrefix(String n) {
		prefix = n;
	}

	/**
	 * Gets the prefix
	 * @return prefix
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * Sets phone number
	 * @param n Phone number
	 */
	public void setPhone(String n) {

		if( !phoneIsValid(n) ) {
			System.out.println( "Invalid phone number format." );
		} else {
			phone = n;
		}
	}

	/**
	 * Gets the phone number
	 * @return Phone number
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets email address
	 * @param n Email address
	 */
	public void setEmail(String n) {
		email = n;
	}

	/**
	 * Gets the email address
	 * @return Email address
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets street name
	 * @param n Street name
	 */
	public void setStreet(String n) {

		if( !nameIsValid(n) ) {
			System.out.println( "Invalid characters in street name" );
		} else {
			street = n;
		}
	}

	/**
	 * Gets the street name
	 * @return Street name
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Sets city name
	 * @param n City name
	 */
	public void setCity(String n) {

		if( !nameIsValid(n) ) {
			System.out.println( "Invalid characters in city name" );
		} else {
			city = n;
		}
	}

	/**
	 * Gets the city name
	 * @return City name
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets state name
	 * @param n State name
	 */
	public void setState(String n) {

		if( !nameIsValid(n) ) {
			System.out.println( "Invalid characters in state name" );
		} else {
			state = n;
		}
	}

	/**
	 * Gets the state name
	 * @return State name
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets zip code
	 * @param n Zip code
	 */
	public void setZip(String n) {

		if( !zipIsValid(n) ) {
			System.out.println( "Invalid zip code format." );
		} else {
			zip = n;
		}
	}

	/**
	 * Gets the zip code
	 * @return Zip code
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Sets occupation
	 * @param n Occupation
	 */
	public void setOccupation(String n) {
		occupation = n;
	}

	/**
	 * Gets the occupation
	 * @return Occupation
	 */
	public String getOccupation() {
		return occupation;
	}

	/**
	 * Checks to see if a string is just composed of only letters and spaces
	 * @param n The string to validate
	 * @return True if valid, False if invalid
	 */
	public boolean nameIsValid(String n) {

		if (n.matches("^[- 'A-Za-z]+$")){
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checks to see if a string is in valid phone number format
	 * @param n The string to validate
	 * @return True if valid, False if invalid
	 */
	public boolean phoneIsValid(String n) {

		if (n.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")){
			return true;
		} else {
			System.out.println("THEN WHO WAS PHONE?");
			return false;
		}
	}

	/**
	 * Checks to see if a string is in valid zip code format, works with zip+4
	 * @param n The string to validate
	 * @return True if valid, False if invalid
	 */
	public boolean zipIsValid(String n) {

		if (n.matches("([0-9]{5})(-[0-9]{4})?")){
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Name (first, last, middle)
	 * Prefix
	 * Phone number
	 * email
	 * address (street, city, state, zip)
	 * occupation
	 */
	private String lName,fName, mName;
	private String prefix;
	private String phone;
	private String email;
	private String street, city, state, zip;
	private String occupation;

}
