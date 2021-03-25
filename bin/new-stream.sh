#!/usr/bin/env sh

DATE=$(date +'%m-%d-%Y')
PATH=notes/streams/$DATE.md

/bin/cat > $PATH <<EOL
# $DATE

## The plan for the day

## What we actually worked on

## Notes from the stream

## Thoughts on how the stream went
EOL

echo "Enjoy your stream"
