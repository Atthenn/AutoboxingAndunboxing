import java.util.ArrayList;


class IntClass{

    private int value;

    public IntClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class Main {

    public static void main(String[] args){
        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strings = new ArrayList<String>();
        //ArrayList<IntClass> ints = new ArrayList<IntClass>();
       // ints.add(new IntClass(10));
        ArrayList<Integer> integers = new ArrayList<Integer>();

        for (int i = 0; i <10 ; i++) {
            integers.add(Integer.valueOf(i));
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println(i+" ---> "+integers.get(i).intValue());
        }

        ArrayList<Double> doubles = new ArrayList<Double>();
        for (double dbl = 0.0; dbl < 10.0 ; dbl+=0.5) {
              //  doubles.add(Double.valueOf(dbl));
                  doubles.add((dbl));

        }

        for (int i = 0; i <doubles.size() ; i++) {
         //  double value = doubles.get(i).doubleValue();
            double value = doubles.get(i);

            System.out.println(i +" ----> "+ value);
        }

        Integer integer = new Integer(54);
        Integer integer1 = 5;
        int intValue = integer.intValue();
        Double double1 = new Double(23.3);
        Double double2 = 2.3;

    }
}

