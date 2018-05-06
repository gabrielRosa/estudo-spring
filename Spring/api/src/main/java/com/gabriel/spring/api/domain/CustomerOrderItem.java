package com.gabriel.spring.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class CustomerOrderItem implements Serializable {

    private static final long serialVersionUID = 792831069661305654L;

    @JsonIgnore
    @EmbeddedId
    private CustomerOrderItemPK id = new CustomerOrderItemPK();
    private BigDecimal discount;
    private Integer amount;
    private BigDecimal price;

    public CustomerOrderItem() { }

    public CustomerOrderItem(CustomerOrder customerOrder, Product product, BigDecimal discount, Integer amount, BigDecimal price) {
        getId().setCustomerOrder(customerOrder);
        getId().setProduct(product);
        this.discount = discount;
        this.amount = amount;
        this.price = price;
    }

    @JsonIgnore
    public CustomerOrder getCustomerOrder() { return getId().getCustomerOrder(); }

    public void setCustomerOrder(CustomerOrder customerOrder) { getId().setCustomerOrder(customerOrder); }

    public Product getProduct() { return getId().getProduct(); }

    public void setProduct(Product product) { getId().setProduct(product); }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    private CustomerOrderItemPK getId() {
        return id;
    }

    private void setId(CustomerOrderItemPK id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerOrderItem)) return false;
        CustomerOrderItem customerOrderItem = (CustomerOrderItem) o;
        return Objects.equals(getId(), customerOrderItem.getId());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }
}
