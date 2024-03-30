package stepDefinition;

import io.cucumber.java.en.When;
import static pages.LoginPage.*;

public class LoginPage {
    @When("User successfully enters the log in details")
    public void user_successfully_enter_login_details(){
        enter_username("surya");
        enter_password("admin@123");
        click_login_button();
    }

}
