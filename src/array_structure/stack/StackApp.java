package array_structure.stack;

public class StackApp {
		public static void main(String[] args)
		{
		StackX theStack = new StackX(10); // Создание нового стека
		theStack.push(10); // Занесение элементов в стек
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
		theStack.push(60);
		theStack.push(70);
		theStack.push(80);
		theStack.push(90);
		theStack.push(100);
		System.out.println("The Stack is full? - "+theStack.isFull());
		System.out.println("The Stack is empty? - "+theStack.isEmpty());
		while( !theStack.isEmpty() ) // Пока стек не станет пустым
		{ // Удалить элемент из стека
		long value = theStack.pop();
		System.out.print(value); // Вывод содержимого
		System.out.print(" ");
		}
		System.out.println("");
		System.out.println("The Stack is full? - "+theStack.isFull());
		System.out.println("The Stack is empty? - "+theStack.isEmpty());
		}
} // Конец класса StackApp
