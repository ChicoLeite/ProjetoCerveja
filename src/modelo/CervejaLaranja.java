package modelo;

import java.util.Date;

public class CervejaLaranja extends Cerveja{

	public CervejaLaranja(int codigo, String nome, Date dataProducao, Date dataValidade) {
		super(codigo, nome, dataProducao, dataValidade);
		this.setPreco(9.89);
	}

}
