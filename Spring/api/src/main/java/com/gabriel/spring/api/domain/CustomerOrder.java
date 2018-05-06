package com.gabriel.spring.api.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class CustomerOrder implements Serializable {

    private static final long serialVersionUID = -6986985062097084458L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date created;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "customerOrder")
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "delivery_address_id")
    private Address address;

    @OneToMany(mappedBy = "id.customerOrder")
    private Set<CustomerOrderItem> customerOrderItems = new HashSet<>();

    public CustomerOrder() { }

    public CustomerOrder(Integer id, Date created, Customer customer, Address address) {
        this.id = id;
        this.created = created;
        this.customer = customer;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<CustomerOrderItem> getCustomerOrderItems() {
        return customerOrderItems;
    }

    public void setCustomerOrderItems(Set<CustomerOrderItem> customerOrderItems) {
        this.customerOrderItems = customerOrderItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerOrder)) return false;
        CustomerOrder customerOrder = (CustomerOrder) o;
        return Objects.equals(getId(), customerOrder.getId());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }
}
