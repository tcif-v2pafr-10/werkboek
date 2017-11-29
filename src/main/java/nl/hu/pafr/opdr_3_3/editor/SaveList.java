package nl.hu.pafr.opdr_3_3.editor;

import java.util.ArrayList;
import java.util.List;

public class SaveList {
	List<FileFormat> safeLijstje = new ArrayList<>();
	
	public SaveList(){
		safeLijstje.add(new WordFormat());
		safeLijstje.add(new XmlFormat());
		safeLijstje.add(new RtfFormat());
	}
	
}
