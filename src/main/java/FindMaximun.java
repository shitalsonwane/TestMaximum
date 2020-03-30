import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMaximun<E extends Comparable> {
    public static void main(String args[])
    {
        System.out.printf("Welcome To Test Maximum Problem");
    }
    E[] array;
    // parameter constructor
    public FindMaximun(E[] array) {
        this.array=array;
    }
    //function for check max
    public static <E extends Comparable> E checkMaximun(E... array )
    {
        Arrays.sort(array);
        return array[array.length-1];
    }
    //overwrite the method for parameter initialtion
    public E checkMaximun(){
        return checkMaximun(array);
    }
}
