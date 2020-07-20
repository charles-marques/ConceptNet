package conceptnet.client.api;

import com.google.gson.annotations.SerializedName;

public class Rel {
	@SerializedName("@id")
	private String id;
	@SerializedName("@type")
	private String type;
	private String label;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
