package com.fmvcw.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ViewHomeController implements Controller {
	String logicalViewName = null;

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		/**
		 * Class ModelAndView refers data(Model) and 'page to render the
		 * data'(View), so it holds two information about Model(data) and
		 * View(page to render the data)
		 */
		ModelAndView modelAndView = null;

		modelAndView = new ModelAndView();
		modelAndView.setViewName(logicalViewName);

		return modelAndView;
	}

	public String getLogicalViewName() {
		return logicalViewName;
	}

	public void setLogicalViewName(String logicalViewName) {
		this.logicalViewName = logicalViewName;
	}

}
