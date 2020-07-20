package conceptnet.client.api.query;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.google.gson.Gson;

import conceptnet.client.api.Concept;

public class ConceptFinder {
	
	public String[] splitTerms(String description) {
		return (description == null) ? null : description.split("(?=\\p{Upper})");
	}
	
	public Concept find(String recurso) {
		String key = "http://api.conceptnet.io/c/en/";
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target(key);
		
		String conteudo = target.path(recurso.toLowerCase()).request().get(String.class);
		
		System.out.println(conteudo);
		
		Gson gson = new Gson();
		Concept resultado = gson.fromJson(conteudo, Concept.class);
		
		return resultado;
	}
	
	public static void main(String[] args) {
		ConceptFinder search = new ConceptFinder();
		String recurso = "Person";
		
		Concept resultado = search.find(recurso);
		
		System.out.println(resultado);
	}
}
