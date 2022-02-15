import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SendGreetings {
    String URL = "https://n2oapp.net/sandbox/view/examples_greeting/#/";
    String message = "Hello";
    MainPage newGreetings = new MainPage();

    @Test
    public void main() {
        open(URL);
        newGreetings.sendMessage(message).
                confirmMessage(message);
    }
}
