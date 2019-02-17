package cl.falabella.publicsite.automation.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cl.falabella.publicsite.automation.flow.BaseFlow;

public final class GenericMethods {


	public static boolean isClickable(WebElement element,Integer timeOut) {
		try {
			WebDriverWait wait = new WebDriverWait(BaseFlow.driver, timeOut);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static void tiempoEspera(long segundos) {
      ValidarCompraArticulo.driver.manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);
    }
}
