package workshop;

public class Product {
    private Long id;
    private String prodName;
    private String prodDesc;
    private String prodCat;
    private Float price;
    private Date createdDate;
    
    public Product (Long id, String prodName, String prodDesc, String prodCat, Float price, Date createdDate){
        this.id = id;
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodCat = prodCat;
        this.price = price;
        this.createdDate = createdDate;

    }
    
    public Long getId() {
        return id;
    }

    public String getProdName() {
        return prodName;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public String getProdCat() {
        return prodCat;
    }

    public Float getPrice() {
        return price;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString(){
        return "Product{" + id +"/" + prodName + "/" + prodDesc + "/" + prodCat + "/" + price + "/" + createdDate +"}";
    }
}

    