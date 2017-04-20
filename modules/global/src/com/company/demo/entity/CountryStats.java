package com.company.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|country")
@Table(name = "DEMO_COUNTRY_STATS")
@Entity(name = "demo$CountryStats")
public class CountryStats extends StandardEntity {
    private static final long serialVersionUID = 7704669567951157002L;

    @Column(name = "COUNTRY", nullable = false)
    protected String country;

    @Column(name = "VALUE_", nullable = false)
    protected Double value;

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }


}