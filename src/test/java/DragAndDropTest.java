import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;



public class DragAndDropTest {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void DragTest() {

        // Drag&Drop с помощью Selenide.actions()
        open("/drag_and_drop");
        actions().dragAndDrop($("#column-a"), $("#column-b")).perform();
        $("#column-a").shouldHave((text("B")));
        $("#column-b").shouldHave((text("A")));
    }
}
