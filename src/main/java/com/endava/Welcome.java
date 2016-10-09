package com.endava;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class Welcome extends WebPage {

    public Welcome(final PageParameters parameters) {
        super(parameters);
        add(new Label("Welcome"));
    }
}
