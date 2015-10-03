package com.libraryathome.registration.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.libraryathome.registration.util.RegistrationConstants;

public class RegistrationForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String address;
	private String register;
	private String state;
	private String country;
	private String gender;
	private String pinCode;
	private String city;

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}

	/**
	 * @param pinCode
	 *            the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the register
	 */
	public String getRegister() {
		return register;
	}

	/**
	 * @param register
	 *            the register to set
	 */
	public void setRegister(String register) {
		this.register = register;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors actionErrors = new ActionErrors();
		String firstName = request.getParameter(RegistrationConstants.FIRSTNAME);
		String lastName = request.getParameter(RegistrationConstants.LASTNAME);
		String email = request.getParameter(RegistrationConstants.EMAIL);
		String address = request.getParameter(RegistrationConstants.ADDRESS);
		String mobile = request.getParameter(RegistrationConstants.MOBILE);
		String city = request.getParameter(RegistrationConstants.CITY);
		String state = request.getParameter(RegistrationConstants.STATE);
		String country = request.getParameter(RegistrationConstants.COUNTRY);
		String pinCode = request.getParameter(RegistrationConstants.PINCODE);
		System.out.println("Pin code is :"+pinCode);

		if (firstName == null || firstName.equals(""))
			actionErrors.add(RegistrationConstants.FIRSTNAME, new ActionMessage("error.firstName.required"));

		else if (lastName == null || lastName.equals(""))
			actionErrors.add(RegistrationConstants.LASTNAME, new ActionMessage("error.lastName.required"));

		else if (email == null || email.equals(""))
			actionErrors.add(RegistrationConstants.EMAIL, new ActionMessage("error.email.required"));

		else if (address == null || address.equals(""))
			actionErrors.add(RegistrationConstants.ADDRESS, new ActionMessage("error.address.required"));

		else if (state == null || state.equals(""))
			actionErrors.add(RegistrationConstants.STATE, new ActionMessage("error.state.required"));

		else if (city == null || city.equals(""))
			actionErrors.add(RegistrationConstants.CITY, new ActionMessage("error.city.required"));

		else if (country == null || country.equals(""))
			actionErrors.add(RegistrationConstants.COUNTRY, new ActionMessage("error.country.required"));

		else if (pinCode == null || pinCode.equals(""))
			actionErrors.add(RegistrationConstants.PINCODE, new ActionMessage("error.pincode.required"));

		else if (mobile == null || mobile.equals("") || "0".equals(mobile))
			actionErrors.add(RegistrationConstants.MOBILE, new ActionMessage("error.mobile.required"));

		else if (!emailValidation(email))
			actionErrors.add(RegistrationConstants.EMAIL, new ActionMessage("error.email.format"));
		else if (!mobileValidation(mobile))
			actionErrors.add(RegistrationConstants.MOBILE, new ActionMessage("error.mobile.format"));
		else if (!pinCodeValidation(pinCode))
			actionErrors.add(RegistrationConstants.PINCODE, new ActionMessage("error.pincode.length"));

		return actionErrors;

	}

	  public void reset()
	    {
	        System.out.println("reset called");
	        this.firstName = "";
	    	this.lastName = "";
	    	this.email = "";
	    	this.mobile = "";
	    	this.address = "";
	    	this.register = "";
	    	this.state = "";
	    	this.country = "";
	    	this.gender = "";
	    	this.pinCode = "";
	    	this.city = "";
	    }
	
	private boolean emailValidation(String emailId) {
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(EMAIL_REGEX);
	}

	private boolean mobileValidation(String mobileNumber) {
		return mobileNumber.matches("\\d{10}");
	}

	private boolean pinCodeValidation(String mobileNumber) {
		return mobileNumber.matches("\\d{6}");
	}

}
