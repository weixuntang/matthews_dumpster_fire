import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniquePro {
    
    public static String firstUniqueProduct(String[] products) {

        Set<String> lsOfProduct = new HashSet<>();

        List<String> lsOfDuplicates = new ArrayList<>();

        for (String product : products) {

            if(!lsOfProduct.add(product)){
                lsOfDuplicates.add(product);
            }
        }

        for(String duplicate : lsOfDuplicates){
            lsOfProduct.remove(duplicate);
        }


        return lsOfProduct.toArray()[0].toString();
    }


    public static void main(String[] args) {
        System.out.println(firstUniqueProduct(new String[] { "Apple", "Computer", "Apple", "Bag"  }));
    }
}