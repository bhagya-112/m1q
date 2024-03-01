package m1q2;

public class calcbmi {
	 
    public float getWeight(String str) {
        String[] temp = str.split("@");
        String rel = temp[0].replace("-", ".");
        return Float.valueOf(rel);
    }
 
    public float getHeight(String str) {
        String[] temp = str.split("@");
        String rel = temp[1].replace("-", ".");
        return Float.valueOf(rel);
    }
 
    public float calculateBMI(float weight, float height) {
            if (weight == 0 || height == 0) {
            	return -1;
        }
            else {
            	return weight / (height * height); // or any other appropriate value to indicate an error
        }
    }
 
    public static void main(String[] args) {
        calcbmi calculator = new calcbmi();
        String input = "70@1-75"; // Example input format: weight & height
        float weight = calculator.getWeight(input);
        float height = calculator.getHeight(input);
        float bmi = calculator.calculateBMI(weight, height);
        if (bmi != -1) {
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Height: " + height + " meters");
            System.out.println("BMI: " + bmi);
        }
    }
}
