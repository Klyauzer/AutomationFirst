package test;

import org.junit.jupiter.api.Test;

public class First extends TestBase {


    @Test
    public void firstTest(){
        driver.get(SITE_URL);

    }

    @Test
    public void secondTest(){
        driver.get(SITE_URL);
    }
}
