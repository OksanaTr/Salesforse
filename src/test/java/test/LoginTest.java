package test;


import test.base.BaseTest;

public class LoginTest extends BaseTest {


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Test
    public void  loginTestWithValidData(){
        boolean isHomePageOpen = loginPage.open()
            .enterData("museahe-g0nb@force.com","A258456a")
            .clickLoginButton()
                    .isPageOpen();


            assertequals(homePage.isPageOpen());
        }

    private void assertequals(boolean pageOpen) {

    }
}


  