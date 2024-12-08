package school.redrover.page.base;

import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = null;

        NewBaseModel baseModel = new NewBaseModel(driver);
        baseModel.getDriver();
        baseModel.getWait2();
        baseModel.getWait5();
        baseModel.getWait10();

        NewBasePage basePage = new NewBasePage(driver);
        basePage.getDriver();
        basePage.getWait2();
        basePage.getWait5();
        basePage.getWait10();
        basePage.gotoHomePage();

        NewBaseProjectPage baseProjectPage = new NewBaseProjectPage(driver);
        baseProjectPage.getDriver();
        baseProjectPage.getWait2();
        baseProjectPage.getWait5();
        baseProjectPage.getWait10();
        baseProjectPage.gotoHomePage();
        baseProjectPage.editDescription("text");
    }

    static class NewBaseModel extends BaseModel {
        public NewBaseModel(WebDriver driver) {
            super(driver);
        }
    }

    static class NewBasePage extends BasePage {
        public NewBasePage(WebDriver driver) {
            super(driver);
        }
    }

    static class NewBaseProjectPage extends BaseProjectPage<NewBaseProjectPage> {
        public NewBaseProjectPage(WebDriver driver) {
            super(driver);
        }
    }


}
