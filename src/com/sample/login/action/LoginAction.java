package com.sample.login.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sample.login.form.LoginForm;
import com.sample.login.util.LoginConstants;

/**
 * (- short class description -) <pre>
 * %full_filespec: Code_Templates_1.0.xml~1:XML:1 %
 * %derived_by: %
 * %date_created: %
 *
 * Copyright (C) 2001, Deutsche Bank AG
 * </pre>
 * @author  (-author-)
 * @version %version: %
 */

public class LoginAction extends Action
{
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                 HttpServletResponse response) throws IOException, ServletException
    {
        LoginForm loginForm = (LoginForm)form;
        //loginForm.reset();
        String userName = request.getParameter(LoginConstants.USERNAME);
        String passWord = request.getParameter(LoginConstants.PASSWORD);
        loginForm.setUserName(userName);
        loginForm.setPassWord(passWord);
        String forwardPath = null;
        //PrintWriter out=response.getWriter();
        if (userName != null && passWord != null)
        {
            if (userName.equals(LoginConstants.INPUT_USERNAME) && passWord.equals(LoginConstants.INPUT_PASSWORD))
            {
                loginForm.setInformation("user logged in successfully");
                forwardPath = LoginConstants.SUCCESS;
            }
            else
            {
                forwardPath = LoginConstants.FAILURE;
                loginForm.reset();
            }
        }
        return mapping.findForward(forwardPath);

    }
}
