package com.sample.login.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
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

public class LoginForm extends ActionForm
{

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;

    private String userName;

    private String passWord;

    private String information;
    
    private String login;

    public String getInformation()
    {
        return information;
    }

    public void setInformation(String information)
    {
        this.information = information;
    }

    public String getPassWord()
    {
        return passWord;
    }

    public void setPassWord(String passWord)
    {
        this.passWord = passWord;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
    {
        ActionErrors actionErrors = new ActionErrors();
        String userName = request.getParameter(LoginConstants.USERNAME);
        String passWord = request.getParameter(LoginConstants.PASSWORD);
        if (userName == null || userName.equals(""))
            actionErrors.add(LoginConstants.USERNAME, new ActionMessage("error.userName.required"));
        else if (userName.length() < 6)
        {
            actionErrors.add(LoginConstants.USERNAME, new ActionMessage("error.userName.length"));
        }
        else if (passWord == null || passWord.equals(""))
            actionErrors.add(LoginConstants.PASSWORD, new ActionMessage("error.passWord.required"));
        else if (passWord.length() < 8)
        {
            actionErrors.add(LoginConstants.PASSWORD, new ActionMessage("error.passWord.length"));
        }
        else if (!(userName.equals(LoginConstants.INPUT_USERNAME) && passWord.equals(LoginConstants.INPUT_PASSWORD)))
        {
            actionErrors.add(LoginConstants.PASSWORD, new ActionMessage("error.passWord.username"));
        }
        return actionErrors;

    }

    public void reset()
    {
        System.out.println("reset called");
        this.userName="";
        this.passWord="";
    }

    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

}
