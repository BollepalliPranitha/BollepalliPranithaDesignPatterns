package com.epam.Designpatterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Adapterdemo implements MediaPlayer{
 
	   AdvancedMediaPlayer player;
	   public Adapterdemo(AdvancedMediaPlayer player){
		   this.player=player;
	   }  public static void main(String args[]){
	AudioPlayer a=new AudioPlayer();
	AdvancedAudioPlayer ad=new AdvancedAudioPlayer();
	MediaPlayer aad=new Adapterdemo(ad);
	aad.play();//MediaPlayer is playing mp4 as an Adapter is used...
   }
public void play() {
	player.play();
	
}
}
interface MediaPlayer{
	void play();
}
class AudioPlayer implements MediaPlayer{
	private static final Logger LOGGER=LogManager.getLogger(AudioPlayer.class);
	
	public void play(){
		LOGGER.info("Playing Mp3 audio ");
	}
}
interface AdvancedMediaPlayer{
	void play();
}
class AdvancedAudioPlayer implements AdvancedMediaPlayer{
	private static final Logger LOGGER=LogManager.getLogger(AdvancedAudioPlayer.class);
	public void play(){
		LOGGER.info("Playing Mp4 ");
	}}