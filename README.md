# Slackbot test

Quick test of sending messages to Slack from Kotlin code.

Some things you need to do to run this:

- create an app: https://api.slack.com/apps
- create a bot with a token: https://slack.com/intl/en-gb/help/articles/115005265703-Create-a-bot-for-your-workspace
- give it a scope e.g. `chat:write` https://api.slack.com/scopes/chat:write
- use the token to access e.g. `slack.method(token).chatPostMessage()` api

Kotlin DSL: https://slack.dev/java-slack-sdk/guides/composing-messages
