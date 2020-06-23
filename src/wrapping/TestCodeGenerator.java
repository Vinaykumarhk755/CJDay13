package wrapping;

import java.util.Scanner;

public class TestCodeGenerator {

	public static void main(String[] args) {
		CodeGenerator codeGeneraor=new CodeGenerator();
		Scanner scanner=new Scanner(System.in);
			System.out.println("enter the string");
			scanner.nextLine();
			codeGeneraor.codeGenerator();
	}

}
