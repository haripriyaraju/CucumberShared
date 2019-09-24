package calculator;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {
	@Given ("I enter 40 in the calculator")
	public void abc() {
		System.out.println("ADD");
		System.out.println("I enter 40 in the calculator");
	}
	@And ("I press Add")
	public void bdc() {
		System.out.println("I press Add");
	}
	@And ("I have entered 20 in the calculator")
	public void cdc() {
		System.out.println("I have entered 20 in the calculator");
	}
	@When ("I press Equals")
	public void fgv() {
		System.out.println("I press Equals");
	}
	@Then ("The should be 60")
	public void fkjk() {
		System.out.println("The should be 60");
	}
}
