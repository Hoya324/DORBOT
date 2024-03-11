package com.discorddev.dorbot.api.user.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discorddev.dorbot.api.user.model.dto.request.UserSearchDTO;
import com.discorddev.dorbot.api.user.model.dto.response.UserListResponseDTO;
import com.discorddev.dorbot.api.user.service.UserService;
import com.discorddev.dorbot.global.common.exception.DefaultResponse;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/user")
@RestController
public class UserController {

	private final UserService userService;

	@Operation(summary = "모든 회원 정보 조회", description = "모든 회원 정보 조회를 위한 API Method")
	@GetMapping
	public DefaultResponse<List<UserListResponseDTO>> usersSearch(UserSearchDTO userSearchDTO) {
		return userService.usersSearch(userSearchDTO);
	}
}
