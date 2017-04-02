package com.xiaopihaier;

public class Box {
	double length;
	double width;
	double height;

	public double getV() {
		return length * width * height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box();
		box1.length = 100;
		box1.width = 100;
		box1.height = 100;
		System.out.println("第一个箱子体积为" + box1.getV());
		Box box2 = new Box();
		box2.length = 200;
		box2.width = 200;
		box2.height = 200;
		System.out.println("第二个箱子体积为" + box2.getV());
	}

}
