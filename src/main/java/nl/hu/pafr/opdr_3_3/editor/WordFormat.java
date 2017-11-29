package nl.hu.pafr.opdr_3_3.editor;

public class WordFormat implements FileFormat {

	@Override
	public void saveAs(String tekst) {
		System.out.println("File format Word "+tekst);
	}

	@Override
	public MetaData getMetaData() {
		// TODO Auto-generated method stub
		return new MetaData("Word format", "docx");
	}

}
