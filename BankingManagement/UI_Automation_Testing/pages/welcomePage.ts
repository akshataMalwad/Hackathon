import { $, ElementFinder, element, By, promise } from "protractor";

export class CustomerPage {
    private title: ElementFinder;
    constructor() {
        this.title = element(By.cssContainingText('h3', 'Home Loan'));
    }

    get getTitle(): ElementFinder {
        return this.title;
    }
}