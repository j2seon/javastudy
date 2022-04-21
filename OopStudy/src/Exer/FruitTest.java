package Exer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


class Fruit {
	String name;
	String color;
	int large;

	public Fruit(String name,String color,int large) {
		this.name = name;
		this.color=color;
		this.large=large;			
		
	}

	@Override
	public String toString() {
		return "과일의 이름 : <"+name+">이고, 색깔은 <"+color+">이고, 크기는 <"+large+"> 입니다.";
	}
	
	
}

class apple extends Fruit{

	public apple(String name, String color, int large) {
		super(name, color, large);
	
	}
}
class Orange extends Fruit{

	public Orange(String name, String color, int large) {
		super(name, color, large);
	}
}

class bananan extends Fruit{

	public bananan(String name, String color, int large) {
		super(name, color, large);
	}
}



public class FruitTest {
	
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<Fruit> arr = new ArrayList<Fruit>();
	
	public static void addApple()  throws InputMismatchException{
		System.out.print("과일명 : ");
		String name=scanner.next();
		System.out.print("색깔 : ");
		String color=scanner.next();
		System.out.print("크기 : ");
		int size=scanner.nextInt();
		apple apple1 = new apple(name, color, size);
		arr.add(apple1);
	}
	public static void addOrange() throws InputMismatchException {
		System.out.print("과일명 : ");
		String name=scanner.next();
		System.out.print("색깔 : ");
		String color=scanner.next();
		System.out.print("크기 :");	
		int size=scanner.nextInt();
		Orange orange = new Orange(name, color, size);
		arr.add(orange);
		
		
	}
	public static void addBanana() throws InputMismatchException{
		System.out.print("과일명 :");
		String name=scanner.next();
		System.out.print("색깔 : ");
		String color=scanner.next();
		System.out.print("크기 : ");
		int size=scanner.nextInt();
		bananan bananana = new bananan(name, color, size);
		arr.add(bananana);
	}
	
	public static void showInfo() {
		for(Fruit fruit : arr) {
			System.out.println(fruit);
		}
		
	}
	

	public static void main(String[] args) {
		boolean run= true;
		Fruit fruit;
		int choice=0;
		outLoop:
		while(run) {
			try {
			System.out.println("===========================================================");
			System.out.println("1. 사과  |  2.오렌지  |  3.바나나  |  4.정보출력  |  5.프로그램 종료");
			System.out.println("===========================================================");
			System.out.println("선택 >>");
			 
				
				choice = scanner.nextInt();
			
				switch(choice) {
				case 1:
					addApple();
					break;
				case 2:addOrange();
					break;
				case 3:addBanana();
					break;
				case 4:
					showInfo();
					break;
				case 5:
					run = false;

				}
			}catch (Exception e) {
				System.out.println("예외발생: 자료형에 맞게 똑똑히 입력 해주세요.  ");
				scanner = new Scanner(System.in);
				continue outLoop; 
			}
			
			}
		System.out.println("프로그램 종료");
		}
}

