package StepDefinations;

import java.io.IOException;

import PageObjects.RegistrationPageObj;
import hooks.hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationPageST {
	RegistrationPageObj rp;

	@Given("Goes to the registration page")
	public void goes_to_the_registration_page() {
		rp = new RegistrationPageObj(hooks.driver);

		rp.signInbtn();
		hooks.logger.info("sign button is clicked");

	}

	@Given("Sign button is clicked")
	public void sign_button_is_clicked() {
		rp.RegisterNow();
		hooks.logger.info("registration page is clicked");
	}

	@When("User try to register the account")
	public void user_try_to_register_the_account() throws Throwable {
		rp.VerifyRegPage();
		hooks.logger.info("registration page url is Verified");
	}

	@When("Enter the fullname and email")
	public void enter_the_fullname_and_email() {
		rp.FullName();
		hooks.logger.info("FullName is Typing");

		rp.Email();
		hooks.logger.info("Email is Typing");

	}

	@When("Enter the password and confirm password values")
	public void enter_the_password_and_confirm_password_values() {
		rp.Password();
		hooks.logger.info("Password is Typing");

		rp.ConfirmPassword();
		hooks.logger.info("Confirm Password is Typing");
	}

	@Then("Enter the phone number")
	public void enter_the_phone_number() {
		rp.PhoneNumber();
		hooks.logger.info("PhoneNumber is Typing");
	}

	@Then("Submit and verify the registarion is successful")
	public void submit_and_verify_the_registarion_is_successful() throws InterruptedException, IOException {
		hooks.waitTime();
		rp.REGISTER();
		hooks.logger.info("Register is clicking");

		hooks.caputureScreen(hooks.driver, "ss");
	}

	@Given("Registration form title  is Verifying")
	public void registration_form_title_is_verifying() {
		rp = new RegistrationPageObj(hooks.driver);
		rp.signInbtn();
		hooks.logger.info("signInbtn is clicking");

		rp.RegisterNow();
		hooks.logger.info("RegisterNow is clicking");

		rp.VerifyRegTitle();
		hooks.logger.info("Register title is Verifying");

		rp.FullNameTitle();
		hooks.logger.info("FullName title is Verifying");

		rp.EmailTitle();
		hooks.logger.info("Email title is Verifying");

		rp.PasswordTitle();
		hooks.logger.info("Password title is Verifying");

		rp.ConfirmPassword_Title();
		hooks.logger.info(" Confirm Password title is Verifying");

		rp.PhoneNumber_Title();
		hooks.logger.info("PhoneNumber title is Verifying");

	}

	@When("Mandatory field is Verifying")
	public void mandatory_field_is_verifying() {
		rp.REGISTER();
		hooks.logger.info("REGISTER is clicking");

		rp.FullName_Error();
		hooks.logger.info("Fullname error message is Verifying");

		rp.Email_Error();
		hooks.logger.info("Email error message is Verifying");

		rp.Password_Error();
		hooks.logger.info("Password error message is Verifying");

	}

	@Then("Placeholder is verifying")
	public void placeholder_is_verifying() {

		rp.FullNamePH();
		hooks.logger.info("FullName field Placeholder Name is Verifying");

		rp.EmailPH();
		hooks.logger.info("Email field Placeholder Name is Verifying");

		rp.PasswordPH();
		hooks.logger.info("Password field Placeholder Name is Verifying");

		rp.ConfirmPasswordPH();
		hooks.logger.info("Confirm Password field Placeholder Name is Verifying");

		rp.PhoneNumberPH();
		hooks.logger.info("PhoneNumber field Placeholder Name is Verifying");
	}

	@Then("Logo is verifying")
	public void logo_is_verifying() {
		rp.verifyLogo();
		hooks.logger.info("Registration page logo is displayed");
	}
}
