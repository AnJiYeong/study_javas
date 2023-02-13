import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class ApiExplorersWithDatagokr02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
          행정안전부_지진해일 긴급대피장소
          https://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List
          ?serviceKey=wFUZjEdvYfJYBfiBwcjWJwE5fNnOO3cKteIfukZ8QxlEMvyv%2BpEZUL1PMoG%2F5EeHdu3yF3QhXWTs4lWx301puA%3D%3D
          &pageNo=1
          &numOfRows=10
          &type=xml
        */

        // SSLHandshakeException 때문에 http로 수정함
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List"); // url
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8") + "=").append("wFUZjEdvYfJYBfiBwcjWJwE5fNnOO3cKteIfukZ8QxlEMvyv%2BpEZUL1PMoG%2F5EeHdu3yF3QhXWTs4lWx301puA%3D%3D"); 
        urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));
        urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode("10", "UTF-8"));
        urlBuilder.append("&" + URLEncoder.encode("type", "UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8"));
        
        URL url;
        HttpURLConnection conn = null; 
        try {
          url = new URL(urlBuilder.toString());
          conn = (HttpURLConnection) url.openConnection();
          conn.setRequestMethod("GET");
          System.out.println("Response code : " + conn.getResponseCode());

          BufferedReader reader = null;
          if(conn.getResponseCode() >= 200 && conn.getResponseCode() < 300){
            reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
          } else {
            reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
          }
          StringBuffer stringBuffer = new StringBuffer();
          String line;
          while((line = reader.readLine()) != null) {
            stringBuffer.append(line);
          }
          int i = 1;
          reader.close();
        } catch (MalformedURLException e) {
          e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        } finally {
          conn.disconnect();
        }
    }
}
