import java.util.*;
import java.util.stream.Stream;

public class ConversionToStreams
{
    public static void main(String args[])
    {
        //Converting collections to stream
        List<Integer> list = List.of(1,2,3,4,5,6,7);
        Stream<Integer> intStream = list.stream();

        //Converting collections to parallel stream
        Stream<Integer> intParallelStream = list.parallelStream();

        //Converting arrays to stream
        int[] arr= new int[]{1,2,3,4,5,6,7};
        IntStream  intArrStream = Arrays.stream(arr);

        //Converting arrays of object to stream
        String[] objArr = new String[]{"R","O","H","A","N"};
        Stream<String> objStream = Arrays.stream(objArr);


    }
}