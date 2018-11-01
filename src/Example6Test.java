import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Example6Test {

    @Test
    public void shouldSayThatNumberIsInRange(){
        Example6 range = new Example6(10,20);
        Assert.assertTrue(range.isInRange(15));
    }

    @Test
    public void shouldSayThatNumberIsNotInRange(){
        Example6 range = new Example6(10,20);
        Assert.assertFalse(range.isInRange(22));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrownIllegalArgumentExceptionOnWrongParameters(){
        new Example6(20,10);
    }

    @Test
    public void shouldHaveProperErrorMessage(){
        try{
            new Example6(20,10);
            fail("Exception wasn't thrown!");
        } catch(IllegalArgumentException exception){
            assertEquals("lowerBound is bigger than upperBound", exception.getMessage());
        }
    }
}