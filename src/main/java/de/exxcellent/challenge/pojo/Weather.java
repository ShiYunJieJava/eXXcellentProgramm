package de.exxcellent.challenge.pojo;

public class Weather extends BasicObject{
	
	//Attribute
	private Integer id;
	private String day;
	private Integer MxT;
	private Integer MnT;
	
	//other Attribute ...
	
	//Constructor
	public Weather() {
		super();
	}
	public Weather(Integer id, String day, Integer mxT, Integer mnT) {
		super();
		this.id = id;
		this.day = day;
		MxT = mxT;
		MnT = mnT;
	}
	
	//getter/setter...
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public Integer getMxT() {
		return MxT;
	}
	public void setMxT(Integer mxT) {
		MxT = mxT;
	}
	public Integer getMnT() {
		return MnT;
	}
	public void setMnT(Integer mnT) {
		MnT = mnT;
	}
	
	//other getter/setter...
	
	// get Difference between Max and Min
	public Integer getDiff() {
		return MxT-MnT;
	}
}
