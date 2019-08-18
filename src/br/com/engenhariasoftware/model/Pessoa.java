package br.com.engenhariasoftware.model;

public class Pessoa {

	private String nome;

	private String habilidades;

	private String telefone;

	private String endereco;

	private String sexo;

	private Double altura;

	private int idade;

	private boolean marvel;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public boolean isMarvel() {
		return marvel;
	}

	public void setMarvel(boolean marvel) {
		this.marvel = marvel;
	}

	public void identificacao() {
		System.out.println("Nome: " + nome + "\n" + "Habilidades: " + habilidades + "\n" + "Telefone: " + telefone
				+ "\n" + "Endereço: " + endereco + "\n" + "Idade: " + idade + " anos " + "\n" + "Sexo: " + sexo + "\n"
				+ "Altura: " + altura + "\n");
	}

	public void universoMarvel() {
		if (marvel == true) {
			System.out.println(nome + " lutou contra Thanos em vingadores ultimato.");
		} else {
			System.out.println(nome + " não faz parte dos vingadores.");
		}
	}

	public void vingadores() {
		this.marvel = true;
	}
	
	public void naoEVingador() {
		this.marvel = false;
	}

	public void dorme() {
		System.out.println(nome + " está dormindo.");
	}

	public void acordar() {
		System.out.println(nome + " está acordando.");
	}

	public void missao() {
		System.out.println(nome + " está em uma missão.");
	}

	public void procura() {
		System.out.println(nome + " está procurando anterfatos.");
	}

	public void atirar() {
		System.out.println(nome + " está atirando.");
	}

	public void escalar() {
		System.out.println(nome + " está escalando.");
	}

	public void correr() {
		System.out.println(nome + " está correndo.");
	}

	public void investiga() {
		System.out.println(nome + " está investigando.");
	}

}
