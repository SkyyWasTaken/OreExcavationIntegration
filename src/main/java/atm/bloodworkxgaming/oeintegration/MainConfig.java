package atm.bloodworkxgaming.oeintegration;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Jonas on 09.05.2017.
 */

@Config(modid = OreExcavationIntegration.MOD_ID)
public class MainConfig {

    @Config.Comment({"Setting this config to true will fully disable the mod and you can use OreExcavation normally.",
            "This is better than ripping out the JAR from the mods folder"})
    public static boolean disableMod = false;

    @Config.Comment("This will disable the chat notification for all Players on the server")
    public static boolean disableChatNotification = false;

    @Config.Comment("Setting this to true toggels the whitelist to a blacklist")
    public static boolean packModesWhitelistToBlacklistToggle = false;

    @Config.Comment("If the current packmode is in this list then you will be able to mine without the modifier")
    public static String[] packModesWhitelist = new String[]{

    };

    @Config.Comment("A tool in this list won't require the enchantment")
    public static String[] toolWhitelistOverride = new String[]{

    };

    @Config.Comment("A tool in this list will be allowed to get the enchantment as well as any tool")
    public static String[] enchantmentWhitelist = new String[]{
            "minecraft:shears"
    };

    @Config.Comment("This will take away the ability to enchant any item that is a tool")
    public static String[] enchantmentBlacklist = new String[]{

    };

    @Config.Comment("true allows Mending and Excavate to be on the same Tool with Enchantments")
    public static boolean allowMendingEnchantment = true;

    @Config.Comment("true allows Mending and Excavate to be on the same Tool with Tinkers")
    public static boolean allowMendingTinkers = true;

    @Config.Comment("The amount of tinkers modifers needed to reach full power.")
    public static int maxTinkersModifersCount = 25;

    @Config.Comment("The max level of enchantment needed to full power of the tool.")
    public static int maxEnchantmentLevel = 5;

    @Config.Comment("true classifies the enchantment as a treasure enchantment")
    public static boolean isTreasureEnchantment = true;

    @Mod.EventBusSubscriber
    static class ConfigurationHolder {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(OreExcavationIntegration.MOD_ID)) {
                ConfigManager.load(OreExcavationIntegration.MOD_ID, Config.Type.INSTANCE);
            }
        }

    }
}