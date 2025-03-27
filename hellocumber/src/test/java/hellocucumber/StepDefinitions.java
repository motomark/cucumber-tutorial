package hellocucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {


    private String today;
    private String actualAnswer;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }


   private class IsItFriday {
        public String isItFriday(String today) {
            if(null == today) {
                return "Nope";
            }
            else switch (today) {
                case "Friday":
                    return "TGIF";
                case "Monday":
                    return "Sadly";
                default:
                    return "Nope";
            }
    }
    
   } 


    @Given("today is {string}")
    public void today_is(String today) {
        // Write code here that turns the phrase above into concrete actions
        this.today = today;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_wether_it_s_friday_yet() {
       // Write code here that turns the phrase above into concrete actions
       IsItFriday iif = new IsItFriday();
       actualAnswer = iif.isItFriday(today);
   }

    
    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

}
