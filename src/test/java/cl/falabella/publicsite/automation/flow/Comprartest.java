package cl.falabella.publicsite.automation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cl.falabella.publicsite.automation.stageSet.ComprarStageSet;


@SuiteClasses({ComprarStageSet.class})

public class Comprartest extends BaseFlow{
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Comprartest.class);
  
    @BeforeClass
    public static void flag() throws Exception {
        LOGGER.info("Ejecutando ClienteFlow...");
    }
}