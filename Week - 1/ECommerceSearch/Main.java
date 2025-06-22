public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "T-Shirt", "Clothing"),
            new Product(104, "Camera", "Electronics")
        };

        Product result1 = SearchUtils.linearSearch(products, "Shoes");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        Product result2 = SearchUtils.binarySearch(products, "Shoes");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
