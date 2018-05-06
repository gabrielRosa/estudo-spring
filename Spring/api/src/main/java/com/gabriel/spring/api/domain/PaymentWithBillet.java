package com.gabriel.spring.api.domain;

import com.gabriel.spring.api.domain.enums.PaymentStatus;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PaymentWithBillet extends Payment {

    private static final long serialVersionUID = -5141031621275290428L;

    private Date dueDate;
    private Date payday;

    public PaymentWithBillet() { }

    public PaymentWithBillet(Integer id, PaymentStatus paymentStatus, CustomerOrder customerOrder, Date dueDate, Date payday) {
        super(id, paymentStatus, customerOrder);
        this.dueDate = dueDate;
        this.payday = payday;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getPayday() {
        return payday;
    }

    public void setPayday(Date payday) {
        this.payday = payday;
    }
}
