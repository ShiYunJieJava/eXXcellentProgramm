package de.exxcellent.challenge.pojo;

public class Football extends BasicObject {
	
	//Attribute
	private Integer id;
	private String name;
	private Integer Goals;
	private Integer GoalsAllowed;
	
	// other Attribute...
	
	//Constructor
	public Football() {
		super();
	}
	
	public Football(Integer id, String name, Integer goals, Integer goalsAllowed) {
		super();
		this.id = id;
		this.name = name;
		Goals = goals;
		GoalsAllowed = goalsAllowed;
	}
	
	//getter/setter
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGoals() {
		return Goals;
	}
	public void setGoals(Integer goals) {
		Goals = goals;
	}
	public Integer getGoalsAllowed() {
		return GoalsAllowed;
	}
	public void setGoalsAllowed(Integer goalsAllowed) {
		GoalsAllowed = goalsAllowed;
	}
	
	//other getter/setter ...
	
	// get Difference between Goals and GoalsAllowed
	public Integer getDiff() {
		// TODO Auto-generated method stub
		return (Goals-GoalsAllowed);
	} 

}
