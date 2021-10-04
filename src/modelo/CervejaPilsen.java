package modelo;

import java.util.Date;

public class CervejaPilsen extends Cerveja{

	public CervejaPilsen(int codigo, String nome, Date dataProducao, Date dataValidade) {
		super(codigo, nome, dataProducao, dataValidade);
		this.setPreco(5.89);
	}

}
