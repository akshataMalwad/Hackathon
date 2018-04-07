import { browser, protractor } from "protractor";
// import { SearchPageObject } from "../pages/searchPage";
const { When, Then } = require("cucumber");

// const search: SearchPageObject = new SearchPageObject();

/*When(/^I type "(.*?)"$/, async (text) => {
    await search.searchTextBox.sendKeys(text);
});

Then(/^I click on search button$/, async () => {
    await browser.actions().sendKeys(protractor.Key.ENTER).perform();
});*/

When(/^I go to Google$/, function (): any  {
   return console.log("navigated to url");
});

Then(/^I should see Google logo$/, function (): any {
   return console.log("verified logo");
});
