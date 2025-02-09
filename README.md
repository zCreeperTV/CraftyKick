![craftykick](https://github.com/user-attachments/assets/da57ab7d-6dca-4144-b642-739754822914)


CraftyKick is a BungeeCord plugin that allows players to kick other players from the proxy. Players can provide a custom reason and use color codes to personalize the kick message.

## Features

- **Kick players**: Allows players to kick others from the proxy.
- **Custom reason**: Provide a custom reason for kicking the player.
- **Colorful messages**: Use color codes to style and highlight the kick messages.
- **Easy to use**: Kick players with simple commands.

## Installation

1. Download the latest version of **CraftyKick** from the [Release Page](#).
2. Copy the `.jar` file into the `plugins/` directory of your BungeeCord server.
3. Restart your BungeeCord server.

## Configuration

It doesnt give a configuration file, because the plugin doesnt offer a prefix system.

## Usage

To kick a player, use the following command:

```
/kick <Player> <Reason>
```

### Example:

```
/kick Steve Cheating
```

This will kick the player "Steve" with the reason "Cheating". You can also use color codes:

```
/kick Steve &4Hacking detected!
```

This will kick the player "Steve" with a red message: "Hacking detected!"

## Permissions

- **craftykick.use**: Allows a player to use the `/kick` command.
- **craftykick.bypass**: Allows a player to bypass the kick restriction.

## Troubleshooting

- **Plugin doesn’t work after startup**: Make sure you are using the latest version of BungeeCord and all dependencies are installed correctly.
- **Color codes are not working**: Ensure you are using the correct format for color codes (e.g., `&a` for green).

## License

CraftyKick is licensed under the [MIT License](LICENSE).

## Support

If you encounter any issues or have questions, feel free to join our Discord server: [Discord Link](https://dsc.gg/zcreeper).
