package recursion.stack_triangle;

import java.io.*;                 // Для ввода/вывода

class Params     // Параметры, сохраняемые в стеке
{
	public int n;
	public int returnAddress;
	public Params(int nn, int ra)
	{
		n=nn;
		returnAddress=ra;
	}
}  // Конец класса Params
