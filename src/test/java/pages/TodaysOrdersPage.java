package pages;

import utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class TodaysOrdersPage {
    public TodaysOrdersPage(){
        PageFactory.initElements(Driver.getDriver(), this );
    }




}
