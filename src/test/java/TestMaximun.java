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
}
