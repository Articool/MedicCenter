import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import ru.medcenter.base_test.BaseTest;
import ru.medcenter.base_test.FrameworkModule;
import ru.medcenter.ui.steps.LoginSteps;

@Guice(modules = {FrameworkModule.class})
public class OneTest extends BaseTest {
    @Inject
    private LoginSteps loginSteps;

    @Test(groups = {""},description = "as")
    public void oneTest(){
        loginSteps.enterLogin();
        loginSteps.enterPassword();
        loginSteps.clickEnterButton();
    }



}
