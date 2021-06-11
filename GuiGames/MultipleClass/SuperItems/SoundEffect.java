package GuiGames.MultipleClass.SuperItems;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class SoundEffect {
    Clip clip;
    public void setURL(URL soundFile){
        try{
            AudioInputStream sound = AudioSystem.getAudioInputStream(soundFile);
            clip =AudioSystem.getClip();
            clip.open(sound);
        }catch (Exception e){

        }
    }
    public void play(){
        clip.setFramePosition(0);
        clip.start();
    }
}
