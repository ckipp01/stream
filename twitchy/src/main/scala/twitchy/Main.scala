package twitchy

import com.github.philippheuer.credentialmanager.domain.OAuth2Credential
import com.github.twitch4j.TwitchClient
import com.github.twitch4j.TwitchClientBuilder
import com.github.twitch4j.chat.events.channel.ChannelMessageEvent
import mainargs.ParserForClass

object Main {
  def main(args: Array[String]): Unit = {
    val config = ParserForClass[Config]
      .constructOrExit(args.toSeq)
      .withEnv()

    config.oathToken match {
      case Some(token) =>
        val client: TwitchClient = TwitchClientBuilder
          .builder()
          .withEnableChat(true)
          .withChatAccount(
            new OAuth2Credential("twitch", token)
          )
          .build()

        val chat = client.getChat()

        client
          .getEventManager()
          .onEvent(classOf[ChannelMessageEvent], MessageConsumer.consumer(chat))

      case None =>
        scribe.error("Unable to fine an oath token, exiting.")
        sys.exit(1)
    }
  }
}
