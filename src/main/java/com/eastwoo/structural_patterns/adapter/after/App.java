package com.eastwoo.structural_patterns.adapter.after;


import com.eastwoo.structural_patterns.adapter.after.security.LoginHandler;
import com.eastwoo.structural_patterns.adapter.after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("keesun", "keesun");
        System.out.println(login);
    }
}
