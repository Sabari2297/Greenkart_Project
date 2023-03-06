package com.stepdefinition;

import java.io.IOException;

import com.baseclass.BaseClass;
import com.helper.File_Reader_Manager;
import com.pom.Page_Object_Manager;
import com.pom.PomPage;
import com.pom.PomPage01;
import com.pom.PomPage02;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("User launch the url")
	public void user_launch_the_url() throws InterruptedException, IOException {
		
		String url = File_Reader_Manager.getInstanceCr().getUrl();
		getUrl(url);
	
	}

	@When("User search the vegetables")
	public void user_search_the_vegetables() {
		
		sendkeys(pom.getInstancePomPage().getSearchBox(), "tomato");

	}

	@When("User click the add to cart button")
	public void user_click_the_add_to_cart_button() {
		
		clickOnElement(pom.getInstancePomPage().getAddToCart());


	}

	@When("User click the items button")
	public void user_click_the_items_button() {
		
		clickOnElement(pom.getInstancePomPage().getItems());


	}

	@When("User click the proceed to checkout button")
	public void user_click_the_proceed_to_checkout_button() {
		
		clickOnElement(pom.getInstancePomPage().getpToCheckout());


	}

	@Then("User see the next page")
	public void user_see_the_next_page() {
		
		System.out.println("Next Page Load");
	
	}
	
	@When("User enter the promo code")
	public void user_enter_the_promo_code() throws InterruptedException {
		
		Thread.sleep(3000);
		sendkeys(pom.getInstancePomPage01().getPromoCode(), "1234");

	}

	@When("User click the apply button")
	public void user_click_the_apply_button() {
		clickOnElement(pom.getInstancePomPage01().getApply());
	
	}

	@When("user click the place order button")
	public void user_click_the_place_order_button() throws InterruptedException {
		
		clickOnElement(pom.getInstancePomPage01().getPlaceOrder());
        
		Thread.sleep(3000);
	}
	
	@When("User Select a Country")
	public void user_select_a_country() {
		
		selection(pom.getInstancePomPage02().getSelect(), "byvalue", "Bermuda");
	
	}

	@When("User click a agree button")
	public void user_click_a_agree_button() {
		
		clickOnElement(pom.getInstancePomPage02().getAgree());
	
	}

	@When("User click the proceed button")
	public void user_click_the_proceed_button() {
		
		clickOnElement(pom.getInstancePomPage02().getProceed());
	
	}


}
