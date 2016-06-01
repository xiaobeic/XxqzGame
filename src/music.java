
import java.applet.*; 
import java.io.*; 
import java.net.*; 
import javax.swing.JPanel;
public class music extends JPanel { 
    private File path=null; 
    public static AudioClip ac=null; 
   // public static AudioClip ad=null; 
    private URL url =null; 
    public   music(String path1){
        this.path = new File(path1); 
        try { 
            url = path.toURI().toURL(); 
        } catch (MalformedURLException e) { 
            // TODO Auto-generated catch block 
            e.printStackTrace(); 
        } 
        ac = Applet.newAudioClip(url); 
    } 
}