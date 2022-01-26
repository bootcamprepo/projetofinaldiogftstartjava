package external.crm;

public class CRMService {
	
	private CRMService() {
		super();
	}
	
	public static void saveClient(String name, String cep, String cidade, String estado) {
		System.out.println(name + " salvo no sistema de CRM");
		System.out.println("\n\n" + name);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);	
	}

}
