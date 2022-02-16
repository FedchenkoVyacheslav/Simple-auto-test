import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.open;

public class SendGreetings {
    String URL = "https://n2oapp.net/sandbox/view/examples_greeting/#/";
    String name = "Tom Anderson";
    MainPage newGreetings = new MainPage();

    @Before
    public void init() {
        open(URL);
    }

    @Test
    @DisplayName("Checking the sending of a message and its output in an alert")
    public void check() {
        newGreetings.sendMessage(name).
                confirmName(name);
    }
}
