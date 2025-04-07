package interfaceAssignment;

interface Player {
	void play();
	void pause();
	void stop();
}
class Mp3player implements Player{
	public void play() {
		System.out.println("MP3 PLAYER IS PLAYING");
	}
	public void pause() {
		System.out.println("MP3 PLAYER IS PAUSED");
	}
	public void stop() {
		System.out.println("MP3 PLAYER IS CLOSED");
	}
}
class CDplayer implements Player{
	public void play() {
		System.out.println("CD PLAYER IS PLAYING");
	}
	public void pause() {
		System.out.println("CD PLAYER IS PAUSED");
	}
	public void stop() {
		System.out.println("CD PLAYER IS CLOSED");
	}
}
class StreamingPlayer implements Player{
	public void play() {
		System.out.println("Streaming PLAYER IS PLAYING");
	}
	public void pause() {
		System.out.println("Streaming PLAYER IS PAUSED");
	}
	public void stop() {
		System.out.println("Streaming PLAYER IS CLOSED");
	}
}
