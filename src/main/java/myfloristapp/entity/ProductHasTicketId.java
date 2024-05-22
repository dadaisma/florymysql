package myfloristapp.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProductHasTicketId implements Serializable {
    private int product;
    private int ticket;

    public ProductHasTicketId() {}

    public ProductHasTicketId(int product, int ticket) {
        this.product = product;
        this.ticket = ticket;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductHasTicketId that = (ProductHasTicketId) o;
        return product == that.product && ticket == that.ticket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, ticket);
    }
}
