package ru.stqa.pft.addressbook.appmanagerContact;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void deleteContact() {
        click(By.cssSelector("input[value='Delete']"));
    }

    public void initContactModification() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }

    public void submitContactModification() {
        click(By.xpath("//div[@id='content']/form[1]/input[22]"));
    }

}
