import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.DragAndDropOptions.to;



public class DragAndDropTest {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void dragActionTest() {

        // Drag&Drop с помощью Selenide.actions()
        open("/drag_and_drop");
        actions().dragAndDrop($("#column-a"), $("#column-b")).perform();
        $("#column-a").shouldHave((text("B")));
        $("#column-b").shouldHave((text("A")));
    }

    @Test
    void dragElementTest() {

        // вариант $(element).dragAndDrop($(to-element))
        open("/drag_and_drop");
        actions().dragAndDrop($("#column-a"), $("#column-b")).perform();
        $("#column-b").dragAndDrop(to("#column-a"));
        $("#column-b").shouldHave((text("B")));
        $("#column-a").shouldHave((text("A")));
    }
}
