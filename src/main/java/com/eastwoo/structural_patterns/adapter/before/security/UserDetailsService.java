package com.eastwoo.structural_patterns.adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
