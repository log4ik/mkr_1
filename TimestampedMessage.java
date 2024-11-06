import java.text.SimpleDateFormat;
import java.util.Date;

class TimestampedMessage extends Message {
    private Message message;

    public TimestampedMessage(Message message) {
        super(message.getText());
        this.message = message;
    }

    @Override
    public String getText() {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        return message.getText() + " [" + timestamp + "]";
    }
}