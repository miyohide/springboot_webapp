package com.github.miyohide.webapp;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LoginUser extends org.springframework.security.core.userdetails.User {
    private User user;

    public LoginUser(User user) {
        super(user.getEmail(), user.getPassword(), userRolesSet(user.getRoles()));
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    /**
     * カンマ区切りのロールをコレクションに変換する
     * @param roles カンマ区切りのロール
     * @return コレクション化されたロール
     */
    private static Set<GrantedAuthority> userRolesSet(String roles) {
        if (roles == null || roles.isEmpty()) {
            return Collections.emptySet();
        }
        Set<GrantedAuthority> authorities = Stream.of(roles.split(","))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toSet());
        return authorities;
    }
}
