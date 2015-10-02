package com.libraryathome.pickup.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.libraryathome.pickup.form.PickupForm;
import com.libraryathome.registration.vo.RegistrationVO;
import com.sample.login.util.LoginConstants;

public class PickupAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException{
		
		PickupForm registration = (PickupForm)form;
		
		HttpSession session = request.getSession();
		RegistrationVO vo = (RegistrationVO) session.getAttribute("registerVO");
		
		System.out.println("Address is ======:"+vo.getAddress());
		Double weight = registration.getPackageWeight();
		String date = registration.getPickupDate();
		
		registration.setRegisterInfo(vo);
		System.out.println("Weight is :"+weight);
		String forwardPath = null;	
		forwardPath =  LoginConstants.SUCCESS;;
		return mapping.findForward(forwardPath);
	
	}

}
