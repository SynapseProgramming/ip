
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Jacktest {

  Jacktest() {
    Map<String, Object> data = new HashMap<>();
    data.put("test", "wow");
    data.put("hello", "world");

    ObjectMapper objectMapper = new ObjectMapper();
    String test = "";
    try {
      objectMapper.writeValue(new File("test_data.json"), data);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
