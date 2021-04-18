# OBS Setup

## Audio

I spend a stupid amount of time getting my audio to work as expected when first
setting OBS up on my mac. In order for me to remember the steps and possible
help anyone else out there, here is the main process I followed.

### Software
  - [ExisentialAudio/BlackHole](https://github.com/ExistentialAudio/BlackHole)

### Setup
When first setting up it may not be clear what BlackHole is for. Blackhole
allows you to create a Multi-Output Device which allows for OBS to hear your
desktop sounds and also for you to hear them at the same time. You care this
Multi-Output Device in your _Audio MIDI Setup_, and then when you are about to
stream, you switch from your normal output that you're using to your
Multi-Output Device. One thing that threw me for a loop was that I had issues
hearing the desktop sound in my video even though I could hear it in headphones
just fine. That was due to the output volume of BlackHole being quite low. The
way to adjust this is again in your Audio MIDI Setup. Whichever you have set as
your Master Device for the Multi-Output Device controls that volume. So in my
case, I needed to click the BlackHole 2ch and bump the volume up there.

This should look something like this when you view it in your _Audio MIDI
Setup_.
![blackhole-2-channel-setup](https://i.imgur.com/nnVSxDO.png)

Then, finally in OBS, when I would add my Desktop Audio, it would work as
expected. For further instructions about setting up OBS, look to YouTube. There
are thousands of videos that explain it better than I could here.

## Layout

In order to actually get everything to both be displayed to the user and for me
to easily see, I use a couple different things. First of all, I use
[StreamElements](https://streamelements.com) for my alerts. These are pretty
simple, and there are a ton of tutorials out there for this. I recommend using a
service like this both for you alerts and for `!commands`. There are a variety
of them and I also see a lot of people use multiple different ones, but for now
just sticking with one for me seems to be fine.

When I'm getting started my OBS layout looks like this:

![Main OBS layout](https://i.imgur.com/jE4AQz1.png)

It's pretty simple. The biggest part is my terminal, and then in the top right
you see a solid colored panel that is actually just part of the overlay I have
in StremElements. I use that panel to simply overlay the stream chat on top of
the solid color panel to make it fit the color scheme of my terminal. On the
bottom right is where my image will go.

My actual screen then looks like this:

![Main Screen Layout](https://i.imgur.com/WlSlfaR.png)

Notice that the top right I have the Twitch chat popout. The users won't see
this as the overlay I have hides this, but it allows me to see the chat without
having to look at my other screen. The same with the bottom right, I can see the
follow/sub/cheer activity via the Twitch popout, but this is hidden to the viewer by camera.

Apart from this I just have a simple getting started and BRB screen. This
minimal setup seems to work pretty well for me so far.
