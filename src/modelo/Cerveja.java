package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;


public abstract class Cerveja {

	private int codigo;
	private String nome;
	private double preco;
	private Date dataProducao;
	private Date dataValidade;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Cerveja(int codigo, String nome, Date dataProducao, Date dataValidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataProducao = dataProducao;
		this.dataValidade = dataValidade;
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
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double d) {
		this.preco = d;
	}

	public Date getDataProducao() {
		return dataProducao;
	}

	public void setDataProducao(Date dataProducao) {
		this.dataProducao = dataProducao;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public String toString() {
		return nome + "\nPreço: R$" + preco +
				"\nCódigo: "+ codigo +
				"\nData de Produção: "+sdf.format(dataProducao)+
				"\nData de Validade: " + sdf.format(dataValidade);
	}
	
	
}
