package com.devsuperior.dslearnbds.entities;

public class Content extends Lesson {
	private static final long serialVersionUID = 1L;
	
	private String textContent;
	private String videoUir;
	
	public Content() {
	}

	public Content(Long id, String title, Integer position, Section section, String textContent, String videoUir) {
		super(id, title, position, section);
		this.textContent = textContent;
		this.videoUir = videoUir;
	}

	public String getTextContent() {
		return textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	public String getVideoUir() {
		return videoUir;
	}

	public void setVideoUir(String videoUir) {
		this.videoUir = videoUir;
	}
	
	//obs: não precisar colocar equals hashcode pois Content herda o equal do Lesson

}
