---
title: Scala in NeoVim
author: Chris Kipp
date: 2021-04-10
---

# Scala in NeoVim

The plan for today

  - Why do you even need a special extension for Metals?
  - What are my options?
  - Demo all the things
  - An opinionated look at plugins

---

# Why do you even need a special extension for Metals?

The LSP spec doesn't cover _everything_. There are a fair amount of things that
will work correctly with NeoVim if you either make it yourself or use a plugin
like coc-metals or nvim-metals.

## LSP Extensions
  - `metals/quickPick`
  - `metals/inputBox`
  - `metals/executeClientCommand`
  - `metals/status`
  - `metals/didFocusTextDocument`
  - `metals/publishDecorations`
  - The entire Tree View Protocol (TVP)

## Integrations with other protocols

  - DAP (Debug Adapter Protocol)

The way that this works with Metals is that the client needs to declare that
it's a DAP provider in order for a lot of the debugging features to work as
expected.

---

# What are my options? (Part 1)


## The coc.nvim ecosystem

This is pretty wildly popular, and imo before the built-in NeoVim LSP came to
town, was just owning the ecosystem. It's known to be solid, provide a ton of
features, and cover a huge range of the spec. _Everything_ is built in, and
there are a _ton_ of plugins.

### Some cons you'll hear
  - Sort of locks you into their ecosystem
  - The hackability is sort of not there
  - The reliance on Node

## Built-in LSP

This will first land in a stable release when 0.5.0 comes out. However, there
are already a ton of plugins created for this, a vibrant ecosystem, and a ton of
hype. Everything is hackable.

### Some cons you'll hear
  - Little harder to set up
  - Still not in a stable release
  - Doesn't yet cover the full spec

## Others
  - `dense-analysis/ale`
  - `autozimu/LanguageClient-neovim`
  - `prabirshrestha/vim-lsp`
  - `natebosch/vim-lsc`

---

# What are my options? (Part 2)

## `scalameta/coc-metals`
### Pros
  - Pretty much complete, and covers everything
  - Has a built in support for the Tree View Protocol
  - You don't really need other plugins to get a polished experience
  - Works with Vim and NeoVim

### Cons
  - DAP support is weak
  - Realistically, since I don't use it anymore, there is sort of a feature
      freeze moving forward on it
  - If there is something you don't love about it, tough luck, it's not that
      hackable

## `scalameta/nvim-metals`
### Pros
  - The integration with `mfussenegger/nvim-dap` is minimal and solid. This
      means the DAP support is pretty great.
  - Everything is hackable. If you don't like something, overwrite it.
  - It's just simple
  - I'm actively working on it

### Cons
  - No built-in TVP support
  - No code lenses yet
      - Jump to super methods
      - Analyze stack trace
  - Not yet in stable

---

# Show Me Everything

---

# An opinionated look at plugins

  - `hrsh7th/nvim-compe`
  - `nvim-telescope/telescope`
  - `glepnir/lspsaga.nvim`
  - `kevinhwang91/nvim-bqf`

---

# All the links
  - https://scalameta.org/metals/
  - https://github.com/scalameta/nvim-metals
  - https://github.com/scalameta/coc-metals
  - https://github.com/hrsh7th/nvim-compe
  - https://github.com/nvim-telescope/telescope.nvim
  - https://github.com/glepnir/lspsaga.nvim
  - https://github.com/kevinhwang91/nvim-bqf
  - https://github.com/mfussenegger/nvim-dap
