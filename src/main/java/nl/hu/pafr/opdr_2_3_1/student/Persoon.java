package nl.hu.pafr.opdr_2_3_1.student;

public abstract class Persoon {
	protected String id;
	protected String voornaam;
	protected String achternaam;
	public Persoon(String id, String voornaam, String achternaam) {
		super();
		this.id = id;
		this.voornaam = voornaam;
		this.achternaam = achternaam;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persoon other = (Persoon) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


}
