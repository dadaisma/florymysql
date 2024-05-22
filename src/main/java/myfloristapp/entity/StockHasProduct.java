package myfloristapp.entity;


import jakarta.persistence.*;



@Entity
@Table(name = "STOCK_has_PRODUCT")
public class StockHasProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSTOCK;

    @ManyToOne
    @JoinColumn(name = "idPRODUCT", nullable = false)
    private Product product;

    private int quantity;

    public int getIdSTOCK() {
        return idSTOCK;
    }

    public void setIdSTOCK(int idSTOCK) {
        this.idSTOCK = idSTOCK;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
// Getters and Setters
}