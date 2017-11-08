package nl.hu.pafr.opdr_3_4.liskov;

class Rectangle {
	protected int m_width;
	protected int m_height;

	public void setWidth(int width) {
		m_width = width;
	}

	public void setHeight(int height) {
		m_height = height;
	}

	public int getWidth() {
		return m_width;
	}

	public int getHeight() {
		return m_height;
	}

	public int getArea() {
		return m_width * m_height;
	}
}