package ru.stqa.pft.addressbook.testsContact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.modelContact.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification () throws InterruptedException {
        app.getGroupHelper().selectContact();
        app.getGroupHelper().deleteContact();
        app.getNavigationHelper().closeAlert();
        app.getGroupHelper().initContactModification();
        app.getGroupHelper().fillContactForm(new ContactData("Name1", "Middle name1", "Last name1"));
        app.getGroupHelper().submitContactModification();
        Thread.sleep(5000);
    }
}
