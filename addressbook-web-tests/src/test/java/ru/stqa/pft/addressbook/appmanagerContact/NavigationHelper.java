package ru.stqa.pft.addressbook.appmanagerContact;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void closeAlert() {
        wd.switchTo().alert().accept();
    }
}
