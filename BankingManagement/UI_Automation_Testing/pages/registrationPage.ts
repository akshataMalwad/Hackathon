import { $, ElementFinder, element, By, promise } from "protractor";

export class RegisterCustomerPage {
    private username: ElementFinder;
    private fullName: ElementFinder;
    private email: ElementFinder;
    private password: ElementFinder;
    private aadhar: ElementFinder;
    private contact: ElementFinder;
    private registerButton: ElementFinder;

    constructor() {
        this.username = $("[id='username']");
        this.fullName = $("[id='name']");
        this.email = $("[id='email']");
        this.password = $("[id='password']");
        this.aadhar = $("[id='aadhar']");
        this.contact = $("[id='contact']");
        this.registerButton = $("button[id='register']");
    }

    public fillRegistrationForm(uName, name, emailId, pwd, aadharNumber, contactNumber ): promise.Promise<any> {
        return this.username.sendKeys(uName).then(() => {
            return this.fullName.sendKeys(name).then(() => {
                return this.email.sendKeys(emailId).then(() => {
                    return this.password.sendKeys(pwd).then(() => {
                        return this.aadhar.sendKeys(aadharNumber).then(() => {
                            return this.contact.sendKeys(contactNumber);
                        });
                    });
                });
            });
        });
    }

    public clickToRegister(): promise.Promise<any> {
        return this.registerButton.click();
    }
}