package stepDefinition;

import io.cucumber.java.en.Then;

import static pages.DashboardPage.*;

public class DashboardPage {
    @Then("User should be able to view the product category page")
    public static void user_should_able_to_view_product_category_page(){
        verify_shoe_details();
    }
}
