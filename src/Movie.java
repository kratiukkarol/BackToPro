public class Movie extends Playable{

	public Movie(String title) {
		super(title);
	}

	@Override
	public String toString() {
		return "Movie: " + getTitle();
	}
	
}
