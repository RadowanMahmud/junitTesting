
public class GradeCalculator {

	public String getGrade(int mid, int ct, int finalExam, int attendance) {
		int total = mid+ct+finalExam+attendance;
		String grade = "";
		if(total >= 80) {
			grade = "A+";
		}
		if(total >=70) {
			grade = "A";
		}
		if (total >= 60) {
			grade = "B";
		}
		if (total >= 50) {
			grade = "C";
		}
		if (total <= 50) {
			grade = "F";
		}
		return grade;
	}

	/*
	 * grade will bet one of the followings - A+, A, B, C and F.
	 * 
	*/
	public double getGPA(String grade) {
		
		double gpa = 0.0;
		if(grade == "A+") {
			gpa = 4.00;
		}
		if(grade == "A") {
			gpa = 3.50;
		}
		if(grade == "B") {
			gpa = 3.00;
		}
		if(grade == "C") {
			return 2.00;
		} else {
			gpa = 0.0;
		}
		return gpa;
	}
}
