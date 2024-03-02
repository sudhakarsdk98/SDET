package javaConcept;

import javaPack.JavaImportScenario; // Explicit import statement.
import java.util.*; // Implicit import statement.

public class JavaImportStatements {

	public static void main(String[] args) {

		List l = new ArrayList();

		String i = new String(); // java.lang pack doesn't need to be imported.

		JavaClassCurrPack je1 = new JavaClassCurrPack(); // class from same pack doesn't need to be imported.

		System.out.println(je1.getClass().getName() + je1.method1());

		JavaImportScenario js = new JavaImportScenario();// class from other pack should be imported.
		System.out.println(js.getClass().getName() + js.method1());
	}

}
