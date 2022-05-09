package model;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Message {
    private String content;
    private StringBuilder timeStamp;


    public Message(String message) {
        this.content = message;
        timeStamp = new StringBuilder();
        String tempTimeStamp = new SimpleDateFormat("MMddyyyy_HHmm").format(Calendar.getInstance().getTime());
        convertToReadableFormat(tempTimeStamp);
    }

    private void convertToReadableFormat(String tempTimeStamp) {
        displayMonth(tempTimeStamp);
        timeStamp.append(" " + tempTimeStamp.substring(2,4));
        timeStamp.append(", " + tempTimeStamp.substring(4,8));
        timeStamp.append(" at " + tempTimeStamp.substring(9,11) + ":" + tempTimeStamp.substring(11,13));
    }

    public String getContent() {
        return content;
    }

    public String getTimeStamp() {
        return timeStamp.toString();
    }

    private void displayMonth(String tempTimeStamp) {
        String focus = tempTimeStamp.substring(0,2);
        switch(focus) {
            case "01":
                timeStamp.append("January");
                break;
            case "02":
                timeStamp.append("Febuary");
                break;
            case "03":
                timeStamp.append("March");
                break;
            case "04":
                timeStamp.append("April");
                break;
            case "05":
                timeStamp.append("May");
                break;
            case "06":
                timeStamp.append("June");
                break;
            case "07":
                timeStamp.append("July");
                break;
            case "08":
                timeStamp.append("August");
                break;
            case "09":
                timeStamp.append("September");
                break;
            case "10":
                timeStamp.append("October");
                break;
            case "11":
                timeStamp.append("November");
                break;
            case "12":
                timeStamp.append("December");
                break;


        }


    }
}
