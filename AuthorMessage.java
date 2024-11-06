class AuthorMessage extends Message {
    private Message message;
    private String authorName;

    public AuthorMessage(Message message, String authorName) {
        super(message.getText());
        this.message = message;
        this.authorName = authorName;
    }

    @Override
    public String getText() {
        return message.getText() + " - " + authorName;
    }
}