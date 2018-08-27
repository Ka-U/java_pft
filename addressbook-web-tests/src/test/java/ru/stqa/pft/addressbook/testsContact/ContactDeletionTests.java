package ru.stqa.pft.addressbook.testsContact;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {


    @Test
    public void testContactDeletion() throws InterruptedException {
        app.getGroupHelper().selectContact();
        app.getGroupHelper().deleteContact();
        app.getNavigationHelper().closeAlert();
        Thread.sleep(5000);
    }

}
