import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @auther G.Fukang
 * @date 3/27 16:50
 */
public class ScriptUtil {

    // 解析 lua
    public static String getScript(String path) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        InputStream inputStream = ScriptUtil.class.getClassLoader().getResourceAsStream(path);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String str;

        while ((str = bufferedReader.readLine()) != null) {
            stringBuilder.append(str).append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }
}