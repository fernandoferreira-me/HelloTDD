package br.edu.infnet.fernandogferreira;

public class Template {
	private String templateText;

	public Template(){
		
	}
	public Template(String templateText){
		this.templateText = templateText;
	}
	
	public String render() {
		return this.templateText;
	}

}
