package subsist;

public class subsistemaII {
        
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de CRM:");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	}

	private static subsistemaII instancia = new subsistemaII();

	private subsistemaII() {
		super();
	}

	public static subsistemaII getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Araraquara";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
}