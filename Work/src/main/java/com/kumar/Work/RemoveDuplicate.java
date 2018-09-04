package com.kumar.Work;

import java.util.ArrayList;

public class RemoveDuplicate {

	public static void method(ArrayList<String> f) {
		System.out.println("\n\n");

		Object[] st = f.toArray();
		for (Object s : st) {
			if (f.indexOf(s) != f.lastIndexOf(s)) {
				f.remove(f.lastIndexOf(s));
			}
		}

		System.out.println("distinct elements");

		for (String str : f) {
			System.out.println("Distinct List " + str);
		}

		ArrayList<String> FailedValidations = new ArrayList<String>();

		String value2[] = f.toArray(new String[f.size()]);

		for (String mack : value2) {
			String value[] = mack.split(",");

			if (((Double.parseDouble(value[3]) + (Double.parseDouble(value[4]))) == Double.parseDouble(value[5]))
					|| ((Float.parseFloat(value[3]) + Float.parseFloat(value[4])) == (Float.parseFloat(value[5])))) {

				System.out.println("\nRecord \nTransaction Reference : " + value[0]);

				System.out.println("Description: " + value[2]);

			} else if (((Double.parseDouble(value[3]) + Double.parseDouble(value[4])) != (Double.parseDouble(value[5])))
					|| ((Float.parseFloat(value[3]) + Float.parseFloat(value[4])) != (Float.parseFloat(value[5])))) {

				FailedValidations.add("\nRecord\nTransaction Reference : " + value[0] + "\nAccount Number : " + value[1]
						+ "\nDescription  : " + value[2] + "\nstartBalance : " + value[3] + "\nEndBalance : " + value[4]
						+ "\nEnd Balance : " + value[5]);

			}

		}

		for (String s : FailedValidations) {

			System.out.println("failed records" + s);
		}

	}

}
