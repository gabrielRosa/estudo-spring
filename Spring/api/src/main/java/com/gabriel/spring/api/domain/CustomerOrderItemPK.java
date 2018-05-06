package com.gabriel.spring.api.domain;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CustomerOrderItemPK implements Serializable {

    private static final long serialVersionUID = 7308954448107210820L;

    @ManyToOne
    @JoinColumn(name = "customer_order_id")
    private CustomerOrder customerOrder;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerOrderItemPK)) return false;
        CustomerOrderItemPK that = (CustomerOrderItemPK) o;
        return Objects.equals(getCustomerOrder(), that.getCustomerOrder()) &&
                Objects.equals(getProduct(), that.getProduct());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCustomerOrder(), getProduct());
    }
}
