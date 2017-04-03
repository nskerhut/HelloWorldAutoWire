package com.csra.autowire;

public class HelloSystem {
	private HelloWorldModel world;
	
	//For ByName Autowire
	private HelloWorldModel helloWorldModel;
	/**
	 * @return the world
	 */
	public HelloWorldModel getWorld() {
		return world;
	}

	/**
	 * @param world the world to set
	 */
	public void setWorld(HelloWorldModel world) {
		this.world = world;
	}
	
	public HelloSystem(){}

	
	/**
	 * Used for constructor autowire. 
	 * @param myModel
	 */
	public HelloSystem(HelloWorldModel myModel){
		this.world = myModel;
		this.helloWorldModel = myModel;
	}
	/**
	 * @return the helloWorldModel
	 */
	public HelloWorldModel getHelloWorldModel() {
		return helloWorldModel;
	}

	/**
	 * @param helloWorldModel the helloWorldModel to set
	 */
	public void setHelloWorldModel(HelloWorldModel helloWorldModel) {
		this.helloWorldModel = helloWorldModel;
	}
}
