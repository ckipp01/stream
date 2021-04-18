#!/usr/bin/env sh

DATE=$(date +'%m-%d-%Y')
PATH=notes/stream-notes/$DATE.md

/bin/cat > $PATH <<EOL
# $DATE

## The plan for the day

## What we actually worked on

## Notes and links from the stream

## Thoughts on how the stream went
EOL

echo "Enjoy your stream"
