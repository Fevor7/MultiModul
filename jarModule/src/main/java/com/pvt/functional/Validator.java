package com.pvt.functional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
	private static final String PHONE_PATTERN = "^(\\s*)?(\\+)?([- _():=+]?\\d[- _():=+]?){10,14}(\\s*)?$";
	private static final String NAME_PATTERN = "^[а-яА-ЯёЁa-zA-Z]+$";
	private static final String PHONE_NUMBER = "phone number";
	private static final String EMAIL = "EMAIL";
	private static final String NAME = "name";

	public static String lineValidator(String line) {
		if (validate(line, PHONE_PATTERN)) {
			return PHONE_NUMBER;
		}
		if (validate(line, EMAIL_PATTERN)) {
			return EMAIL;
		}
		if (validate(line, NAME_PATTERN)) {
			return NAME;
		}
		return null;
	}

	private static Boolean validate(String email, String patternLine) {
		Pattern pattern = Pattern.compile(patternLine);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

}
