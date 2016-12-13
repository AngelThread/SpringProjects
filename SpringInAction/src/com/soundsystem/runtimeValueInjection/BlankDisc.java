package com.soundsystem.runtimeValueInjection;

public class BlankDisc {
	private String title;
	private String artist;
	private int relaseYear;

	public BlankDisc(String title, String artist,int relaseYear) {
		this.title = title;
		this.artist = artist;
		this.relaseYear= relaseYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getRelaseYear() {
		return relaseYear;
	}

	public void setRelaseYear(int relaseYear) {
		this.relaseYear = relaseYear;
	}

}
