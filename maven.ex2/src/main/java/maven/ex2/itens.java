public class itens {
	private int id;
	private String nome;
	private int valor;
	
	public itens() {
		this.id = -1;
		this.nome = "";
		this.valor = 0;
	}
	
	public itens(int id, String nome, int valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "itens [id= " + id + ", nome= " + nome + ", valor= " + valor + "]" ;
	}	
}
