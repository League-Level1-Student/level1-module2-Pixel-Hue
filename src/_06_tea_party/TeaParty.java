package _06_tea_party;

public class TeaParty {
public String welcome(String name, boolean isWoman, boolean isKnighted) {
	String response = "Hello ";
	if(isWoman == true) {
		if(isKnighted) {
			response += "Lady ";
		}else {
			response += "Ms. ";
		}
	}else {
		if(isKnighted) {
			response += "Sir ";
		}
		else {
			response += "Mr. ";
		}
	}
	response += name;
	
	
	return response;
	}


}
