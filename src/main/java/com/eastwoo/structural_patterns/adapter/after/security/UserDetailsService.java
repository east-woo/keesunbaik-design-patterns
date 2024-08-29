package com.eastwoo.structural_patterns.adapter.after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
