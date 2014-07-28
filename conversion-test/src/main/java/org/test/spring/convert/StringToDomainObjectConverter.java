package org.test.spring.convert;

import org.springframework.core.convert.converter.Converter;

@SuppressWarnings("javadoc")
public class StringToDomainObjectConverter implements Converter<String, DomainObject> {

    @Override
    public DomainObject convert(final String source) {
        return new DomainObject(source + "-converted");
    }
}