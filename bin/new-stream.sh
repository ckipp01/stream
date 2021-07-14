#!/usr/bin/env sh

DATE=$(date +'%m-%d-%Y')
PATH=notes/stream-notes/$DATE.md

/bin/cat > $PATH <<EOL
# $DATE

## The plan for the day

## Notes and links from the stream

## What we actually worked on

## Thoughts on how the stream went
EOL

echo "Enjoy your stream"
