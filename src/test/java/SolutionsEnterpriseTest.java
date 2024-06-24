import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.*;

import static com.codeborne.selenide.Selenide.open;

public class SolutionsEnterpriseTest {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @AfterEach
    void tearDown(){
        closeWebDriver();
    }

    @Test
        void searchEnterprise() {
        open("/selenide/selenide");

    }
}