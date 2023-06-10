package utilities;

import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.Set;

public class ApplicationFlow {
    public static void pause(int millisecond){
        try {
            Thread.sleep(millisecond);
        }catch (InterruptedException e){
            System.out.println("Interruption happened");
        }
    }

    public static void scroll(int y){
        Actions action = new Actions(Driver.getDriver());
        action.scrollByAmount(0, y).perform();
    }

    public static void switchToSecondWindow(){
        String currentID = Driver.getDriver().getWindowHandle();
        Set<String> handles = Driver.getDriver().getWindowHandles();
        for (String id:handles){
            if (!id.equals(currentID)){
                Driver.getDriver().switchTo().window(id);
                break;
            }
        }
    }


}
