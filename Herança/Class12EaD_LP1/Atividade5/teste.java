package Atividade5;

import java.time.LocalDate;

public class teste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		p1.setNome("alo");
		p1.setNascimento(LocalDate.now());
		
		System.out.println(p1.toString());
		
		Aluno a1 = new Aluno();
		
		a1.setNome("oi");
		a1.setNascimento(LocalDate.now());
		a1.setProntuario("sp1234567");
		a1.setEmail("igormozetic@gmail.com");
		
		System.out.println(a1.toString());
		
		Bolsista b1 = new Bolsista();
		
		b1.setNome("bem");
		b1.setNascimento(LocalDate.of(2020, 3, 10));
		b1.setProntuario("sp987654");
		b1.setEmail("igu@ticarica");
		b1.setValor(100.59);
		
		System.out.println(b1.toString());
		
		Atleta at1 = new Atleta();
		
		at1.setNome("tudo");
		at1.setNascimento(LocalDate.of(2019, 5, 20));
		at1.setProntuario("sp102938");
		at1.setEmail("larari@larara");
		at1.setModalidade("futebol");

		System.out.println(at1.toString());
	}
}
