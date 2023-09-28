package Encapsulamento;

import Encapsulamento.Cliente.Cliente;
import Encapsulamento.Endereco.Endereco;
import Encapsulamento.ItemTema.ItemTema;
import Encapsulamento.Tema.Tema;

public class Principal {

	public static void main(String[] args) {
		Tema tema = new Tema(1, "Fulano", 3000, "marrom");
		ItemTema itemTema = new ItemTema(2,"Bianca", "Trabalho");
		Endereco endereco = new Endereco (3,"", 25,"completar", "vila sonia", "itapetininga", "california", "São Paulo");
		Cliente cliente = new Cliente (4, "Luiza", "12345", "123123", "12345678");

	}

}
