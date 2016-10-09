package com.endava;

import com.endava.model.AuthorizedUser;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class Index extends WebPage {

    private AuthorizedUser user = new AuthorizedUser();

    public Index(final PageParameters parameters) {

        add(new FeedbackPanel("Index"));

        final TextField<String> name = new TextField<String>("name");
        final PasswordTextField password = new PasswordTextField("password");

        Form<AuthorizedUser> form = new Form<AuthorizedUser>("loginForm",
                new CompoundPropertyModel<AuthorizedUser>(user)) {

            @Override
            protected void onSubmit() {

                PageParameters pageParameters = new PageParameters();
                pageParameters.add("name", user.getName());
                pageParameters.add("password", password.getModelObject());
                if (user.checkUser()) {
                    System.out.println("This user exists " + user.checkUser());
                    setResponsePage(Welcome.class);
                }
                else {
                    setResponsePage(ErrorPage.class);
                }
            }
        };
        add(form);
        form.add(name);
        form.add(password);
    }

}
