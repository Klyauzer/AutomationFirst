package test;

import org.junit.jupiter.api.Test;

public class First extends TestBase {


    @Test
    public void firstTest(){
        main    .goTo()
                .chooseTask("1");
        taskOne.checkPageIsCorrect();

    }

//    @Test
//    public void secondTest(){
//        driver.get(SITE_URL);
//    }
}
