package org.example;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class EBSLoginPage extends BasePage {

    public void login() throws FindFailed {
        Screen sc = new Screen();

        Pattern userName = new Pattern("C:\\Users\\DYERRABO\\Documents\\GitHub\\Sikuli_POC_EBS\\src\\main\\resources\\Images\\UserId.sikuli\\1667474161803.png");
        Pattern password =  new Pattern("C:\\Users\\DYERRABO\\Documents\\GitHub\\Sikuli_POC_EBS\\src\\main\\resources\\Images\\password.PNG");
        Pattern login = new Pattern("C:\\Users\\DYERRABO\\Documents\\GitHub\\Sikuli_POC_EBS\\src\\main\\resources\\Images\\login.PNG");

        sc.wait(userName, 5);

        sc.type(userName.exact().targetOffset(-82,-3),"tstatm");

        sc.click(password);
        sc.type("GoodDream123!");

        sc.click(login);
;    }
}
