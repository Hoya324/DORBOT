package com.discorddev.dorbot.util;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DorbotDiscordListener extends ListenerAdapter {

	@Override
	public void onMessageReceived(MessageReceivedEvent event) {

		User user = event.getAuthor();
		TextChannel textChannel = event.getChannel().asTextChannel();
		Message message = event.getMessage();

		log.info("get message : " + message.getContentDisplay());

		if (user.isBot()) {
			return;
		}

		log.info("디스코드 문자열 message 문자열 값 공백");
	}
}
