package com.gabriel.spring.api.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.gabriel.spring.api.domain.enums.CustomerType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
public class Customer implements Serializable {

    private static final long serialVersionUID = 8319407820349682139L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String cpfOrCnpj;
    private Integer customerType;

    @OneToMany(mappedBy = "customer")
    @JsonManagedReference
    private List<Address> addresses = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "phones")
    private Set<String> phones = new HashSet<>();

    @OneToMany(mappedBy = "customer")
    private List<CustomerOrder> customerOrders = new ArrayList<>();

    public Customer() { }

    public Customer(Integer id, String name, String email, String cpfOrCnpj, CustomerType customerType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpfOrCnpj = cpfOrCnpj;
        this.customerType = customerType.getId();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpfOrCnpj() {
        return cpfOrCnpj;
    }

    public void setCpfOrCnpj(String cpfOrCnpj) {
        this.cpfOrCnpj = cpfOrCnpj;
    }

    public CustomerType getCustomerType() {
        return CustomerType.toEnum(customerType);
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType.getId();
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<String> getPhones() {
        return phones;
    }

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }

    public List<CustomerOrder> getCustomerOrders() {
        return customerOrders;
    }

    public void setCustomerOrders(List<CustomerOrder> customerOrders) {
        this.customerOrders = customerOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getId(), customer.getId());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }
}
