package modelo;

import java.util.Date;

public class CervejaTrigo extends Cerveja{

	public CervejaTrigo(int codigo, String nome, Date dataProducao, Date dataValidade) {
		super(codigo, nome, dataProducao, dataValidade);
		this.setPreco(5.20);
	}

}
