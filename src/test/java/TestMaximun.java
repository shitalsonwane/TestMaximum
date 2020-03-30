import org.junit.Assert;
import org.junit.Test;

public class TestMaximun {
    //when max int number at position one
    @Test
    public void givenIntegers_WhenMaxAtOne_ReturnMaximum() {
        Integer max = FindMaximun.checkMaximun(10,5,2);
        Assert.assertEquals((Integer) 10, max);
    }
    @Test     //when max int number at position Two
    public void givenIntegers_WhenMaxAtTwo_ReturnMaximum() {
        Integer max =  FindMaximun.checkMaximun(5,10,6,7);
        Assert.assertEquals((Integer) 10, max);
    }
    @Test     //when max int number at position Three
    public void givenIntegers_WhenMaxAtThree_ReturnMaximum() {
        Integer max = FindMaximun.checkMaximun(1,23,77,99);
        Assert.assertEquals((Integer) 99, max);
    }
    @Test     //when float max number at position one
    public void givenFloat_WhenMaxAtOne_ReturnMaximum() {
        Float max = FindMaximun.checkMaximun(5.2f, 2.5f, 3.6f);
        Assert.assertEquals((Float) 5.2f, max);
    }
    @Test   //when float max number at position Two
    public void givenFloat_WhenMaxAtTwo_ReturnMaximum() {
        Float max = FindMaximun.checkMaximun(5.2f, 10.5f, 3.6f);
        Assert.assertEquals((Float) 10.5f, max);
    }
    @Test       //when float max number at position Three
    public void givenFloat_WhenMaxAtThree_ReturnMaximum() {
        Float max = FindMaximun.checkMaximun(5.2f, 2.5f, 13.6f);
        Assert.assertEquals((Float) 13.6f, max);
    }
    @Test       //when string max number at position one
    public void givenString_WhenMaxAtOne_ReturnMaximum() {
        String max = (String) FindMaximun.checkMaximun("saraswati", "ganga", "kaveri");
        Assert.assertEquals((String) "saraswati", max);
    }
    @Test      //when string max number at position two
    public void givenString_WhenMaxAtTwo_ReturnMaximum() {
        String max = (String) FindMaximun.checkMaximun("ganga", "saraswati", "kaveri");
        Assert.assertEquals((String) "saraswati", max);
    }
    @Test   //when string max number at position three
    public void givenString_WhenMaxAtThree_ReturnMaximum() {
        String max = (String) FindMaximun.checkMaximun("kaveri", "ganga","narmada", "saraswati");
        Assert.assertEquals((String) "saraswati", max);
    }
}
