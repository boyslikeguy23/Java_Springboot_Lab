package vietnam;

import product.Product;

public class VietNamImportPrice extends Product {
    private float taxImported; //Thue nhap khau

    public VietNamImportPrice() {
        super();
    }

    public VietNamImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    @Override
    public void input(){

    }
    @Override
    public void display(){}

    @Override
    public float calculateSalePrice() {
        float importedPrice = super.calculateSalePrice();
        return importedPrice + (importedPrice * this.taxImported) + (importedPrice * 0.10f);  // Sale price = Imported price + Tax + 10% profit margin
    }

}
