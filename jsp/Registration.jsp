<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="../extensions/basic-standard.css"
	type="text/css" media="screen,projection,print" />

<title>Registration</title>
<style type="text/css">
h3 {
	font-family: Calibri;
	font-size: 22pt;
	font-style: normal;
	font-weight: bold;
	color: SlateBlue;
	text-align: center;
	text-decoration: underline
}

table {
	font-family: Calibri;
	color: white;
	font-size: 11pt;
	font-style: normal;
	text-align:;
	background-color: SlateBlue;
	border-collapse: collapse;
	border: 2px solid navy
}

table.inner {
	border: 0px
}
</style>
</head>
<body>
	<h3>Registration Form</h3>
	<html:form action="/jsp/RegistrationAction">
		<table border="0" cellspacing="0" cellpadding="0" 
			align="center" width="300" style="background-color:Red">
			<tr>
				<td valign="top"></td>
				<td><html:errors /></td>
			</tr>
		</table>

		<table align="center" cellpadding="10">

			<tr>
				<td><label for="first_name"><bean:message
							key="registrationForm.firstName" />:</label></td>
				<td><html:text property="firstName" title="First Name"
						name="RegistrationForm" maxlength=""></html:text></td>
			</tr>


			<tr>
				<td><label for="last_name"><bean:message
							key="registrationForm.lastName" />:</label></td>
				<td><html:text property="lastName" title="Last Name"
						name="RegistrationForm" maxlength="30"></html:text></td>
			</tr>


			<tr>
				<td><label for="email"><bean:message
							key="registrationForm.email" />:</label></td>
				<td><html:text property="email" title="Email"
						name="RegistrationForm" maxlength="100">Email</html:text></td>
			</tr>


			<tr>
				<td><label for="address"><bean:message
							key="registrationForm.address" />:</label></td>
				<td><html:textarea property="address" title="Address"
						name="RegistrationForm"></html:textarea></td>
			</tr>


			<tr>
				<td><label for="mobile"><bean:message
							key="registrationForm.mobile" />:</label></td>
				<td><html:text property="mobile" title="Mobile"
						name="RegistrationForm" maxlength="10"></html:text></td>
			</tr>





			<!----- Gender ----------------------------------------------------------->
			<tr>
				<td><label for="gender"><bean:message
							key="registrationForm.gender" />:</label></td>
				<td>Male <html:radio name="RegistrationForm" property="gender"
						value="Male" /> Female <html:radio name="RegistrationForm"
						property="gender" value="Female" />
				</td>
			</tr>


			<!----- City ---------------------------------------------------------->
			<tr>
				<td><label for="city"><bean:message
							key="registrationForm.city" />:</label></td>
				<td><html:text property="city" title="City"
						name="RegistrationForm" maxlength="30"></html:text></td>
			</tr>

			<!----- State ---------------------------------------------------------->
			<tr>
				<td><label for="state"><bean:message
							key="registrationForm.state" />:</label></td>
				<td><html:text property="state" title="state"
						name="RegistrationForm" maxlength="30"></html:text></td>
			</tr>

			<!----- Country ---------------------------------------------------------->
			<tr>
				<td><label for="country"><bean:message
							key="registrationForm.country" />:</label></td>
				<td><html:text property="country" title="country"
						name="RegistrationForm" maxlength="10" value="India"></html:text></td>
			</tr>
			<!----- Pin Code ---------------------------------------------------------->
			<tr>
				<td><label for="pincode"><bean:message
							key="registrationForm.pincode" />:</label></td>
				<td><html:text property="pinCode" title="pinCode"
						name="RegistrationForm" maxlength="6"></html:text></td>
			</tr>
			<tr>
				<td><html:submit property="register" styleClass="buttonlogin">
						<bean:message key="registrationForm.submit" />

					</html:submit></td>
			</tr>


		</table>





	</html:form>

</body>
</html:html>