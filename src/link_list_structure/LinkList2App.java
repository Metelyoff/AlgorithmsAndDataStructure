package link_list_structure;

class LinkList2App
{
	public static void main(String[] args)
	{
		LinkListFind theList = new LinkListFind();  // Создание нового списка
		theList.insertFirst(22, 2.99);      // Вставка 4 элементов
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		theList.displayList();              // Вывод содержимого списка
		Link f = theList.find(44);          // Поиск элемента
		if( f != null)
			System.out.println("Found link with key " + f.iData);
		else
			System.out.println("Can’t find link");
		Link d = theList.delete(66);        // Удаление элемента
		if( d != null )
			System.out.println("Deleted link with key " + d.iData);
		else
			System.out.println("Can’t delete link");
		theList.displayList();              // Вывод содержимого списка
	}
}
