package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Secret {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String secretBody;
    private String secretHead;

    protected Secret() {}

    public Secret(String secretBody, String secretHead) {
        this.secretBody = secretBody;
        this.secretHead = secretHead;
    }

    public Long getId() {
        return id;
    }

    public String getSecretBody() {
        return secretBody;
    }

    public String getSecretHead() {
        return secretHead;
    }

    @Override
    public String toString() {
        return "Head:".concat(secretHead).concat("\nBody:").concat(secretBody);
    }
}
