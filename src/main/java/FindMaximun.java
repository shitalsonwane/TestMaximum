public class FindMaximun {
    public static void main(String args[])
    {
        System.out.printf("Welcome To Test Maximum Problem");
    }
    public static <E extends Comparable>E checkMaximun(E firstValue,E secondValue,E thirdvalue)
    {
        E maximumValue=firstValue;
        if(secondValue.compareTo(maximumValue)>0)
            maximumValue=secondValue;
        if (thirdvalue.compareTo(maximumValue)>0)
            maximumValue=thirdvalue;
        return maximumValue;
    }
}
