package ru.stqa.pft.addressbook.testsContact;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {


    @Test
    public void testContactDeletion() {
        app.selectFirst();
        app.deleteSelected();
    }

}