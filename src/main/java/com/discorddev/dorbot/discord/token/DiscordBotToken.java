package com.discorddev.dorbot.discord.token;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
public class DiscordBotToken {
	@Value("${discord.bot.token}")
	private String discordBotToken;
}
