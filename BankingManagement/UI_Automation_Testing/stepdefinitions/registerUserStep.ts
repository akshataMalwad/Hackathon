import { browser, protractor, element, $, By, ElementFinder } from "protractor";
import {RegisterCustomerPage} from "../pages/registrationPage"
import {expect} from "chai";
const { When, Then, And } = require("cucumber");

const registerPage: RegisterCustomerPage = new RegisterCustomerPage();

When(/^I enter all the required reg details as "(.*?)", "(.*?)", "(.*?)", "(.*?)", "(.*?)", "(.*?)"$/, function(uName, name, emailId, pwd, aadharNumber, contactNumber): any {
    return registerPage.fillRegistrationForm(uName, name, emailId, pwd, aadharNumber, contactNumber);
});

When(/^I click reister button$/, function(): any {
    return registerPage.clickToRegister().then(() => {
        return browser.wait(protractor.ExpectedConditions.alertIsPresent(),10000);
    })
});

Then(/^I should see the customer registration page$/, function(): any {
    let title: ElementFinder = element(By.cssContainingText('h3', 'User Registration'));

    return title.isPresent().then((presence) => {
        return expect(presence).to.be.true;
    })
});