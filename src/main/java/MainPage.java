import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    SelenideElement input = $(".n2o-input");
    SelenideElement confirmButton = $(byText("Отправить"));
    SelenideElement alert = $(".n2o-alert-body-text");

    public void typeMessage(String message) {
        input.sendKeys(message);
    }

    public MainPage sendMessage(String message) {
        this.typeMessage(message);
        confirmButton.click();
        return this;
    }

    public void confirmMessage(String message) {
        alert.shouldHave(Condition.exactText("Привет, " + message));
    }
}
