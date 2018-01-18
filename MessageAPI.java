package nycuro.api;

import cn.nukkit.Player;
import cn.nukkit.entity.Entity;

import me.onebone.economyapi.EconomyAPI;

import nycuro.API;

/**
 * author: NycuRO
 * NycuRO-Factions Project
 */
public class MessageAPI {

    public void sendAbuseMessage(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7(§3!§7) §4Error: §7You abuse! That's not good..");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7(§3!§7) §4Eroare: §7Hopa...Abuzezi! Nu e bine asa..");
        }
    }

    public void sendSmecherieMessage(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7(§3!§7) §3Walk with the tricks? That's not good for you..");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7(§3!§7) §3Umblii cu smecherii? Nu e bine pentru tine..");
        }
    }

    public void sendBreakMessage(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7(§3!§7) §4Error: §7You can't break blocks here!");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7(§3!§7) §4Eroare: §7Nu poti sparge blocuri aici!");
        }
    }

    public void sendPlaceMessage(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7(§3!§7) §4Error: §7You can't place blocks here!");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7(§3!§7) §4Eroare: §7Nu poti pune blocuri aici!");
        }
    }

    public void sendDeadMessage(Player victim, Entity killer) {
        if ((int) API.getMainAPI().config.get(victim.getName()) == 0) {
            victim.sendMessage("§7(§3!§7) §rYou killed by §b" + killer.getName() + "§r!");
        } else if ((int) API.getMainAPI().config.get(victim.getName()) == 1) {
            victim.sendMessage("§7(§3!§7) §rAi fost omorat de §b" + killer.getName() + "§r!");
        }
    }

    public void sendPvPOffMessage(Player damager) {
        if ((int) API.getMainAPI().config.get(damager.getName()) == 0) {
            damager.sendMessage("§7(§3!§7) §4Error: §7You can't PvP here!");
        } else if ((int) API.getMainAPI().config.get(damager.getName()) == 1) {
            damager.sendMessage("§7(§3!§7) §4Eroare: §7Nu poti face PvP aici!");
        }
    }

    public void sendBorderMessage(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7(§3!§7) §4Error: §7You are on border. Please go back!");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7(§3!§7) §4Eroare: §7Ai ajuns la Border. Te rugam sa te indepartezi!");
        }
    }

    public void sendEnchantStartedKit(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7(§3!§7) §aWow! You got Kit Starter Enchanted!");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7(§3!§7) §aWow! Ai castigat Kit Starter Enchanted!");
        }
    }

    public void sendEnchantSparrowKit(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7(§3!§7) §aWow! You got Kit Sparrow!");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7(§3!§7) §aWow! Ai castigat Kit Sparrow!");
        }
    }

    public void sendEnchantGuardianKit(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7(§3!§7) §aWow! You got Kit Guardian!");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7(§3!§7) §aWow! Ai castigat Kit Guardian!");
        }
    }

    public void sendEnchantKnightKit(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7(§3!§7) §aWow! You got Kit Knight!");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7(§3!§7) §aWow! Ai castigat Kit Knight!");
        }
    }

    public void sendEnchantPaladinKit(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7(§3!§7) §aWow! You got Kit Paladin!");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7(§3!§7) §aWow! Ai castigat Kit Paladin!");
        }
    }

    public void sendEnchantVIPKit(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7(§3!§7) §aWow! You got Kit VIP!");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7(§3!§7) §aWow! Ai castigat Kit VIP!");
        }
    }

    public void sendEnchantVIPPlusKit(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7(§3!§7) §aWow! You got Kit VIP+!");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7(§3!§7) §aWow! Ai castigat Kit VIP+!");
        }
    }

    public void sendFullInventoryMessage(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7(§3!§7) §eInfo: §bYour inventory it's full for do this!");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7(§3!§7) §eInfo: §bAi inventarul plin pentru a face aceasta actiune!");
        }
    }

    public void sendCommandSpawnMessage(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7(§3!§7) §eInfo: §bYou teleported succesfuly to Spawn!");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7(§3!§7) §eInfo: §bTe-ai teleportat cu succes la Spawn!");
        }
    }

    public void sendLangMessage(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7» §3You selected English! Now, All Server are in English!");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7» §3Ai selectat Romana! Acum, Tot Serverul este in Romana!");
        }
    }

    public void selectLangMessage(Player player) {
        player.sendMessage("§7» §3Languages available:");
        player.sendMessage("§c» §aEnglish: §d/lang en.");
        player.sendMessage("§c» §aRomana: §d/lang ro.");
    }

    public void sendExceptionLangMessage(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7» §3Wrong arguments! Please use: §b/lang en/ro.");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7» §3Argument gresit! Te rog foloseste: §b/lang en/ro.");
        }
    }

    public void sendExceptionWarpsMessage(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7» §3Wrong arguments! Please use: §b/warps.");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7» §3Argument gresit! Te rog foloseste: §b/warps.");
        }
    }

    public void sendWarpsMessage(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7» §3Warps: §bshop, pvp, info, utils.");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7» §3Warp-uri: §bshop, pvp, info, utils.");
        }
    }

    public void sendExceptionWarpMessage(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7» §3Wrong arguments! Please use: §b/warp {name}.");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7» §3Argument gresit! Te rog foloseste: §b/warp {name}.");
        }
    }

    public void sendKitsMessage(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7» §3Kits: §bEnchantedStarter, Sparrow, Knight, Paladin.");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7» §3Kit-uri: §bEnchantedStarter, Sparrow, Knight, Paladin.");
        }
    }

    public void sendExceptionKitsMessage(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7» §3Wrong arguments! Please use: §b/kits.");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7» §3Argument gresit! Te rog foloseste: §b/kits.");
        }
    }

    public void sendExceptionKitMessage(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7» §3Wrong arguments! Please use: §b/kit {name}.");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7» §3Argument gresit! Te rog foloseste: §b/kit {name}.");
        }
    }

    public void sendUnsuficientMoneyMessage(Player player, double needed) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7» §3Opsss!!! You don't have so much money! You have: §b$" + EconomyAPI.getInstance().myMoney(player) + " §3and you need: §b$" + needed + "!");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7» §3Opsss!!! Nu ai destui bani! Ai exact: §b$" + EconomyAPI.getInstance().myMoney(player) + " §3si ai nevoie de: §b$" + needed + "!");
        }
    }

    public void sendCustomPermissionMessage(Player player) {
        if ((int) API.getMainAPI().config.get(player.getName()) == 0) {
            player.sendMessage("§7(§3!§7) §4Error: §7You don't have permission for do this action!");
        } else if ((int) API.getMainAPI().config.get(player.getName()) == 1) {
            player.sendMessage("§7(§3!§7) §4Error: §7Nu ai permisiunea de a face acest lucru!");
        }
    }
}
