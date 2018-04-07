import { $, ElementFinder, element, By, promise } from "protractor";

export class EmiCalculatorPage {
    private amount: ElementFinder;
    private tenure: ElementFinder;
    private roi: ElementFinder;
    private emiAmount: ElementFinder;
    private calculateBtn: ElementFinder;
    private title: ElementFinder;

    constructor() {
        this.amount = $("[id='amount']");
        this.tenure = $("[id='tenure']");
        this.roi = $("[id='roi']");
        this.emiAmount = element(By.cssContainingText('h3', 'Total EMI :'));
        this.calculateBtn = $("button[id='emi']");
        this.title = element(By.cssContainingText('h3', 'Home Loan EMI Calculator'));
    }

    public fillCalculatorDetails(loanAmount, loanTenure): promise.Promise<any> {
        return this.amount.sendKeys(loanAmount).then(() => {
             return this.tenure.sendKeys(loanTenure);
        });
    }

    public calculateEmi(): promise.Promise<any> {
        return this.roi.getAttribute('placeholder').then((text) => {
                    console.log('text is: '+ text);
                    if(text !== '') {
                        return this.calculateBtn.click();
                    } else {
                         throw Error('Rate of intrest not displayed');
                    }
                });
    }

    get getemiAmount(): ElementFinder {
        return this.emiAmount;
    }

    get gettitle(): ElementFinder {
        return this.title;
    }


}    