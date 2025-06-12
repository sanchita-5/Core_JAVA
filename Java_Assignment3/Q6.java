interface Speaker {
    void speak(String text);
}

interface Translator {
    void translate(String text, String language);
}

class AIAssistant implements Speaker, Translator {
    public void speak(String text) {
        System.out.println("Speaking: " + text);
    }

    public void translate(String text, String language) {
        System.out.println("Translated '" + text + "' to [" + language + "]");
    }
}

public class Q6 {
    public static void main(String[] args) {
        AIAssistant ai = new AIAssistant();
        ai.speak("Hello, how can I help you?");
        ai.translate("Good Morning", "Spanish");
    }
}
