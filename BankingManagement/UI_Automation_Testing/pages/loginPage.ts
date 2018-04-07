import { $, ElementFinder, element, By, promise, browser, ExpectedConditions, protractor } from "protractor";

export class LoginPage {
    private role: ElementFinder;
    private customerRole: ElementFinder;
    private adminRole: ElementFinder;
    private userName: ElementFinder;
    private password: ElementFinder;
    private loginButton: ElementFinder;
    private signUp: ElementFinder;
    private emiCalculatorLink: ElementFinder;

    constructor() {
        this.role = element(By.id('role'));
        this.customerRole = element(By.cssContainingText('option', 'Customer'));
        this.adminRole = element(By.cssContainingText('option', 'Admin'));
        this.userName = $("input[id='username']");
        this.password = $("input[id='password']");
        this.loginButton = $("[id='login']");
        this.signUp = element(By.linkText('Create an Account'));
        this.emiCalculatorLink = element(By.linkText('EMI Calculator'));
    }
    
    public login(role, uName, pwd): promise.Promise<any> {
        return this.userName.sendKeys(uName)
        .then(() => {
            return this.password.sendKeys(pwd)
            .then(() => {
                return this.role.click()
                .then(() => {
                    if(role === 'Customer') {
                        return this.customerRole.click();
                    } else {
                         return this.adminRole.click();
                    }
                })
                .then(() => {
                    return this.loginButton.click();
                });
            });
        });       
    }
    
    public goToSignUp(): promise.Promise<any> {
        return this.signUp.click();    
    }   

    get getEmiCalLink(): ElementFinder {
        return this.emiCalculatorLink;
    }
}
