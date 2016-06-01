
import java.applet.*; 
import java.io.*; 
import java.net.*; 
import javax.swing.JPanel;
public class music2 extends JPanel { 
    private File path=null; 
    public static AudioClip ad=null; 
    private URL ur2 =null; 
    public   music2(String path1){
        this.path = new File(path1); 
        try { 
            ur2 = path.toURI().toURL(); 
        } catch (MalformedURLException e) { 
            // TODO Auto-generated catch block 
            e.printStackTrace(); 
        } 
        ad = Applet.newAudioClip(ur2); 
    } 
}