import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Widget {
    private String name;
    private boolean flag;
    private int marks;
    private Date date;
    private List<String> hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Widget{" +
                "name='" + name + '\'' +
                ", flag=" + flag +
                ", marks=" + marks +
                ", date=" + date +
                ", hobbies=" + hobbies +
                '}';
    }
}
