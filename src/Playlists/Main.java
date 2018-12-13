package Playlists;
import java.util.ArrayList;

public class Main {

	//Examples
	public static void main(String[] args) {
		
		Playlist playlist = new Playlist(new ArrayList<>(), Playway.SHUFFLE);
		Playlist playlist2 = new Playlist(new ArrayList<>(), Playway.SHUFFLE);
		playlist.addMovie("Casablanca");
		playlist.addTrack("Zamki na piasku", "Lady Punk");
		playlist.addMovie("Jurassic Park");
		playlist2.addMovie("Transformers");
		playlist2.addTrack("Nothing else matters", "Metallica");
		playlist.addMovie("The Goodfather");
		playlist2.addMovie("Fast and Furious");
		playlist2.addTrack("Tribute", "Tenacious D");
		playlist.addNestedList(playlist, playlist2);
		playlist.addTrack("Californication", "Red Hot Chilly Peppers");
		playlist.addTrack("Pride", "U2");
		
		playlist.play();
		playlist2.play();
		
	}
}
