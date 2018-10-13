package com.lenistech.lp.service.template_service.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lp_template")
public class Example {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Example that = (Example) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        return result;
    }

    public Example() {

    }
    public Example(final String name) {
        this.name = name;
    }
}
