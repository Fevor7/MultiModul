package com.pvt;

import java.util.Scanner;

import com.pvt.functional.Validator;

public class App {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		String line = in.nextLine();
		System.out.println(Validator.lineValidator(line));
	}

}
