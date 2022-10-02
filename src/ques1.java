import java.util.*;

public class ques1 {

    public static void main(String[] args)
    {
        List<Float> list = new ArrayList<Float>();
        list.add(6.2f);
        list.add(7.5f);
        list.add(8.7f);
        list.add(9.4f);
        list.add(10.23f);

        float sum = listSum(list);
        System.out.println("Sum of numbers in list is : " + sum);

    }

    public static float listSum(List<Float> list)
    {
        float sum = 0;

        Iterator<Float> iter = list.iterator();
        while(iter.hasNext())
        {
            sum += iter.next();
        }
        return sum;
    }

}
