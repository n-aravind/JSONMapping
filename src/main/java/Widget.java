import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Widget {
    private String name;
    private boolean flag;
    private int marks;
    private Date date;
    private List<String> hobbies;
}
