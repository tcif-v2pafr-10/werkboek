package nl.hu.pafr.opdr_3_3.editor;

public interface FileFormat {
	void saveAs(String tekst);
	MetaData getMetaData();
}
