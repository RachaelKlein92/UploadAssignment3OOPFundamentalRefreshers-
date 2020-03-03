
import OptionTwoInterface.CalcSalaryIncreaseRyan;
import OptionTwoInterface.Calculations;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;


public class TestThree {

    @Before
    public void setUp() throws Exception {

    }


    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void testInterface() throws Exception {

        //this interface method : AgeOfEmployer() implemented inside interface IMethodsOne
        // give the expected output correctly when check with actual output
        Calculations testInterface = new Calculations();
        assertEquals(200, testInterface.AgeOfEmployer(),0);




    }


}
