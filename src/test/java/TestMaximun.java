import org.junit.Assert;
import org.junit.Test;

public class TestMaximun {
    //when max number at position one
    @Test
    public void givenIntegers_WhenMaxAtOne_ReturnMaximum(){
        FindMaximun maximun=new FindMaximun();
        int maxInteger=maximun.maximumInteger(5,2,3);
        Assert.assertEquals(5,maxInteger);
    }
    @Test
    public void givenIntegers_WhenMaxAtTwo_ReturnMaximum(){
        FindMaximun maximun=new FindMaximun();
        int maxInteger=maximun.maximumInteger(2,5,3);
        Assert.assertEquals(5,maxInteger);
    }
    @Test
    public void givenIntegers_WhenMaxAtThree_ReturnMaximum(){
        FindMaximun maximun=new FindMaximun();
        int maxInteger=maximun.maximumInteger(2,1,5);
        Assert.assertEquals(5,maxInteger);
    }
    @Test
    public void givenFloats_WhenMaxAtOne_ReturnMaximum() {
        FindMaximun maximum = new FindMaximun();
        Float max = maximum.maximumFloat(5.2f, 2.5f, 3.6f);
        Assert.assertEquals((Float) 5.2f, max);
    }
    @Test
    public void givenFloats_WhenMaxAtTwo_ReturnMaximum() {
        FindMaximun maximum = new FindMaximun();
        Float max = maximum.maximumFloat(2.2f, 5.5f, 3.6f);
        Assert.assertEquals((Float) 5.5f, max);
    }
    @Test
    public void givenFloats_WhenMaxAtThree_ReturnMaximum() {
        FindMaximun maximum = new FindMaximun();
        Float max = maximum.maximumFloat(2.2f, 3.5f, 5.6f);
        Assert.assertEquals((Float) 5.6f, max);
    }
    @Test
    public void givenString_WhenMaxAtOne_ReturnMaximum(){
        FindMaximun maximun=new FindMaximun();
        String maxString=maximun.maximumString("9","3","5");
        Assert.assertEquals("9",maxString);
    }
    @Test
    public void givenString_WhenMaxATwo_ReturnMaximum(){
        FindMaximun maximun=new FindMaximun();
        String maxString=maximun.maximumString("3","9","5");
        Assert.assertEquals("9",maxString);
    }

}
