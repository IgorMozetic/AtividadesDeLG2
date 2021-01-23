package Pilha;
import java.util.Stack;

public class teste {

	public static void main(String[] args) {

		Pilha pilha = new Pilha();
		
		pilha.push("Claudio");
		pilha.push("Rogério");
		
		System.out.println(pilha);
		
		System.out.println(pilha.pop());
		
		pilha.push("Larissa");
		
		System.out.println(pilha);
		
		System.out.println(pilha.pop());
		
		System.out.println(pilha.vazia());
		
		System.out.println(pilha.pop());
		
		System.out.println(pilha.vazia());
		
		System.out.println(pilha);
		
		Stack<String> stack = new Stack<String>();
	
		stack.push("Igor");
		stack.push("Madu perose");
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		
		stack.push("Professor");
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		stack.push("aluno");
		
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
	}
}
