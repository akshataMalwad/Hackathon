import { $, ElementFinder, element, By, promise } from "protractor";

export class AdminPage {
    private title: ElementFinder;
    constructor() {
        this.title = element(By.cssContainingText('h3', 'User Request'));
    }

    get getTitle(): ElementFinder {
        return this.title;
    }
}