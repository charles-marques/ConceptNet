package conceptnet.client.api;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Concept {
	@SerializedName("@context")
	private String[] context;
	@SerializedName("@id")
	private String id;
	private List<Edge> edges;
	private String version;
	private View view;

	public String[] getContext() {
		return context;
	}

	public void setContext(String[] context) {
		this.context = context;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public View getView() {
		return view;
	}
	
	public void setView(View view) {
		this.view = view;
	}
}
