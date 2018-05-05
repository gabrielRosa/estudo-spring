package com.gabriel.spring.api.domain.enums;

public enum CustomerType {

    PERSON (0, "Person"),
    CORPORATION(1, "Corporation");

    private Integer id;
    private String name;

    private CustomerType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static CustomerType toEnum(Integer id) {
        if (id == null) {
            return null;
        }

        for (CustomerType ct : CustomerType.values()) {
            if (id.equals(ct.getId())) {
                return ct;
            }
        }

        throw new IllegalArgumentException("Id is invalid: " + id);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
