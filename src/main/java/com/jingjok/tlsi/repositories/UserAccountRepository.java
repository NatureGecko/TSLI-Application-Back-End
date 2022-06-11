package com.jingjok.tlsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jingjok.tlsi.models.UserAccountModel;

public interface UserAccountRepository extends JpaRepository<UserAccountModel, String> {

}
