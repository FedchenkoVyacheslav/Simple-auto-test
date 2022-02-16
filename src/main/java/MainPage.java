import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    SelenideElement input = $(".n2o-input");
    SelenideElement confirmButton = $(byText("Отправить"));
    SelenideElement alert = $(".n2o-alert-body-text");

    public void typeName(String name) {
        input.sendKeys(name);
    }

    public MainPage sendMessage(String name) {
        this.typeName(name);
        confirmButton.click();
        return this;
    }

    public void confirmName(String name) {
        alert.shouldHave(Condition.exactText("Привет, " + name));
        if (alert.text().equals("Привет, " + name)) {
            System.out.println("Alert contains entered name");
        } else System.out.println("Error! Alert doesn't contain entered name.");
    }
}
