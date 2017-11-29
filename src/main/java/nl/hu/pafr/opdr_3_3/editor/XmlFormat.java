package nl.hu.pafr.opdr_3_3.editor;

public class XmlFormat implements FileFormat {

	@Override
	public void saveAs(String tekst) {
		System.out.println("File format XML "+tekst);
	}

	@Override
	public MetaData getMetaData() {
		return new MetaData("Format XML", "xml");
	}

}
