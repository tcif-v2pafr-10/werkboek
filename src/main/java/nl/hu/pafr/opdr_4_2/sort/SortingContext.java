package nl.hu.pafr.opdr_4_2.sort;

public class SortingContext {
	private Sort sorter = null;

	public void sortDouble(double[] list) {
		sorter.sort(list);
	}

	public Sort getSorter() {
		return sorter;
	}

	public void setSorter(Sort sorter) {
		this.sorter = sorter;
	}
}
