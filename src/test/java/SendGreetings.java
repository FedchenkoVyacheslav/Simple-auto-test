import org.junit.Before;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SendGreetings {
    String URL = "https://n2oapp.net/sandbox/view/examples_greeting/#/";

    @Before
    public void init(){

    }

    @Test
    public void main(){
        open(URL);
    }
}
