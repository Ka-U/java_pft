package ru.stqa.pft.addressbook.appmanagerContact;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.modelContact.ContactData;

public class GroupHelper {
    private FirefoxDriver wd;

    public GroupHelper(FirefoxDriver wd) {
       this.wd = wd;
    }

    public void submitContactCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void fillContactForm(ContactData contactData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
        wd.findElement(By.name("middlename")).click();
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys(contactData.getMiddlename());
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
    }

    public void initContactCreation() {
        wd.findElement(By.name("add new")).click();
    }

    public void selectFirst() {
        wd.findElement(By.name("selected[]")).click();
    }

    public void deleteSelected() {
        wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
//        click(By.name("delete"));


    }
}
