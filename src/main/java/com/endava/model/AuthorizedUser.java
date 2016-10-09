package com.endava.model;

import com.endava.datasource.AllUsers;

public class AuthorizedUser {

    private String name;
    private String password;

    public AuthorizedUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public AuthorizedUser(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthorizedUser that = (AuthorizedUser) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return !(password != null ? !password.equals(that.password) : that.password != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    public boolean checkUser() {
        for(AuthorizedUser u: AllUsers.getListOfUsers()) {
            if (this.equals(u)) return true;
        }
        return false;
    }
}
