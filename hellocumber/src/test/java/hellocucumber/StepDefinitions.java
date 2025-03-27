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
            String message = "";
            if(today.equals("Sunday")){
                message = "Nope";
            }

            if(today.equals("Friday")) {
                message =  "TGIF";
            }
            return message;
    }
    
   } 

   @When("I ask wether it's Friday yet")
   public void i_ask_wether_it_s_friday_yet() {
       // Write code here that turns the phrase above into concrete actions
       IsItFriday iif = new IsItFriday();
       actualAnswer = iif.isItFriday(today);
   }

    @Given("today is Sunday")
    public void today_is_sunday() {
        // Write code here that turns the phrase above into concrete actions
        today = "Sunday";
    }

    @Given("today is Friday")
    public void today_is_friday() {
        today = "Friday";
    }

    
    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

}
