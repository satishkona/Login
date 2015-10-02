<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<html:html>
<head>
<title>
<bean:message key="loginForm.head"/>
</title>
<link rel="stylesheet" href="../extensions/basic-standard.css" type="text/css" media="screen,projection,print" />
</head>
<body id="master" class="main nojs">
	<div id="logincontainermain">

		<div id="headerlogin">
			<h1 id="logologin"></h1>
			<h2><bean:message key="loginForm.head"/></h2>
		</div>
		<html:form  action="/jsp/loginAction">
			<div id="logincontainer">
		  
				<div id="loginError" style="position:relative; top: 350px; left: 500px;">
					<table border="0" cellspacing="0" cellpadding="0" width="500">
						<tr>
							<td valign="top">
		  
							</td>
							<td>
								<div class="h4"><html:errors/></div>
							</td>
						</tr>
					</table>
				</div>  
				<div id="logincontent">
					<div class="row">
							<label for="user_name"><bean:message key="loginForm.userName"/>:</label>		
								<html:text property="userName"  maxlength="12"  name="loginForm" styleClass="input"/>
					</div>
				<div class="row">
					<label for="user_password"><bean:message key="loginForm.passWord" />:</label>
							<html:password property="passWord"  name="loginForm" styleClass="input"/>
				</div>
				<div class="row submit_row">		
						<html:submit property="login"  styleClass="buttonlogin">
								<bean:message key="loginForm.login"/>
						</html:submit>
				</div> 
			</div>
		</html:form>
	</div>
</body>
</html:html>