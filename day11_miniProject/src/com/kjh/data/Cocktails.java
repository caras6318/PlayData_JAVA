package com.kjh.data;

public class Cocktails {

	
	private int cRN = 0; 			//CocktailsRecipeNumber
	private String cImgUrl = "";	//CocktailsIMGUrl
	private String cRUrl = ""; 		//CocktailsRecipeUrl
	private String cName = ""; 		//CocktailsName
	private String cIn = ""; 		//CocktailsIngredient
	private String cMeth= ""; 		//CocktailsMethod
	private String cGar = ""; 		//CocktailsGarnish
	
	public Cocktails() {//생성자 
		
	}
	
	public Cocktails(int cRN, String cImgUrl, String cRUrl, String cName, String cIn, String cMeth, String cGar) {
		
		this.cRN = cRN;
		this.cImgUrl = cImgUrl;
		this.cRUrl = cRUrl;
		this.cName = cName;
		this.cIn = cIn;
		this.cMeth = cMeth;
		this.cGar = cGar;
	}
	
public Cocktails(String cName, String cIn, String cMeth, String cGar) {
		
		this.cName = cName;
		this.cIn = cIn;
		this.cMeth = cMeth;
		this.cGar = cGar;
	}

	public int getcRN() {
		return cRN;
	}

	public void setcRN(int cRN) {
		this.cRN = cRN;
	}

	public String getcImgUrl() {
		return cImgUrl;
	}

	public void setcImgUrl(String cImgUrl) {
		this.cImgUrl = cImgUrl;
	}

	public String getcRUrl() {
		return cRUrl;
	}

	public void setcRUrl(String cRUrl) {
		this.cRUrl = cRUrl;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcIn() {
		return cIn;
	}

	public void setcIn(String cIn) {
		this.cIn = cIn;
	}

	public String getcMeth() {
		return cMeth;
	}

	public void setcMeth(String cMeth) {
		this.cMeth = cMeth;
	}

	public String getcGar() {
		return cGar;
	}

	public void setcGar(String cGar) {
		this.cGar = cGar;
	}
	@Override
	public String toString() {
		return "Cocktails [cRN=" + cRN + ", cImgUrl=" + cImgUrl + ", cRUrl=" + cRUrl + ", cName=" + cName + ", cIn="
				+ cIn + ", cMeth=" + cMeth + ", cGar=" + cGar + "]";
	}	
	
	

}
