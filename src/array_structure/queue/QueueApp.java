package array_structure.queue;

class QueueApp {
	public static void main(String[] args) {
		Queue theQueue = new Queue(5); // Очередь из 5 ячеек

		System.out.println("The Queue is empty? - "+theQueue.isEmpty());
		System.out.println("The Queue is full? - "+theQueue.isFull());
		System.out.println("The Queue size: "+theQueue.size());
		System.out.println("The Queue peek Front: "+theQueue.peekFront());
		System.out.println("The Queue real Front: "+theQueue.realFront());
		System.out.println("The Queue real Rear: "+theQueue.realRear());
		theQueue.insert(10); // Вставка 4 элементов
		System.out.println("The Queue is empty? - "+theQueue.isEmpty());
		System.out.println("The Queue is full? - "+theQueue.isFull());
		System.out.println("The Queue size: "+theQueue.size());
		System.out.println("The Queue peek Front: "+theQueue.peekFront());
		System.out.println("The Queue real Front: "+theQueue.realFront());
		System.out.println("The Queue peek Rear: "+theQueue.peekRear());
		System.out.println("The Queue real Rear: "+theQueue.realRear());
		theQueue.insert(20);
		System.out.println("The Queue is empty? - "+theQueue.isEmpty());
		System.out.println("The Queue is full? - "+theQueue.isFull());
		System.out.println("The Queue size: "+theQueue.size());
		System.out.println("The Queue peek Front: "+theQueue.peekFront());
		System.out.println("The Queue real Front: "+theQueue.realFront());
		System.out.println("The Queue peek Rear: "+theQueue.peekRear());
		System.out.println("The Queue real Rear: "+theQueue.realRear());
		theQueue.insert(30);
		System.out.println("The Queue is empty? - "+theQueue.isEmpty());
		System.out.println("The Queue is full? - "+theQueue.isFull());
		System.out.println("The Queue size: "+theQueue.size());
		System.out.println("The Queue peek Front: "+theQueue.peekFront());
		System.out.println("The Queue real Front: "+theQueue.realFront());
		System.out.println("The Queue peek Rear: "+theQueue.peekRear());
		System.out.println("The Queue real Rear: "+theQueue.realRear());
		theQueue.insert(40);
		System.out.println("The Queue is empty? - "+theQueue.isEmpty());
		System.out.println("The Queue is full? - "+theQueue.isFull());
		System.out.println("The Queue size: "+theQueue.size());
		System.out.println("The Queue peek Front: "+theQueue.peekFront());
		System.out.println("The Queue real Front: "+theQueue.realFront());
		System.out.println("The Queue peek Rear: "+theQueue.peekRear());
		System.out.println("The Queue real Rear: "+theQueue.realRear());
		theQueue.remove(); // Извлечение 3 элементов
		theQueue.remove(); // (10, 20, 30)
		theQueue.remove();
		System.out.println("The Queue is empty? - "+theQueue.isEmpty());
		System.out.println("The Queue is full? - "+theQueue.isFull());
		System.out.println("The Queue size: "+theQueue.size());
		System.out.println("The Queue peek Front: "+theQueue.peekFront());
		System.out.println("The Queue real Front: "+theQueue.realFront());
		System.out.println("The Queue peek Rear: "+theQueue.peekRear());
		System.out.println("The Queue real Rear: "+theQueue.realRear());
		theQueue.insert(50); // Вставка еще 4 элементов
		System.out.println("The Queue is empty? - "+theQueue.isEmpty());
		System.out.println("The Queue is full? - "+theQueue.isFull());
		System.out.println("The Queue size: "+theQueue.size());
		System.out.println("The Queue peek Front: "+theQueue.peekFront());
		System.out.println("The Queue real Front: "+theQueue.realFront());
		System.out.println("The Queue peek Rear: "+theQueue.peekRear());
		System.out.println("The Queue real Rear: "+theQueue.realRear());
		theQueue.insert(60); // (с циклическим переносом)
		System.out.println("The Queue is empty? - "+theQueue.isEmpty());
		System.out.println("The Queue is full? - "+theQueue.isFull());
		System.out.println("The Queue size: "+theQueue.size());
		System.out.println("The Queue peek Front: "+theQueue.peekFront());
		System.out.println("The Queue real Front: "+theQueue.realFront());
		System.out.println("The Queue peek Rear: "+theQueue.peekRear());
		System.out.println("The Queue real Rear: "+theQueue.realRear());
		theQueue.insert(70);
		System.out.println("The Queue is empty? - "+theQueue.isEmpty());
		System.out.println("The Queue is full? - "+theQueue.isFull());
		System.out.println("The Queue size: "+theQueue.size());
		System.out.println("The Queue peek Front: "+theQueue.peekFront());
		System.out.println("The Queue real Front: "+theQueue.realFront());
		System.out.println("The Queue peek Rear: "+theQueue.peekRear());
		System.out.println("The Queue real Rear: "+theQueue.realRear());
		theQueue.insert(80);
		System.out.println("The Queue is empty? - "+theQueue.isEmpty());
		System.out.println("The Queue is full? - "+theQueue.isFull());
		System.out.println("The Queue size: "+theQueue.size());
		System.out.println("The Queue peek Front: "+theQueue.peekFront());
		System.out.println("The Queue real Front: "+theQueue.realFront());
		System.out.println("The Queue peek Rear: "+theQueue.peekRear());
		System.out.println("The Queue real Rear: "+theQueue.realRear());
		while (!theQueue.isEmpty()) // Извлечение и вывод
		{ // всех элементов
			long n = theQueue.remove(); // (40, 50, 60, 70, 80)
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println("");
		System.out.println("The Queue is empty? - "+theQueue.isEmpty());
		System.out.println("The Queue is full? - "+theQueue.isFull());
		System.out.println("The Queue size: "+theQueue.size());
		System.out.println("The Queue peek Front: "+theQueue.peekFront());
		System.out.println("The Queue real Front: "+theQueue.realFront());
		System.out.println("The Queue peek Rear: "+theQueue.peekRear());
		System.out.println("The Queue real Rear: "+theQueue.realRear());
	}
}
