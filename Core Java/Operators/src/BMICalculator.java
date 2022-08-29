
public class BMICalculator {
	public static void main(String[] args) {
		double height = 5.3;
		double weight = 52;
		double heightinmet = height * 0.4536;
		double bmi = weight/(heightinmet * heightinmet);
		System.out.println(bmi);
	}
}
