package conceptnet.client.api.query;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.google.gson.Gson;

import conceptnet.client.api.Concept;

public class ConceptQuery {

	private final String isA = "IsA";
	private final String hasA = "HasA";
	private final String vazio = "";
	private final String person = "person";
	
	public Concept search(String node, String other) {
		String key = "http://api.conceptnet.io/query?node=/c/en/" + node.toLowerCase() + "&other=/c/en/" + other.toLowerCase();
		Client client = ClientBuilder.newClient();

		WebTarget target = client.target(key);

		String conteudo = target.path(vazio).request().get(String.class);

		Gson gson = new Gson();
		Concept resultado = gson.fromJson(conteudo, Concept.class);

		return resultado;
	}
	
	public Boolean isA(String node, String other) {
		Concept concept = this.search(node, other);
		return concept.getEdges().stream().anyMatch(e -> e.getRel().getLabel().equals(isA));
	}
	
	public Boolean hasA(String node, String other) {
		Concept concept = this.search(node, other);
		return concept.getEdges().stream().anyMatch(e -> e.getRel().getLabel().equals(hasA));
	}
	
	public Boolean isAPerson(String node) {
		return isA(node, person);
	}
	
	public Boolean personHasA(String node) {
		return hasA(person, node);
	}
	
	public static void main(String[] args) {
		ConceptQuery search = new ConceptQuery();
		String recurso = "Player";
		System.out.printf("%s: %b \n", recurso, search.isAPerson(recurso));
		recurso = "Carton";
		System.out.printf("%s: %b \n", recurso, search.isAPerson(recurso));
	}
}
