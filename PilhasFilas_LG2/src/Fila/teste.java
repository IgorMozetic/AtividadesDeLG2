package Fila;

import java.util.LinkedList;
import java.util.Queue;

public class teste {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.push("Claudio");
		fila.push("Rogério");
		
		System.out.println(fila);
		
		System.out.println(fila.poll());
		
		fila.push("Larissa");
		
		System.out.println(fila);
		
		System.out.println(fila.poll());
		
		System.out.println(fila.vazia());
		
		System.out.println(fila.poll());
		
		System.out.println(fila.vazia());
		
		System.out.println(fila);
		
		//Queue
		
		Queue<String> q1 = new LinkedList<String>();
	
		q1.add("Igor");
		q1.add("Kleber");
		
		System.out.println(q1);
		
		System.out.println(q1.poll());
		
		q1.add("Professor");
		
		System.out.println(q1);
		
		System.out.println(q1.peek());
		
		q1.add("aluno");
		
		System.out.println(q1);
		
		System.out.println(q1.poll());
		
		System.out.println(q1.poll());
		
		System.out.println(q1.poll());
		
		System.out.println(q1);
	}
}
