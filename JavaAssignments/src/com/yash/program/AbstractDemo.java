package com.yash.program;

public class AbstractDemo {

	public static void main(String[] args) {
		Nodetrng n = new Nodetrng("Sourabh", "welcome");

	}
}

abstract class JavaTrng {
	static String name = "Java";
	String mas = "Welcome ";

	public JavaTrng(String name, String mas) {
		this.name = name;
		this.mas = mas;
		System.out.println(name + " " + mas);
	}

	abstract void usetrng();

	void printMassage() {
		System.out.println("I am in java Traning");
	}

	abstract void useKeyboard();
}

class Nodetrng extends JavaTrng {

	public Nodetrng(String name, String mas) {
		super(name, mas);

	}

	@Override
	void usetrng() {
		System.out.println("NodeTrng method");

	}

	@Override
	void useKeyboard() {
		System.out.println("Nodetrang keyboard");

	}

}
