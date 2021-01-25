package Fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {

	private List<String> alunos = new LinkedList<String>();

	public void push(String aluno)	{
		alunos.add(aluno);
	}
	
	public String poll()	{
		return alunos.remove(0);
	}
	
	public boolean vazia()	{
		return alunos.isEmpty();
	}
	
	@Override
	public String toString() {
		return alunos.toString();
	}
}
