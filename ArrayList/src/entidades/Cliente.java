package entidades;

public class Cliente {
	private int codigo;
	private String nome;
	private int cpf;
	
	public Cliente(int codigo, String nome, int cpf) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
