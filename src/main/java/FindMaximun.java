public class FindMaximun<E extends Comparable> {
    public static void main(String args[])
    {
        System.out.printf("Welcome To Test Maximum Problem");
    }
    E firstValue;
    E secondValue;
    E thirdvalue;
    // parameter constructor
    public FindMaximun(E firstValue,E secondValue,E thirdvalue) {
        this.firstValue=firstValue;
        this.secondValue=secondValue;
        this.thirdvalue=thirdvalue;
    }
    //function for check max
    public static <E extends Comparable> E checkMaximun(E firstValue,E secondValue,E thirdvalue)
    {
        E maximumValue=firstValue;
        if(secondValue.compareTo(maximumValue)>0)
            maximumValue=secondValue;
        if (thirdvalue.compareTo(maximumValue)>0)
            maximumValue=thirdvalue;
        return maximumValue;
    }
    public E checkMaximun(){
        return checkMaximun(firstValue,secondValue,thirdvalue);
    }
}
