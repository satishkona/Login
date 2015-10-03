<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<html:html>
<head>
<link rel="stylesheet" href="../extensions/basic-standard.css" type="text/css" media="screen,projection,print" />


</head>
<body id="master" class="main nojs">
<div id="logincontainermain">

    
	
<div id="logincontainer">
  
  			
		<div id="logincontent">
			<div class="row">
					<label for="user_name"></label>		
						<bean:write property="userName"    name="loginForm" />
			</div>
        <div class="row">
          <label for="user_password"></label>
			<bean:write property="information"    name="loginForm" />
		</div>
       
		 </div>
	
	</div>
</body>
</html:html>