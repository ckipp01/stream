# OBS Setup

I spend a stupid amount of time getting my audio to work as expected when first
setting OBS up on my mac. In order for me to remember the steps and possible
help anyone else out there, here is the main process I followed.


## Audio

Just to note the audio equipment that I'm using is the following:

### Hardware
  - [RØDE NT1-A 1](http://www.rode.com/microphones/nt1-a)
  - [Focusrite Scarlett Solo](https://focusrite.com/en/usb-audio-interface/scarlett/scarlett-solo)

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

Then, finally in OBS, when I would add my Desktop Audio, it would work as
expected. For further instructions about setting up OBS, look to YouTube. There
are thousands of videos that explain it better than I could here.

## Video

### Hardware
  - [logitech C920](https://www.logitech.com/en-us/products/webcams/c920-pro-hd-webcam.960-000764.html)
  - [ELEGIANT Ring Light](https://www.amazon.nl/-/en/gp/product/B086QMRTXD)
      - This is basically one of the cheapest ones I could find. I wanted to see
          if this would really help before going crazy and buying an expensive
          Elgato light or something. This made a huge difference.
