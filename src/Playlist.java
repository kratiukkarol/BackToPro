import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Playlist {

	private List<Playable> playlist;
	private Playway playway;
	private List<Integer> indexesToShuffle = new ArrayList<>();

	public Playlist(List<Playable> playlist, Playway playway) {
		this.playlist = playlist;
		this.playway = playway;
	}

	public List<Playable> getName() {
		return playlist;
	}

	public void setName(List<Playable> name) {
		this.playlist = name;
	}

	public Playway getPlayway() {
		return playway;
	}

	public void setPlayway(Playway playway) {
		this.playway = playway;
	}

	public List<Playable> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(List<Playable> playlist) {
		this.playlist = playlist;
	}

	public List<Integer> getIndexesToShuffle() {
		return indexesToShuffle;
	}

	public void setIndexesToShuffle(List<Integer> indexesToShuffle) {
		this.indexesToShuffle = indexesToShuffle;
	}

	public void addMovie(String title) {
		playlist.add(new Movie(title));
		indexesToShuffle.add(playlist.size() - 1);	
	}

	public void addTrack(String title, String artist) {
		playlist.add(new Track(title, artist));
		indexesToShuffle.add(playlist.size() - 1);
	}

	public void addNestedList(Playlist playlist, Playlist playlist2) {
		if (playlist2.getPlayway().equals(Playway.SHUFFLE)) {
			Collections.shuffle(playlist2.getName());
		}
		playlist.getName().addAll(playlist2.getName());
		
		/* Tryed to solve it another way
		 * 
		 * int fromIndex = playlist.getName().size(); int toIndex =
		 * playlist.getName().size() + playlist2.getName().size();
		 * 
		 * @SuppressWarnings("unused") ArrayList<Playable> sublist = new
		 * ArrayList<Playable>(playlist.getName().subList(fromIndex, toIndex));
		 */
	}

	public void play() {
		if (getPlayway().equals(Playway.LOOP)) {
			for (int i = 0; i < playlist.size(); i++) {
				if (i == (playlist).size() - 1) {
					System.out.println(playlist.get(i));
					i = 0;
				}
				System.out.println(playlist.get(i));
			}
		} else if (getPlayway().equals(Playway.SHUFFLE)) {
			int size = indexesToShuffle.size();
			for (int i = size; i > 0; i--) {
				Integer randomIndex1 = indexesToShuffle.get(new Random().nextInt(indexesToShuffle.size()));
				Integer randomIndex2 = indexesToShuffle.get(new Random().nextInt(indexesToShuffle.size()));
				Collections.swap(playlist, randomIndex1, randomIndex2);
			}
			playlist.forEach(System.out::println);
		} else {
			playlist.forEach(System.out::println);
		}
	}
}