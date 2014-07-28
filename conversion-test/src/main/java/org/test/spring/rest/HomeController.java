package org.test.spring.rest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.test.spring.convert.DomainObject;

@SuppressWarnings("javadoc")
@Controller
public class HomeController {

    @RequestMapping(value = "/{domainObject}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String home(@PathVariable("domainObject") final DomainObject domainObject) {
        return domainObject.getValue();
    }
}
