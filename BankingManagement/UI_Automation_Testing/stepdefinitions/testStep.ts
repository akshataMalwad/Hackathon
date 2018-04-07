import { browser, protractor, element, $, By, ElementFinder } from "protractor";
import {LoginPage} from "../pages/loginPage"
import {expect} from "chai";
const { When, Then, And } = require("cucumber");

// let chai = require('chai');
// let expect = chai.expect;
const loginPage: LoginPage = new LoginPage();

/*When(/^I type "(.*?)"$/, async (text) => {
    await search.searchTextBox.sendKeys(text);
});

Then(/^I click on search button$/, async () => {
    await browser.actions().sendKeys(protractor.Key.ENTER).perform();
});*/

When(/^I am on Hackathon page$/, async() => {
    await browser.get('http://127.0.0.1:8080/');
});

Then(/^I login as a "(.*?)" with credentials as username "(.*?)" and password "(.*?)"$/, async(role, username, password) => {
    await loginPage.login(role, username, password);
});

Then(/^I click Create New Account$/, async() => {
    await loginPage.goToSignUp();
});

Then(/^I should see the customer registration page$/, function(): any {
    let title: ElementFinder = element(By.cssContainingText('h3', 'User Registration'));
    // return expect(title.isPresent()).to.eventually.be.true;
    return title.isPresent().then((presence) => {
        return expect(presence).to.be.true;
    })
});

Then(/^I should see Google logo$/, async() => {
   await browser.sleep(5000);
});
