package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchsteps {
	@Given("Search field should be present on the Automation website")
	public void search_field_should_be_present_on_the_automation_website() {
	System.out.println("Step 1: I landed on search page");
	}
	

	@When("I search for a course {string} having price {int}")
	public void i_search_for_a_course_having_price(String courseName, Integer price) {
		System.out.println("Step 2: Search the course with name" + "price" +price);

	}

	@Then("Course {string} should be dispalyed")
	public void course_should_be_dispalyed(String courseName) {
		System.out.println("Step 3: course" + courseName + "is displayed");
}
}
