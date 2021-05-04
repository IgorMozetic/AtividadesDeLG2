package ListaDexercício5;

public class Data {

	private Integer dia;
	private Integer mes;
	private Integer ano;
	
	public Data( Integer dia, Integer mes, Integer ano )	{
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public void Imprimir()	{
		
		System.out.println( dia + " / " + mes + " / " + ano );
	}
	
	public Integer quantidade ( Integer mes )	{
		
		Integer diasDoAno[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		Integer total = 0;
		
		for ( int a = 0; a < mes; a++)
			total = total + diasDoAno[a];
		
		return total;
		
	}
	public Integer quantidade ( String mes )	{
		
		mes = mes.toLowerCase();
		
		Integer numero = 0;
		
		switch ( mes )	{
		case "janeiro" : numero = 1;
		break;
		case "fevereiro" : numero = 2;
		break;
		case "março" : numero = 3;
		break;
		case "abril" : numero = 4;
		break;
		case "maio" : numero = 5;
		break;
		case "junho" : numero = 6;
		break;
		case "julho" : numero = 7;
		break;
		case "agosto" : numero = 8;
		break;
		case "setembro" : numero = 9;
		break;
		case "outubro" : numero = 10;
		break;
		case "novembro" : numero = 11;
		break;
		case "dezmbro" : numero = 12;
		break;
		}
		
		Integer diasDoAno[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		Integer total = 0;
		
		for ( int a = 0; a < numero; a++)
			total = total + diasDoAno[a];
		
		return total;
	}
}
