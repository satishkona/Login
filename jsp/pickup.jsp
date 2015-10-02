<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>
<html:html>
<head>
<link rel="stylesheet" href="../extensions/basic-standard.css"
	type="text/css" media="screen,projection,print" />

<style type="text/css">
h3 {
	font-family: Calibri;
	font-size: 22pt;
	font-style: normal;
	font-weight: bold;
	color: Red;
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
	<h3>Pickup Details</h3>


	<html:form action="/jsp/PickupAction">
		<table border="0" cellspacing="0" cellpadding="0" 
			align="center" width="300" style="background-color:Red">
			<tr>
				<td valign="top"></td>
				<td><html:errors /></td>
			</tr>
		</table>


		<table align="center" cellpadding="10">

			<tr>
				<td><label for="date"><bean:message
							key="pickupform.date" />:</label></td>
				<td><html:text property="pickupDate" title="PickupDate"
						name="PickupForm"></html:text></td>
			</tr>
			<tr>
				<td><label for="weight"><bean:message
							key="pickupform.weight" />:</label></td>
				<td><html:text property="packageWeight" title="Weight"
						name="PickupForm"></html:text></td>
			</tr>
			<tr>
				<td><label for="description"><bean:message
							key="pickupform.packagedescription" />:</label></td>
				<td><html:text property="packageDescription"
						title="Description" name="PickupForm"></html:text></td>
			</tr>
			<tr>
				<td><label for="cost"><bean:message
							key="pickupform.packagecost" />:</label></td>
				<td><html:text property="packageCost" title="cost"
						name="PickupForm"></html:text></td>
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