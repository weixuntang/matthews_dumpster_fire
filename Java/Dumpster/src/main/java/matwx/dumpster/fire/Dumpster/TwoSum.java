import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static int[] findTwoSum(int[] list, int sum) {

        Set<String> setOfIndices = new HashSet<>();

        int compareValue = list[0], counter = 0;

        for (int count = 0; count <= list.length - 1; count++) {

            for (int num : list) {
               if(compareValue + num == sum){
                   setOfIndices.add(compareValue +":" + num);
               }
            }

            compareValue = list[counter++];
        }

        int randNumByIndicesSize = new Random().nextInt(setOfIndices.size());

        String[] matchingIndicesByRand = setOfIndices.toArray()[randNumByIndicesSize].toString().split(":");

        int[] returnArray = new int[2];
        returnArray[0] = Integer.valueOf(matchingIndicesByRand[0]);
        returnArray[1] = Integer.valueOf(matchingIndicesByRand[1]);

        return returnArray;
    }


    public static void main(String[] args) {

        int[] indices = findTwoSum(new int[]{3, 1, 5, 7, 5, 9}, 10);


        if (null != indices) {
            System.out.println(indices[0] + " " + indices[1]);
        }

    }
}