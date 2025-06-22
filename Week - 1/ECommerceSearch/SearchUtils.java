import java.util.Arrays;
import java.util.Comparator;

public class SearchUtils {

    public static Product linearSearch(Product[] products, String name) {

        for (Product p : products) {

            if (p.productName.equalsIgnoreCase(name)) {

                return p;

            }

        }

        return null;

    }

    public static Product binarySearch(Product[] products, String name) {

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        int left = 0, right = products.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            int comp = products[mid].productName.compareToIgnoreCase(name);

            if (comp == 0) 
            return products[mid];
            else if (comp < 0) 
            left = mid + 1;
            else 
            right = mid - 1;

        }

        return null;
        
    }
}
