package Exercício1e2;

public class Mobile {

	private String modelo;
	private String marca;
	private CartaoSIM cartão;
	
	public Mobile()	{
		
		this.modelo = "";
		this.marca = "";
		this.cartão = new CartaoSIM();
	}
	
	public Mobile( String modelo, String marca, CartaoSIM cartão )	{
		
		this.modelo = modelo;
		this.marca = marca;
		this.cartão = cartão;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public CartaoSIM getCartão() {
		return cartão;
	}

	public void setCartão(CartaoSIM cartão) {
		this.cartão = cartão;
	}
}