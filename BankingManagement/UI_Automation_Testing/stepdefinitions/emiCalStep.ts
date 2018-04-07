import { browser, protractor, element, $, By, ElementFinder } from "protractor";
import {EmiCalculatorPage} from "../pages/emiCalculatorPage";
import {LoginPage} from "../pages/loginPage";
import {expect} from "chai";
const { When, Then, And } = require("cucumber");

const calculatorPage: EmiCalculatorPage = new EmiCalculatorPage();
const loginPage: LoginPage = new LoginPage();

When(/^I enter all the required details as "(.*?)", "(.*?)"$/, function(amount, tenure): any {
    return calculatorPage.fillCalculatorDetails(amount, tenure);
});

When(/^I click (EMI calculator|Calculate EMI button)$/, function(buttonName): any {
    if(buttonName === 'Calculate EMI button' ) {
        return calculatorPage.calculateEmi();
    } else {
        return loginPage.getEmiCalLink.click();
    }
    
});

Then(/^I should see the EMI Calculator Page in new tab$/, function(): any {
    return browser.getAllWindowHandles().then((handles: string[]) => {
        return browser.switchTo().window(handles[1]).then(() => {
            return calculatorPage.gettitle.isPresent().then((presence) => {
                return expect(presence).to.be.true;
            })
        })
    })
});

Then(/^I should see the EMI value "90.77" on screen$/, function(): any {
    return calculatorPage.getemiAmount.getText().then((text) => {
        return expect(text).contains('90.77');
    })
});

Then(/^I should see the alert$/, function(): any {
            return browser.switchTo().alert().accept();
});