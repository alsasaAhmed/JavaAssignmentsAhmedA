package com.model;

public class JukeBox {
	
	private String songname;
	private String artist; 
	private String language; 
	public JukeBox() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String rating;
	public JukeBox(String songname, String artist, String language, String rating) {
		super();
		this.songname = songname;
		this.artist = artist;
		this.language = language;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "JukeBox [songname=" + songname + ", artist=" + artist + ", language=" + language + ", rating=" + rating
				+ "]";
	}
	public String getSongname() {
		return songname;
	}
	public void setSongname(String songname) {
		this.songname = songname;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}

}
