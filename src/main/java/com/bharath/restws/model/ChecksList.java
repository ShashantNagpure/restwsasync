package com.bharath.restws.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.bharath.restws.model.Check;
@XmlRootElement
public class ChecksList {
	private List<Check>checks;

	public List<Check> getChecks() {
		return checks;
	}

	public void setChecks(List<Check> checks) {
		this.checks = checks;
	}

}
