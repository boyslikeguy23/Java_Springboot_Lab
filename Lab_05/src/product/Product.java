package product;

public class Product {
    private String prodId;
    private String prodName;
    private String manufacturer;
    private float producerPrice;

    /**
     * Hàm tạo không đối
     */
    public Product() {
    }

    /**
     *
     * @param prodId Id của sản phẩm
     * @param prodName Tên sản phẩm
     * @param manufacturer Nhà sản xuất
     * @param producerPrice Giá sản phẩm
     */
    public Product(String prodId, String prodName, String manufacturer, float producerPrice)
    {
        this.prodId = prodId;
        this.prodName = prodName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(float producerPrice) {
        this.producerPrice = producerPrice;
    }

    public void input()
    {

    }

    public void display(){

    }

    public float calculateSalePrice(){
        float sale_price = producerPrice + 0.05f*producerPrice;
        return sale_price;
    }
}
