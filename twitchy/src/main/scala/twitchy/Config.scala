package twitchy

import mainargs.Flag
import mainargs.arg
import mainargs.main

@main
case class Config(
    @arg(
      short = 't',
      doc = "Twitch OAuth token. If not provided here we'll search env"
    )
    oathToken: Option[String],
    @arg(
      name = "with-questions-enabled",
      doc = "Start the app with the ability to grab questions"
    )
    withQuestionsEnabled: Flag
) {
  def withEnv() = {
    copy(oathToken = oathToken.orElse(Option(sys.env("TWITCH_OATH_TOKEN"))))
  }
}
