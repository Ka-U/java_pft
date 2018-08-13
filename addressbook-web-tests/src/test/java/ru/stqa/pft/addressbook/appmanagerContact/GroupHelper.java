package ru.stqa.pft.addressbook.appmanagerContact;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.modelContact.ContactData;

public class GroupHelper extends HelperBase {

    public GroupHelper(FirefoxDriver wd) {

        super(wd);
    }

    public void submitContactCreation() { click(By.name("submit")); }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
    }

    public void initContactCreation() {
        click(By.name("add new"));
    }

    public void selectFirst() {
        click(By.name("selected[]"));
    }

    public void deleteSelected() {
        wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
//        click(By.name("delete"));


    }
}
