package nl.hu.pafr.opdr_3_3.editor;

import java.util.Scanner;

public class Editor {

	public static void main(String[] args) {
		String tekst = "Hello world.";
		FileFormat fileFormat = null;
		SaveList lijstje = new SaveList();
		System.out.println("maak keuze: ");
		int index = 1;
		for (FileFormat item : lijstje.safeLijstje) {
			System.out.println("- "+index+" "+item.getMetaData().getDescription());
			index++;
		}
		Scanner scanner = new Scanner(System.in);
		int keuze = scanner.nextInt();
		lijstje.safeLijstje.get(keuze-1).saveAs(tekst);
	}

}
