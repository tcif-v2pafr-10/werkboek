package nl.hu.pafr.opdr_3_4.liskov;

class Square extends Rectangle {
	public void setWidth(int width) {
		m_width = width;
		m_height = width;
	}

	public void setHeight(int height) {
		m_width = height;
		m_height = height;
	}

}
