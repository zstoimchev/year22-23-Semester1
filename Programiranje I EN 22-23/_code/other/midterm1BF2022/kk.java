import java.net.URI;
import java.awt.Desktop;

public class kk {
    public static void main(String[] arg)
    {
        String something = "dQw4w9WgXcQ";
        try
        {
            Desktop d = Desktop.getDesktop();
            d.browse(new URI("https://www.youtube.com/" + "watch?v=" + something));
        }
        catch (Exception e) {}
    }
}
