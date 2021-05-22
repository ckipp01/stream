package twitchy

import com.github.twitch4j.chat.TwitchChat
import com.github.twitch4j.chat.events.channel.ChannelMessageEvent
import scribe.Logger
import scribe.file.FileWriter
import scribe.file.PathBuilder
import scribe.file.path.PathPart

import java.io.File
import java.util.function.Consumer

object MessageConsumer {
  val chatPath = new File("logs", "chat.log").getAbsolutePath()
  val chatPathBuilder = PathBuilder(List(PathPart.SetPath(chatPath)))
  val questionPath = new File("logs", "questions.log").getAbsolutePath()
  val questionPathBuilder = PathBuilder(List(PathPart.SetPath(questionPath)))

  lazy val chatLogger = Logger("chat-logger")
    .withHandler(writer = FileWriter(pathBuilder = chatPathBuilder))
    .replace()

  lazy val questionLogger = Logger("question-logger")
    .withHandler(writer = FileWriter(pathBuilder = questionPathBuilder))
    .replace()

  def consumer(chat: TwitchChat) = new Consumer[ChannelMessageEvent] {
    override def accept(e: ChannelMessageEvent): Unit = {
      val message = Option(e.getMessage())
      val user = e.getUser().getName()
      message match {
        case Some(m) if m.startsWith("!q") =>
          chat.sendMessage(
            "ckipp",
            s"🤖 - Captured your question! Thanks, $user!"
          )
          questionLogger.info(s"[$user] - $m")
        case Some(m) => chatLogger.info(s"[$user] - $m")
        case None =>
          scribe.warn(
            s"Recieved a message... without a message from $user}"
          )
      }
    }
  }
}
