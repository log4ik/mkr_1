import java.util.Base64;

class EncryptedMessage extends Message {
    private Message message;

    public EncryptedMessage(Message message) {
        super(message.getText());
        this.message = message;
    }

    @Override
    public String getText() {
        return Base64.getEncoder().encodeToString(message.getText().getBytes());
    }
}