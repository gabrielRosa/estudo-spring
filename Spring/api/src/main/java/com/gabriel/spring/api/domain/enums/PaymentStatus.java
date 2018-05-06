package com.gabriel.spring.api.domain.enums;

public enum PaymentStatus {

    PENDING(0, "PENDING"),
    SETTLED(1, "SETTLED"),
    CANCELED(2, "CANCELED");

    private Integer id;
    private String name;

    private PaymentStatus(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static PaymentStatus toEnum(Integer id) {
        if (id == null) {
            return null;
        }

        for (PaymentStatus ps : PaymentStatus.values()) {
            if (id.equals(ps.getId())) {
                return ps;
            }
        }

        throw new IllegalArgumentException("Id is invalid: " + id);
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
}
