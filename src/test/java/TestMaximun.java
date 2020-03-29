import org.junit.Assert;
import org.junit.Test;

public class TestMaximun {
    //when max int number at position one
    @Test
    public void givenIntegers_WhenMaxAtOne_ReturnMaximum() {
        FindMaximun maximum = new FindMaximun(10, 5, 2);
        Integer max = (Integer) maximum.checkMaximun();
        Assert.assertEquals((Integer) 10, max);
    }
    @Test     //when max int number at position Two
    public void givenIntegers_WhenMaxAtTwo_ReturnMaximum() {
        FindMaximun maximum = new FindMaximun(1, 10, 2);
        Integer max = (Integer) maximum.checkMaximun();
        Assert.assertEquals((Integer) 10, max);
    }
    @Test     //when max int number at position Three
    public void givenIntegers_WhenMaxAtThree_ReturnMaximum() {
        FindMaximun maximum = new FindMaximun(1, 10, 22);
        Integer max = (Integer) maximum.checkMaximun();
        Assert.assertEquals((Integer) 22, max);
    }
    @Test     //when float max number at position one
    public void givenFloat_WhenMaxAtOne_ReturnMaximum() {
        FindMaximun maximum = new FindMaximun(5.2f, 2.5f, 3.6f);
        Float max = (Float) maximum.checkMaximun();
        Assert.assertEquals((Float) 5.2f, max);
    }
    @Test   //when float max number at position Two
    public void givenFloat_WhenMaxAtTwo_ReturnMaximum() {
        FindMaximun maximum = new FindMaximun(5.2f, 10.5f, 3.6f);
        Float max = (Float) maximum.checkMaximun();
        Assert.assertEquals((Float) 10.5f, max);
    }
    @Test       //when float max number at position Three
    public void givenFloat_WhenMaxAtThree_ReturnMaximum() {
        FindMaximun maximum = new FindMaximun(5.2f, 2.5f, 13.6f);
        Float max = (Float) maximum.checkMaximun();
        Assert.assertEquals((Float) 13.6f, max);
    }
    @Test       //when string max number at position one
    public void givenString_WhenMaxAtOne_ReturnMaximum() {
        FindMaximun maximum = new FindMaximun("saraswati", "ganga", "kaveri");
        String max = (String) maximum.checkMaximun();
        Assert.assertEquals((String) "saraswati", max);
    }
    @Test      //when string max number at position two
    public void givenString_WhenMaxAtTwo_ReturnMaximum() {
        FindMaximun maximum = new FindMaximun("ganga", "saraswati", "kaveri");
        String max = (String) maximum.checkMaximun();
        Assert.assertEquals((String) "saraswati", max);
    }
    @Test   //when string max number at position three
    public void givenString_WhenMaxAtThree_ReturnMaximum() {
        FindMaximun maximum = new FindMaximun("kaveri", "ganga", "saraswati");
        String max = (String) maximum.checkMaximun();
        Assert.assertEquals((String) "saraswati", max);
    }
}
