package br.com.engenhariasoftware.model.testes;

import br.com.engenhariasoftware.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa();
		p1.setNome("Lara Croft");
		p1.setHabilidades("Cura rápida, matadora eficiente");
		p1.setTelefone("(99)99999-9999");
		p1.setEndereco("Sem informação");
		p1.setIdade(25);
		p1.setSexo("Feminino");
		p1.setAltura(1.70);
		p1.naoEVingador();

		p1.identificacao();
		p1.naoEVingador();
		p1.universoMarvel();
		p1.dorme();
		p1.acordar();
		p1.missao();
		p1.procura();

		Pessoa p2 = new Pessoa();

		p2.setNome("Natasha Romanoff");
		p2.setAltura(1.74);
		p2.setHabilidades("Super poderes");
		p2.setEndereco("Não informado");
		p2.setIdade(30);
		p2.setSexo("Feminino");
		p2.setTelefone("135");
		p2.vingadores();

		p2.identificacao();
		p2.atirar();
		p2.correr();
		p2.vingadores();
		p2.universoMarvel();
		
		p2.investiga();

	}

}
