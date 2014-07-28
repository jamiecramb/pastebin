package org.test.spring.convert;

@SuppressWarnings("javadoc")
public class DomainObject {

    private String value;

    public DomainObject(final String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(final String value) {
        this.value = value;
    }
}