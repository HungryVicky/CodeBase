import javax.sound.sampled.*;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;


public class musicfile {
      public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        File file = new File("song.wav");
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

          Scanner scanner = new Scanner(System.in);
          String data = " ";


          while (!data.equals("Q")){
              System.out.println(" P = Play , S = Stop , R = rest , Q = close");
              data = scanner.next();
              data = data.toUpperCase();

              switch (data) {
                  case ("P") -> clip.start();
                  case ("S") -> clip.stop();
                  case ("R") -> clip.setFramePosition(0);
                  case ("Q") -> clip.close();
                  default -> System.out.println("Enter a valid letter");
              }

          }

        }

      }







