# hivemine
[![Build Status](https://travis-ci.com/matthewfcarlson/hivemine.svg?branch=master)](https://travis-ci.com/matthewfcarlson/hivemine/)
[![Release](https://img.shields.io/github/release/matthewfcarlson/hivemine.svg)](https://github.com/matthewfcarlson/hivemine/releases/)
[![License](https://img.shields.io/badge/license-LGPL--3.0%20with%20anime%20exception-green.svg)](LICENSE)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/a73d037823b64a5faf597a18d71e3400)](https://www.codacy.com/app/leijurv/hivemine?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=matthewfcarlson/hivemine&amp;utm_campaign=Badge_Grade)
[![HitCount](http://hits.dwyl.com/matthewfcarlson/hivemine.svg)](http://hits.dwyl.com/matthewfcarlson/hivemine/)
[![GitHub All Releases](https://img.shields.io/github/downloads/matthewfcarlson/hivemine/total.svg)](https://github.com/matthewfcarlson/hivemine/releases/)
[![Minecraft](https://img.shields.io/badge/MC-1.12.2-brightgreen.svg)](https://github.com/matthewfcarlson/hivemine/tree/master/)
[![Minecraft](https://img.shields.io/badge/MC-1.13.2-brightgreen.svg)](https://github.com/matthewfcarlson/hivemine/tree/1.13.2/)
[![Minecraft](https://img.shields.io/badge/MC-1.14.4-brightgreen.svg)](https://github.com/matthewfcarlson/hivemine/tree/1.14.4/)
[![Minecraft](https://img.shields.io/badge/MC-1.15.2-brightgreen.svg)](https://github.com/matthewfcarlson/hivemine/tree/1.15.2/)
[![Code of Conduct](https://img.shields.io/badge/%E2%9D%A4-code%20of%20conduct-blue.svg?style=flat)](https://github.com/matthewfcarlson/hivemine/blob/master/CODE_OF_CONDUCT.md)
[![Known Vulnerabilities](https://snyk.io/test/github/matthewfcarlson/hivemine/badge.svg?targetFile=build.gradle)](https://snyk.io/test/github/matthewfcarlson/hivemine?targetFile=build.gradle)
[![Contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/matthewfcarlson/hivemine/issues/)
[![Issues](https://img.shields.io/github/issues/matthewfcarlson/hivemine.svg)](https://github.com/matthewfcarlson/hivemine/issues/)
[![GitHub issues-closed](https://img.shields.io/github/issues-closed/matthewfcarlson/hivemine.svg)](https://github.com/matthewfcarlson/hivemine/issues?q=is%3Aissue+is%3Aclosed)
[![Pull Requests](https://img.shields.io/github/issues-pr/matthewfcarlson/hivemine.svg)](https://github.com/matthewfcarlson/hivemine/pulls/)
![Code size](https://img.shields.io/github/languages/code-size/matthewfcarlson/hivemine.svg)
![GitHub repo size](https://img.shields.io/github/repo-size/matthewfcarlson/hivemine.svg)
![Lines of Code](https://tokei.rs/b1/github/matthewfcarlson/hivemine?category=code)
[![GitHub contributors](https://img.shields.io/github/contributors/matthewfcarlson/hivemine.svg)](https://github.com/matthewfcarlson/hivemine/graphs/contributors/)
[![GitHub commits](https://img.shields.io/github/last-commit/matthewfcarlson/hivemine.svg)](https://github.com/matthewfcarlson/hivemine/commit/)

A Minecraft bot collective. The idea is that they can support as many bots as you spin up, each communicating what's needed.
This is uses the amazing [Bartione](https://github.com/cabaletta/baritone), a fantastic project focused on solving some really thorny problems.

## How does it work?

Basically, it modifies the client to communicate with other bots and additionally don't capture the user mouse.
It also tries to trim down on the memory and cpu usage of the client so you can run multiple easily.
The goal would be to run the client headless and have the ability to drop into a given client? We'll see what happens there.

## Why a mod for the client?

I spent many hours trying to get protocol implementations like the fantastic [node-minecraft-protocol](https://github.com/PrismarineJS/node-minecraft-protocol) to work with 1.15.2 and with mods.
Every time a friend installed a new mod, I needed to do more tweak the protocol to handle more edge cases.
I came to the conclusion that I need to support the client. 

# Getting Started

Here are some links to help to get started:

- [Features](FEATURES.md)

- [Installation & setup](SETUP.md)

- [Usage (chat control)](USAGE.md)

## Stars over time

[![Stargazers over time](https://starchart.cc/matthewfcarlson/hivemine.svg)](https://starchart.cc/matthewfcarlson/hivemine)

# API

TODO

# FAQ

## How is it so fast?

Magic. (Hours of [leijurv](https://github.com/leijurv/) enduring excruciating pain)

## Why is it called hivemine?

Because the idea is that it is a hive mine- meant for mining.
