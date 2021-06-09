import java.util.HashMap;
import java.util.Set;
public class SongLyrics{
    public void SongLyricMap(){
        HashMap<String,String> lyrics = new HashMap<String,String>();
        lyrics.put("Tonight", "Luda! tonight im gonna do ");
        lyrics.put("push", "what your man gotta do with me tell me?");
        lyrics.put("talking away", "i dont know what to say");
        lyrics.put("my boo", "cuz you were my babyyyyyyyyy");
        System.out.println(lyrics.get("Tonight"));
        Set<String> keys = lyrics.keySet();
        for(String key : keys){
            System.out.println("Track: "+key+" Lyrics: "+lyrics.get(key));
        }
    }
}