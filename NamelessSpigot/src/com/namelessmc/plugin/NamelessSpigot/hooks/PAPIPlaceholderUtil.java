package com.namelessmc.plugin.NamelessSpigot.hooks;

import org.bukkit.entity.Player;

import com.namelessmc.plugin.NamelessSpigot.NamelessPlugin;

import me.clip.placeholderapi.external.EZPlaceholderHook;

public class PAPIPlaceholderUtil extends EZPlaceholderHook {

	public PAPIPlaceholderUtil() {
		super(NamelessPlugin.getInstance(), "nameless");
	}

	@Override
	public String onPlaceholderRequest(Player player, String identifier) {
		return null;
		/*NamelessPlayer namelessPlayer = new NamelessPlayer(player.getUniqueId(), NamelessPlugin.baseApiURL);
		if (identifier.equals("alerts")) {
			try {
				if (namelessPlayer.exists()) {
					return Integer.toString(namelessPlayer.getAlertCount());
				}else {
					return "0";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (identifier.equals("messages")) {
			try {
				if (namelessPlayer.exists()) {
					return Integer.toString(namelessPlayer.getMessageCount());
				} else {
					return "0";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;*/
	}

}