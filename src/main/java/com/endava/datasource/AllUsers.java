package com.endava.datasource;

import com.endava.model.AuthorizedUser;

import java.util.ArrayList;
import java.util.List;

public class AllUsers {

    private static List<AuthorizedUser> listOfUsers = new ArrayList<>();

    static {
        listOfUsers.add(new AuthorizedUser("Mila Bezaliuc", "endava"));
        listOfUsers.add(new AuthorizedUser("Petru Covalev", "endava"));
        listOfUsers.add(new AuthorizedUser("Iunona Panasenco", "endava"));
        listOfUsers.add(new AuthorizedUser("Maxim Ustimov", "endava"));
    }

    public static List<AuthorizedUser> getListOfUsers() {
        return listOfUsers;
    }

    public static void setListOfUsers(List<AuthorizedUser> listOfUsers) {
        AllUsers.listOfUsers = listOfUsers;
    }
}
