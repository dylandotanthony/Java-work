import java.util.HashMap;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {


        // Create a trackList of type HashMap
        // Add in at least 4 songs that are stored by title
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("If I don't Laugh, I'll Cry", "If I hear your name one more time");
        trackList.put("Teardrops on My Guitar", "Drew looks at me");
        trackList.put("Unholy", "At the body shop. doin' somthin' unholy");
        trackList.put("First Hello", "I held my breath, I broke my heart");

        // Pull out one of the songs by its track title
        String track = trackList.get("Unholy");
        System.out.println(track);


        // Print out all the track names and lyrics in the format Track: Lyrics
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.printf(key + " : " + trackList.get(key));
        }
    }
}
