package com.bloomtech.welcomeletter.models;

public class Company {
    private static int maxId = 1;
    private final int id;

    private final String companyName;
    private final String country;

    public static Builder builder() {
        return new Builder();
    }

    private Company(Builder builder) {
        //Auto-generate an id
        id = maxId;
        maxId++;

        //Initialize fields
        this.companyName = builder.companyName;
        this.country = builder.country;
    }

    public static final class Builder {
        private String companyName;
        private String country;

        private Builder() {
        }

        public Company build() {
            return new Company(this);
        }

        public Builder withCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder withCountry(String country) {
            this.country = country;
            return this;
        }

    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCountry() {
        return country;
    }
}
