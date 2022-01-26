package cep.subsystem;

public class CepApi {
	
	private static CepApi CEPinstance = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstance() {
		return CEPinstance;
	}
	
	public String returnCity(String cep) {
		return "São Paulo";
	}
	
	public String returnState(String cep) {
		return "SP";
	}

}
