package nl.hu.pafr.opdr_3_3.editor;

public class MetaData {
	private String description;
	private String extension;
	public MetaData(String string, String string2) {
		description = string;
		extension = string2;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
}
