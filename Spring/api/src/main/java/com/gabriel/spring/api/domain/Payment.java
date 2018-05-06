package com.gabriel.spring.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gabriel.spring.api.domain.enums.PaymentStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Payment implements Serializable {

    private static final long serialVersionUID = -5250131981045374490L;

    @Id
    private Integer id;
    private Integer paymentStatus;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "customer_order_id")
    @MapsId
    private CustomerOrder customerOrder;

    public Payment() { }

    public Payment(Integer id, PaymentStatus paymentStatus, CustomerOrder customerOrder) {
        this.id = id;
        this.paymentStatus = paymentStatus.getId();
        this.customerOrder = customerOrder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PaymentStatus getPaymentStatus() {
        return PaymentStatus.toEnum(paymentStatus);
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus.getId();
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;
        Payment payment = (Payment) o;
        return Objects.equals(getId(), payment.getId());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }
}
