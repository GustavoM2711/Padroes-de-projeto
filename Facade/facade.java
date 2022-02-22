package Facade;
import subsist.subsistemaII;

public class facade {
 

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = subsistemaII.getInstancia().recuperarCidade(cep);
		String estado = subsistemaII.getInstancia().recuperarEstado(cep);
		
		subsistemaII.gravarCliente(nome, cep, cidade, estado);
	}
}

public void migrarCliente(String string, String string2) {
}
    
}
