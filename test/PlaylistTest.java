import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Playlists.Playlist;
import Playlists.Playway;

public class PlaylistTest {
	
	@Test
	public void schouldBeAbleToAdd() {
		Playlist playlist = new Playlist(new ArrayList<>(), Playway.SHUFFLE);
		playlist.addMovie("Casablanca");
		assertThat(playlist, is(notNullValue()));
	}
}
