"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const protractor_1 = require("protractor");
class SearchPageObject {
    constructor() {
        this.userName = protractor_1.$("#lst-ib");
        this.password = protractor_1.$("input[value='Google Search']");
        this.loginButton = protractor_1.$("");
        this.signUp = protractor_1.$("");
    }
    login(uName, pwd) {
        this.userName.sendKeys(uName);
        this.password.sendKeys(pwd);
        this.loginButton.click();
    }
    goToSignUp() {
        this.signUp.click();
    }
}
exports.SearchPageObject = SearchPageObject;
