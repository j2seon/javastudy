package Exer2.Shap;

public class ShapTest {

	public static void main(String[] args) {
		float width=20;
		float height=30;
		float area;
		
		Shap s1= new Triangle();
		Shap s2= new Rectacle();
		
		area=s1.calcArea(width, height);
		System.out.println(area);
		area =s2.calcArea(width, height);
		System.out.println(area);
	}

}
