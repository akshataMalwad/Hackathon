import { $, ElementFinder } from "protractor";

export class SearchPageObject {
    public userName: ElementFinder;
    public password: ElementFinder;
    public loginButton: ElementFinder;
    public signUp: ElementFinder;

    constructor() {
        this.userName = $("#lst-ib");
        this.password = $("input[value='Google Search']");
        this.loginButton = $("");
        this.signUp = $("");
    }
    
    public login(uName, pwd): void {
        this.userName.sendKeys(uName);
        this.password.sendKeys(pwd);
        this.loginButton.click();      
    }
    
    public goToSignUp(): void {
        this.signUp.click();    
    }   
}
