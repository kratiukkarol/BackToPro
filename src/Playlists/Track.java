package Playlists;
public class Track extends Playable {

	private String artist;
	
	public Track(String title) {
		super(title);
	}

	public Track(String title, String artist) {
		super(title);
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Track: " + getArtist() + ", " + getTitle();
	}
	
	

}
