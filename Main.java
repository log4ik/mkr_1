public class Main {
    public static void main(String[] args) {
        Message originalMessage = new Message("Це тестове повідомлення.   Воно   містить  зайві пробіли.");

        Message compressedMessage = new CompressedMessage(originalMessage);
        System.out.println("Compressed: " + compressedMessage.getText());

        Message encryptedMessage = new EncryptedMessage(compressedMessage);
        System.out.println("Encrypted: " + encryptedMessage.getText());

        Message timestampedMessage = new TimestampedMessage(encryptedMessage);
        System.out.println("Timestamped: " + timestampedMessage.getText());

        Message finalMessage = new AuthorMessage(timestampedMessage, "Логовський Роман Ігорович");
        System.out.println("Final message: " + finalMessage.getText());
    }
}