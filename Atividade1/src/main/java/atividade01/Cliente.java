package atividade01;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private int id;
	private String nome;
	private List<Produto> produtos;

	public Cliente(int id, String nome) {
		this.id = id;
		this.nome = nome;
		this.produtos = new ArrayList<>();
	}

	// Getters e Setters
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void addProduto(Produto produto) {
		produtos.add(produto);
	}

	public void removeProduto(Produto produto) {
		produtos.remove(produto);
	}

}
