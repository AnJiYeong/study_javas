import java.util.Map;

import com.google.gson.Gson;

import beans.MemberBean;

public class ConvertJsonWithGson {
    public static void main(String[] args) {
        // 문자열 Json -> Map
        Gson gson = new Gson();
        String jsonStr = "{id:1, name:yojulab}";
        Map jsonMap = gson.fromJson(jsonStr, Map.class); // jsonStr을 Map 형식으로 바꿔줌

        // Map -> 문자열 Json
        String mapStr = gson.toJson(jsonMap);
        
        // 문자열 Json -> Object(bean, model, vo)
        String jsonStrBean = "{firstName:yo, secondName:jo, handleName:lab}";
        MemberBean memberBean = gson.fromJson(jsonStrBean, MemberBean.class);
        int i = 0;
    }
}
