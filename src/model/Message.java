package model;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Message extends TimeRecord{
    private String content;
    public Message(String message) {
        this.content = message;
        recordTime();
    }
    public String getContent() {
        return content;
    }
}
