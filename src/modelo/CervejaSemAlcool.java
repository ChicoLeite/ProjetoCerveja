package modelo;

import java.util.Date;

public class CervejaSemAlcool extends Cerveja{

	public CervejaSemAlcool(int codigo, String nome, Date dataProducao, Date dataValidade) {
		super(codigo, nome, dataProducao, dataValidade);
		this.setPreco(3.20);
	}

}
