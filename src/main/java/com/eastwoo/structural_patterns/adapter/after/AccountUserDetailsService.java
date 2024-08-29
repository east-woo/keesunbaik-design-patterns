package com.eastwoo.structural_patterns.adapter.after;


import com.eastwoo.structural_patterns.adapter.after.security.UserDetails;
import com.eastwoo.structural_patterns.adapter.after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        return new AccountUserDetails(accountService.findAccountByUsername(username));
    }
}
