package de.zcreeper.craftykick;

import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.protocol.packet.Kick;

public class CraftyKick extends Plugin {

    @Override
    public void onEnable() {
        System.out.println("\n" +
                "\n" +
                "   _____            __ _         _  ___      _    \n" +
                "  / ____|          / _| |       | |/ (_)    | |   \n" +
                " | |     _ __ __ _| |_| |_ _   _| ' / _  ___| | __\n" +
                " | |    | '__/ _` |  _| __| | | |  < | |/ __| |/ /\n" +
                " | |____| | | (_| | | | |_| |_| | . \\| | (__|   < \n" +
                "  \\_____|_|  \\__,_|_|  \\__|\\__, |_|\\_\\_|\\___|_|\\_\\\n" +
                "                            __/ |                 \n" +
                "                           |___/                  \n" +
                "\n");

        getProxy().getPluginManager().registerCommand(this, new KickCommand());
    }

    @Override
    public void onDisable() {

    }
}
