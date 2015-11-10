package com.anup.woodstock.web.jsf.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.anup.woodstock.web.jsf.model.URLModel;


@ManagedBean(name ="searchURLController")
@ViewScoped
public class SearchURLController implements Serializable {

	public static final long serialVersionUID = 1L;
	//private static Logger logger = Logger.getLogger(SearchUserController.class.getSimpleName());
	
	@ManagedProperty(value="#{urlModel}")
	private URLModel urlModel;


    public URLModel getURLModel() {
		return urlModel;
	}


	public void setURLModel(URLModel urlModel) {
		this.urlModel = urlModel;
	}


	public void searchUser() {
    	System.out.println("in searchUuser ..."+urlModel.toString());

    }
}