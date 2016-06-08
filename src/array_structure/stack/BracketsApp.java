package array_structure.stack;

import java.io.*;

public class BracketsApp {
	public static void main(String[] args) throws IOException {
		String input;
		while (true) {
			System.out.print("Enter string containing delimiters: ");
			System.out.flush();
			input = getString(); // Чтение строки с клавиатуры
			if (input.equals("")) // Завершение, если [Enter]
				break;
			// Создание объекта BracketChecker
			BracketChecker theChecker = new BracketChecker(input);
			theChecker.check(); // Проверка парных скобок
		}
	}

	// --------------------------------------------------------------
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
