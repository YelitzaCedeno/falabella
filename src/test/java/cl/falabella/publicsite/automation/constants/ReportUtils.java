package cl.falabella.publicsite.automation.constants;

import com.relevantcodes.extentreports.ExtentTest;

public class ReportUtils {

    public static void setLinea(ExtentTest extentTest) {
        String URL = Constants.URL;
        extentTest.assignCategory(URL);
    }

    public static void setUsuario(ExtentTest extentTest) {
        if (System.getenv("") != null)
            extentTest.assignAuthor(System.getenv(""));
        else
            extentTest.assignAuthor("ycedenov");
    }

}
