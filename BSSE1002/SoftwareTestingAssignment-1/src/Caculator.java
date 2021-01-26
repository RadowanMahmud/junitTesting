import java.util.List;

public class Caculator {

	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public int add(List<Integer>a) {
		
		Integer temp=0;
		for (Integer num : a) {
			temp+=num;
		}
		return temp;
		
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
}
