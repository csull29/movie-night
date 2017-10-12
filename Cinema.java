/*
Cinema.java
author @ C Sullivan
21/02/2017
*/

//aged 5 and over 60 - free
//<14 is 5 euro
//anyone else is 10 euro

public class Cinema{

	//data members
	private int age; //store the age
	private String message; // store the print out message

	//constructor
	public Cinema(){
		age=0;


	}

	//setters
	public void setAge(int age){
		this.age=age;
	}

	//compute
	public void compute(){
		if(age<=5||age>=60){
			message="Your admission is free";
		}

		else if(age>5&&age<=14){
			message="Your admission is 5 euro";
		}

		else{
			message="Your admission is 10 euro";
		}

}
		//getters
		public String getMessage(){
			return message;
		}


	}







