import { browser, protractor, element, $, By, ElementFinder } from "protractor";
import {RegisterCustomerPage} from "../pages/registrationPage"
import {expect} from "chai";
const { When, Then, And } = require("cucumber");

const registerPage: RegisterCustomerPage = new RegisterCustomerPage();

When(/^I enter all the required details as "(.*?)", "(.*?)", "(.*?)", "(.*?)", "(.*?)", "(.*?)"$/, function(uName, name, emailId, pwd, aadharNumber, contactNumber): any {
    return registerPage.fillRegistrationForm(uName, name, emailId, pwd, aadharNumber, contactNumber);
});

When(/^I click reister button$/, function(): any {
    return registerPage.clickToRegister();
});
