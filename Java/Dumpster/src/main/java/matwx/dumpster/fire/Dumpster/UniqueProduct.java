import java.util.HashSet;
import java.util.Set;

public class UniqueProduct {

    public static String firstUniqueProduct(String[] products) {

        Set<String> lsOfProduct = new HashSet<>();

        Set<String> lsOfDuplicates = new HashSet<>();

//      Iterate thru the products and identify duplicate   
        for (String product : products) {

            if (!lsOfProduct.add(product)) {
                lsOfDuplicates.add(product);
            }
        }

//      Iterate thru duplicates and remove from product   
        for(String duplicate : lsOfDuplicates){
            lsOfProduct.remove(duplicate);
        }

//      Return the first product after cleanse.
        return lsOfProduct.toArray()[0].toString();
    }


    public static void main(String[] args) {
        System.out.println(firstUniqueProduct(new String[] { "Apple", "Computer", "Apple", "Bag"  }));
    }
}
