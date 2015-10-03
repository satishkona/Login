package com.libraryathome.registration.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.libraryathome.registration.form.RegistrationForm;
import com.libraryathome.registration.vo.RegistrationVO;
import com.sample.login.util.LoginConstants;

public class RegistrationAction extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException{
		
		RegistrationForm registration = (RegistrationForm)form;
		String firstName = registration.getFirstName();
        String lastName = registration.getLastName();
        String email = registration.getEmail();
        String address = registration.getAddress();
        String mobile = registration.getMobile();
        
        String add = registration.getAddress();
        System.out.println("Address is :"+ add);
        
        RegistrationVO regVO = new RegistrationVO();
        regVO.setFirstName(firstName);
        regVO.setLastName(lastName);
        regVO.setEmail(email);
        regVO.setMobile(mobile);
        regVO.setAddress(address);
        
        HttpSession session = request.getSession();
        session.setAttribute("registerVO", regVO);
		String forwardPath = null;	
		forwardPath =  LoginConstants.SUCCESS;;
		return mapping.findForward(forwardPath);
		
	}

}
