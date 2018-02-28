package com.company.workshop.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s %s|name,phoneNumber")
@Table(name = "WORKSHOP_CLIENT")
@Entity(name = "workshop$Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = 1593185547689516499L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "PHONE_NUMBER", nullable = false, length = 50)
    protected String phoneNumber;

    @Column(name = "EMAIL", nullable = false, unique = true, length = 20)
    protected String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")
    protected Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_INPUT_OBJECT_ID")
    protected OrderInputObject orderInputObject;

    public void setOrderInputObject(OrderInputObject orderInputObject) {
        this.orderInputObject = orderInputObject;
    }

    public OrderInputObject getOrderInputObject() {
        return orderInputObject;
    }


    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


}