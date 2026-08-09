class Message {
    void send() {
        System.out.println("Message sent");
    }
}

class TextMessage extends Message {
    @Override
    void send() {
        System.out.println("Text Message sent");
    }
}

class ImageMessage extends Message {
    @Override
    void send() {
        System.out.println("Image sent");
    }
}

class VoiceMessage extends Message {
    @Override
    void send() {
        System.out.println("Voice Message sent");
    }
}

public class Whatsapp{
    public static void main ( String [] a) {
        Message m;

m = new TextMessage();
m.send();

m = new ImageMessage();
m.send();

m = new VoiceMessage();
m.send();
        }
    }