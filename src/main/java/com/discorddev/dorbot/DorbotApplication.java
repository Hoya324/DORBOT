package com.discorddev.dorbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import com.discorddev.dorbot.util.DiscordBotToken;
import com.discorddev.dorbot.util.DorbotDiscordListener;

@SpringBootApplication
public class DorbotApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(DorbotApplication.class, args);
		DiscordBotToken discordBotTokenEntity = context.getBean(DiscordBotToken.class);
		String discordBotToken = discordBotTokenEntity.getDiscordBotToken();

		JDA jpa = JDABuilder.createDefault(discordBotToken)
			.setActivity(Activity.playing("🐮COW 봇 대기중! 🐮"))
			.enableIntents(GatewayIntent.MESSAGE_CONTENT)
			.addEventListeners(new DorbotDiscordListener())
			.build();
	}

}
