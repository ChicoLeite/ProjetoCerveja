package modelo;

import java.util.Date;

public class CervejaLagger extends Cerveja{

	public CervejaLagger(int codigo, String nome, Date dataProducao, Date dataValidade) {
		super(codigo, nome, dataProducao, dataValidade);
		this.setPreco(4.89);
	}

}
