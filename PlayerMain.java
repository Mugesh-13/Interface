package interfaceAssignment;
import java.util.*;
public class PlayerMain {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("ENTER YOUR CHOICE");
			System.out.println("1.MP3 Player"+"\n"+"2.CD Player"+"\n"+"3.Streaming Player");
			int n=scan.nextInt();
			switch(n) {
			case 1:
				Mp3player mp3=new Mp3player();
				mp3.play();
				mp3.pause();
				mp3.stop();
				break;
			case 2:
				CDplayer cd=new CDplayer();
				cd.play();
				cd.pause();
				cd.stop();
				break;
			case 3:
				StreamingPlayer sp=new StreamingPlayer();
				sp.play();
				sp.pause();
				sp.stop();
			default:
				System.out.println("ENTER VALID CHOICE");
				
				
			}
			

	}

}
