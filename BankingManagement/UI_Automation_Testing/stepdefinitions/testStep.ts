import { browser, protractor, element, $, By, ElementFinder, ExpectedConditions } from "protractor";
import {LoginPage} from "../pages/loginPage";
import {CustomerPage} from "../pages/welcomePage";
import {AdminPage} from "../pages/adminPage";
import {expect} from "chai";
const { When, Then, And } = require("cucumber");

// let chai = require('chai');
// let expect = chai.expect;
const loginPage: LoginPage = new LoginPage();
const customePage: CustomerPage = new CustomerPage();
const adminPage: AdminPage = new AdminPage();

/*When(/^I type "(.*?)"$/, async (text) => {
    await search.searchTextBox.sendKeys(text);
});

Then(/^I click on search button$/, async () => {
    await browser.actions().sendKeys(protractor.Key.ENTER).perform();
});*/

When(/^I am on Hackathon page$/, async() => {
    await browser.get('http://127.0.0.1:8080/');
});

Then(/^I login as a "(.*?)" with credentials as username "(.*?)" and password "(.*?)"$/, function(role, username, password) {
    return loginPage.login(role, username, password).then(() => {
        if(role === 'Customer') {
          return browser.wait(protractor.ExpectedConditions.visibilityOf(customePage.getTitle),10000);
        }
        else {
           return browser.wait(protractor.ExpectedConditions.visibilityOf(adminPage.getTitle),10000);
        }
        
    });
});

Then(/^I should see the "(.*?)"$/, async(pageName) => {
    if(pageName === 'Customer home page') {
        return customePage.getTitle.isPresent().then((presence) => {
            return expect(presence).to.be.true;
        })
    } else {
        return adminPage.getTitle.isPresent().then((presence) => {
            return expect(presence).to.be.true;
        })
    }
});

Then(/^I click Create New Account$/, function(): any {
    let title: ElementFinder = element(By.cssContainingText('h3', 'User Registration'));
    return loginPage.goToSignUp().then(() => {
        return browser.wait(protractor.ExpectedConditions.visibilityOf(title),10000);
    });
});

Then(/^I should see Google logo$/, async() => {
   await browser.sleep(5000);
});
