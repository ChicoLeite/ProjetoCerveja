package modelo;

import java.util.Date;
import java.util.Random;
import java.util.Calendar;

public class FactoryMethodCerveja {
	
	Random random = new Random();
	int limite = 1000;

	public FactoryMethodCerveja() {}
	
	public Cerveja getCerveja(int opcao) {
		Calendar cal = Calendar.getInstance();
		Date dataProducao = cal.getTime();
		cal.add(Calendar.YEAR, 1);
		Date dataValidade = cal.getTime();
		
		if(opcao == 1) {
			int codigo = 1000+random.nextInt(limite);
			return new CervejaCerejaAmendoa(codigo, "Cerveja com Cereja e Amêndoa", dataProducao, dataValidade);
		}else if(opcao == 2) {
			int codigo = 2000+random.nextInt(limite);
			return new CervejaCerejaAmendoa(codigo, "Cerveja Lagger", dataProducao, dataValidade);
		}else if(opcao == 3) {
			int codigo = 3000+random.nextInt(limite);
			return new CervejaCerejaAmendoa(codigo, "Cerveja com Laranja", dataProducao, dataValidade);
		}else if(opcao == 4) {
			int codigo = 4000+random.nextInt(limite);
			return new CervejaCerejaAmendoa(codigo, "Cerveja Pilsen", dataProducao, dataValidade);
		}else if(opcao == 5) {
			int codigo = 5000+random.nextInt(limite);
			return new CervejaCerejaAmendoa(codigo, "Cerveja Puro Malte", dataProducao, dataValidade);
		}else if(opcao == 6) {
			int codigo = 6000+random.nextInt(limite);
			return new CervejaCerejaAmendoa(codigo, "Cerveja sem Alcool", dataProducao, dataValidade);
		}else if(opcao == 7) {
			int codigo = 7000+random.nextInt(limite);
			return new CervejaCerejaAmendoa(codigo, "Cerveja Trigo", dataProducao, dataValidade);
		}
		return null;
	}
	
}
