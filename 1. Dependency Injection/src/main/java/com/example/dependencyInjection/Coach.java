package com.example.dependencyInjection;

public interface Coach {


	public String getDailyWorkout();
	
	public String getDailyFortune();

	public String getTeam();

	public String getEmailAddress();

	public void setTeam(String team);

	public void setEmailAddress(String emailAddress);

}
