
/*
use it new program    getHeaderField() and getHeaderFields() methods of 
URLConnection class to get specific mean header field and ordinary header field from the url connection



program to get sepecific mean header field and ordinary header field from the url connection


*/

package URL;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.List;




public class UrlExample2 {
    public static void main(String[] args) {
        
        try {
            URL url = new URL("http://www.example.com");
            URLConnection connection = url.openConnection();

            // Get specific header field
            String contentType = connection.getHeaderField("Content-Type");
            System.out.println("Content-Type: " + contentType);

            // Get all header fields
            System.out.println("\nAll Header Fields:");
            Map<String, List<String>> headerFields = connection.getHeaderFields();
            for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                String headerName = entry.getKey();
                List<String> headerValues = entry.getValue();
                System.out.println(headerName + ": " + String.join(", ", headerValues));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
