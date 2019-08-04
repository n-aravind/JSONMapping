import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Java object to JSON
        Widget widget = new Widget();
        widget.setName("Jon");
        widget.setFlag(false);
        widget.setMarks(99);
        widget.setDate(new Date());

        List<String> hobbies = new ArrayList<String>();
        hobbies.add("Trekking");
        hobbies.add("Philately");
        hobbies.add("Numismatics");
        widget.setHobbies(hobbies);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("src/main/resources/widget.json"),widget);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //JSON to Java object
        try {
            File file = new File("src/main/resources/newWidget.json");
            Widget newWidget = objectMapper.readValue(file,Widget.class);
            System.out.println(newWidget.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
