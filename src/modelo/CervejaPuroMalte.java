package modelo;

import java.util.Date;

public class CervejaPuroMalte extends Cerveja{

	public CervejaPuroMalte(int codigo, String nome, Date dataProducao, Date dataValidade) {
		super(codigo, nome, dataProducao, dataValidade);
		this.setPreco(5.20);
	}

}
