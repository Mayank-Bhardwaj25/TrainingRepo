package UniversityExamManagementSystem;

public class UniversityRules {
	// making it final and static so that these properties remain common to all instances i will create further and cant be changed
	static final int minAttendPer= 75;
	static final String universityCode = "xxxxx";
	static int no_of_hallTicket =  1000;
	
	static String generateHallTicket() {
		no_of_hallTicket +=1;
		return universityCode + no_of_hallTicket;
	}

}

