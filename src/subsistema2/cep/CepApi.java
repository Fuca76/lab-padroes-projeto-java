package subsistema2.cep;

public class CepApi {

	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Engenheiro Paulo de Frontin";
	}
	
	public String recuperarEstado(String cep) {
		return "RJ";
	}
}
