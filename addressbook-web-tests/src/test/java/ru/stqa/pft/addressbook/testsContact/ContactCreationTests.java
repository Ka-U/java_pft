package ru.stqa.pft.addressbook.testsContact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.modelContact.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.initContactCreation();
        app.fillContactForm(new ContactData("Name1", "Middle name1", "Last name1"));
        app.submitContactCreation();
    }

}
