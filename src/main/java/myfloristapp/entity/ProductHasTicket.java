package myfloristapp.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCT_has_TICKET")
public class ProductHasTicket {

    @EmbeddedId
    private ProductHasTicketId id;

    @ManyToOne
    @MapsId("product")
    @JoinColumn(name = "idPRODUCT", nullable = false)
    private Product product;

    @ManyToOne
    @MapsId("ticket")
    @JoinColumn(name = "idTICKET", nullable = false)
    private Ticket ticket;

    private int quantity;

    public ProductHasTicketId getId() {
        return id;
    }

    public void setId(ProductHasTicketId id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
