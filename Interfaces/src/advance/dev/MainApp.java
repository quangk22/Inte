package advance.dev;

import java.util.Scanner;

import advance.dev.dao.IManager;
import advance.dev.dao.Manager;
import advance.dev.model.Circle;
import advance.dev.model.Rect;
import advance.dev.model.Shape;
import advance.dev.model.Triangle;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IManager manager = new Manager();
		input(manager);
		print(manager);
	}

	private static void print(IManager manager) {
		// TODO Auto-generated method stub
		for (Shape shape : manager.all()) {
			System.out.println(shape);
		}
	}

	private static void input(IManager manager) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < manager.all().length; i++) {
			System.out.println("1: Circle, 2: Rect, 3: Triangle");
			int c = sc.nextInt();
			switch (c) {
				case 1: 
					manager.add(inputCircle(sc));
					break;
				case 2: 
					manager.add(inputRect(sc));
					break;
				case 3: 
					manager.add(inputTriangle(sc));
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + c);
			}
		}
	}

	private static Shape inputTriangle(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Nhap a:");
		double a = sc.nextDouble();
		System.out.println("Nhap b:");
		double b = sc.nextDouble();
		System.out.println("Nhap c:");
		double c = sc.nextDouble();
		sc.nextLine();
		
		return new Triangle(a, b, c);
	}

	private static Shape inputRect(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Nhap a:");
		double a = sc.nextDouble();
		System.out.println("Nhap b:");
		double b = sc.nextDouble();
		sc.nextLine();
		
		return new Rect(a, b);
	}

	private static Shape inputCircle(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Nhap r:");
		double r = sc.nextDouble();
		sc.nextLine();
		
		return new Circle(r);
	}
}
