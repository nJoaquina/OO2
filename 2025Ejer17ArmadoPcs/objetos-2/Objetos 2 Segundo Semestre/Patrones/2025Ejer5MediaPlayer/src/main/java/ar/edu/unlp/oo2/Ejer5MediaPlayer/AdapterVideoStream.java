package ar.edu.unlp.oo2.Ejer5MediaPlayer;

public class AdapterVideoStream extends Media{
	private VideoStream videoStream; 
	
	public AdapterVideoStream (VideoStream vs) {
		this.videoStream = vs;
	}

	@Override
	public void play() {
		this.videoStream.reproduce(); 
		
	}
}
