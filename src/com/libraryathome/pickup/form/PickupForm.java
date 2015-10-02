package com.libraryathome.pickup.form;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.libraryathome.registration.vo.RegistrationVO;

public class PickupForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double packageWeight;
	private String pickupDate;
	private String packageDescription;
	private double packageCost;
	private RegistrationVO registerInfo;

	/**
	 * @return the packageDescription
	 */
	public String getPackageDescription() {
		return packageDescription;
	}

	/**
	 * @param packageDescription
	 *            the packageDescription to set
	 */
	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}

	/**
	 * @return the packageCost
	 */
	public double getPackageCost() {
		return packageCost;
	}

	/**
	 * @param packageCost
	 *            the packageCost to set
	 */
	public void setPackageCost(double packageCost) {
		this.packageCost = packageCost;
	}

	/**
	 * @return the registerInfo
	 */
	public RegistrationVO getRegisterInfo() {
		return registerInfo;
	}

	/**
	 * @param registerInfo
	 *            the registerInfo to set
	 */
	public void setRegisterInfo(RegistrationVO registerInfo) {
		this.registerInfo = registerInfo;
	}

	/**
	 * @return the packageWeight
	 */
	public double getPackageWeight() {
		return packageWeight;
	}

	/**
	 * @param packageWeight
	 *            the packageWeight to set
	 */
	public void setPackageWeight(double packageWeight) {
		this.packageWeight = packageWeight;
	}

	/**
	 * @return the pickupDate
	 */
	public String getPickupDate() {
		return pickupDate;
	}

	/**
	 * @param pickupDate
	 *            the pickupDate to set
	 */
	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors actionErrors = new ActionErrors();
		String packageWeight = request.getParameter("packageWeight");
		String packageCost = request.getParameter("packageCost");
		String pickupDate = request.getParameter("pickupDate");
		String packageDescription = request.getParameter("packageDescription");
		

		if (packageWeight == null || packageWeight.equals("")||"0.0".equals(packageWeight))
			actionErrors.add("packageWeight", new ActionMessage("error.packageweight.required"));

		else if (packageCost == null || packageCost.equals("")||"0.0".equals(packageCost))
			actionErrors.add("packageCost", new ActionMessage("error.packagecost.required"));

		else if (pickupDate == null || pickupDate.equals(""))
			actionErrors.add("pickupDate", new ActionMessage("error.pickupdate.required"));

		else if (packageDescription == null || packageDescription.equals(""))
			actionErrors.add("packageDescription", new ActionMessage("error.packagedescription.required"));
		
		else if (!dateValidation(pickupDate))
			actionErrors.add("pickupDate", new ActionMessage("error.pickupdate.format"));

		return actionErrors;

	}

	private boolean dateValidation(String date)
	{
		String regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(date);
		
		return matcher.matches();
	}
}
