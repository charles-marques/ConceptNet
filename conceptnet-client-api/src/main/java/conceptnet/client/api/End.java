package conceptnet.client.api;

import com.google.gson.annotations.SerializedName;

public class End {
	@SerializedName("@id")
	private String id;
	@SerializedName("@type")
	private String type;
	private String label;
	private String language;
	private String sense_label;
	private String term;

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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSense_label() {
		return sense_label;
	}

	public void setSense_label(String sense_label) {
		this.sense_label = sense_label;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

}
