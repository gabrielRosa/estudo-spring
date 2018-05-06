package com.gabriel.spring.api.domain;

import com.gabriel.spring.api.domain.enums.PaymentStatus;

import javax.persistence.Entity;

@Entity
public class PaymentWithCard extends Payment {

    private static final long serialVersionUID = -3202980973613606625L;

    private Integer installments;

    public PaymentWithCard() { }

    public PaymentWithCard(Integer id, PaymentStatus paymentStatus, CustomerOrder customerOrder, Integer installments) {
        super(id, paymentStatus, customerOrder);
        this.installments = installments;
    }

    public Integer getInstallments() {
        return installments;
    }

    public void setInstallments(Integer installments) {
        this.installments = installments;
    }
}
