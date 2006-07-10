/*
 * $Id: StrutsModels.java 418521 2006-07-01 23:36:50Z tmjee $
 *
 * Copyright 2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.struts2.views.jsp.ui;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.Component;
import org.apache.struts2.components.OptGroup;
import org.apache.struts2.views.jsp.ComponentTagSupport;
import com.opensymphony.xwork2.util.OgnlValueStack;

/**
 * 
 */
public class OptGroupTag extends ComponentTagSupport {

	private static final long serialVersionUID = 7367401003498678762L;

	protected String list;
	protected String label;
	protected String disabled;
	
	public Component getBean(OgnlValueStack stack, HttpServletRequest req, HttpServletResponse res) {
		return new OptGroup(stack, req, res);
	}

	protected void populateParams() {
		super.populateParams();
		
		OptGroup optGroup = (OptGroup) component;
		optGroup.setList(list);
		optGroup.setLabel(label);
		optGroup.setDisabled(disabled);
	}
	
	public void setList(String list) {
		this.list = list;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}
}