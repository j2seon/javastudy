package Exer2;

public class Child implements Test,Test1,Test2 {

	@Override
	public void test2() {
		System.out.println("test2 추상메소드 구현");
		
	}

	@Override
	public void test1() {
		System.out.println("test1 추상메소드 구현");
		
	}

	@Override
	public void test() {
		System.out.println("test 추상메소드 구현");
	}

}
