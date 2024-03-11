package com.discorddev.dorbot.api.user.repository.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.dv8tion.jda.api.entities.User;

import com.discorddev.dorbot.api.user.model.dto.request.UserSearchDTO;


public interface UserRepository extends JpaRepository<User, Long> {

	// List<UserDAO> findByUserList(UserSearchDTO userSearchDTO);
}
