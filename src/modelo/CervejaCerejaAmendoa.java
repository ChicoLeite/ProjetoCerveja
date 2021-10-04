package modelo;

import java.util.Date;

public class CervejaCerejaAmendoa extends Cerveja{

	public CervejaCerejaAmendoa(int codigo, String nome, Date dataProducao, Date dataValidade) {
		super(codigo, nome, dataProducao, dataValidade);
		this.setPreco(12.89);
	}

}
