package workshop;

public class App1 {

    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("Invalid arguments")
        }

        String directory = args[0];
        String fileName = args[1];
        String filePath = directory + File.separator + fileName;


        List<Product> products = new ArrayList<>();

        products.add(new Product("Mouse", "For click UI on screen", "Computer", 99.0));
        products.add(new Product("Keyboard", "Device that allows alpha numerics inputs", "Computer", 235.5));
        products.add(new Product("15.6 inch monitor", "Extended display panel", "Computer", 157.5));
        products.add(new Product("Huawei Pura 70", "Huawei phone", "Mobile", 900.0));
        products.add(new Product("Huawei Mate 50 Pro", "Huawei phone", "Mobile", 1200.0));
        products.add(new Product("iPhone 16 Pro", "Apple phone", "Mobile", 2000.0));
        products.add(new Product("iPhone 14 Pro", "Apple phone", "Mobile", 1200.0));

        products.forEach(System.out::println);

    List <Product> filteredproducts = products.stream()
    .filter(product -> product.getCategory().equals("Mobile") && product.getPrice() > 1500)
    .collect(Collectors.toList());

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)) {
        for (Product filteredproduct:filteredproducts){
            writer.write(filteredproduct.toString());
            writer.newLine();
            
        }
        System.out.println(filteredproduct);

    } catch (IOException e) {
        System.err.println("Error writing to filePath..." + e.getMessage());
    }

    
}
