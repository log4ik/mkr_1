class CompressedMessage extends Message {
    private Message message;

    public CompressedMessage(Message message) {
        super(message.getText());
        this.message = message;
    }

    @Override
    public String getText() {
        return message.getText().replaceAll("\\s+", " ").trim();
    }
}