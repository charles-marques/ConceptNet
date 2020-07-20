package conceptnet.client.api;

import com.google.gson.annotations.SerializedName;

public class View {
	@SerializedName("@id")
	private String id;
	@SerializedName("@type")
	private String type;
	private String comment;
	private String firstPage;
	private String nextPage;
	private String paginatedProperty;

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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(String firstPage) {
		this.firstPage = firstPage;
	}

	public String getNextPage() {
		return nextPage;
	}

	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}

	public String getPaginatedProperty() {
		return paginatedProperty;
	}

	public void setPaginatedProperty(String paginatedProperty) {
		this.paginatedProperty = paginatedProperty;
	}

}
