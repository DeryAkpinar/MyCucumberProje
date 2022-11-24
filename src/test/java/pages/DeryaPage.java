package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeryaPage {

    public DeryaPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@aria-haspopup='true']")
    public WebElement userLogin;

    @FindBy(xpath = "//*[@id='login-item']")
    public WebElement signIn1;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement userName;


    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;


    @FindBy(xpath = "(//*[text()='Sign in'])[3]")
    public WebElement signIn2;


    @FindBy(css = "li[id='account-menu'] a[class='d-flex align-items-center dropdown-toggle nav-link'] span")
    public WebElement kullaniciBilgiSekmesi;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[3]")
    public WebElement settingsButton;

    @FindBy(xpath = "//*[@id='settings-title']")
    public WebElement userSettingsForYazisi;




    @FindBy(xpath = "//*[@id='firstName']")
    public WebElement firstName;


    @FindBy(xpath = "//*[@role='alert']")
    public WebElement alert;



    @FindBy(xpath = "//*[@id='lastName']")
    public WebElement lastName;



    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;


    @FindBy(xpath = "//*[text()='Save']")
    public WebElement save;


    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement settingSaved;


    //=================US07 locate'leri===============//

    @FindBy(xpath = "//*[text()='Welcome to MEDUNNA']")
    public WebElement welcome;

    @FindBy(xpath = "//span[normalize-space()='MY PAGES(PATIENT)']")
    public WebElement myPages;

    @FindBy(xpath = "//span[normalize-space()='Make an Appointment']")
    public WebElement makeAnApp;

    @FindBy(xpath = " (//*[text()='Make an Appointment'])[2]")
    public WebElement makeAnAppYazisi;







    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phone;




    //span[normalize-space()='DEPARTMENTS']

    @FindBy(xpath = "//input[@style='border-bottom-width: 1px; margin-top: 7px;']")
    public WebElement appoDate;


    @FindBy(xpath = "//span[normalize-space()='Send an Appointment Request']")
    public WebElement sendAnApp;



    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement appoRegistrationSaved;























}
