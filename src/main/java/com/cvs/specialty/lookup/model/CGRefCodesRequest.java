package com.cvs.specialty.lookup.model;

import java.util.List;

public class CGRefCodesRequest {
	
	private List<String> codeDomainName;
	private List<String> codeLowValueText;
	
	
	public List<String> getCodeDomainName() {
		return codeDomainName;
	}
	public void setCodeDomainName(List<String> codeDomainName) {
		this.codeDomainName = codeDomainName;
	}
	public List<String> getCodeLowValueText() {
		return codeLowValueText;
	}
	public void setCodeLowValueText(List<String> codeLowValueText) {
		this.codeLowValueText = codeLowValueText;
	}
	
	

}
