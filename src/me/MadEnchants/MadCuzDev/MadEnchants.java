package me.MadEnchants.MadCuzDev;

import java.lang.reflect.Field;
import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class MadEnchants extends JavaPlugin implements Listener {
	
	@EventHandler
	public void enchantingTableCE(EnchantItemEvent event) {
		int enchantLevel = (int)(Math.random() * 5 + 1);
		int willEnchant = (int)(Math.random() * 101);
		if (willEnchant > 50) {
		if (event.getItem().getType().equals(Material.STONE_AXE) || event.getItem().getType().equals(Material.WOOD_AXE) || event.getItem().getType().equals(Material.GOLD_AXE) || event.getItem().getType().equals(Material.IRON_AXE) || event.getItem().getType().equals(Material.DIAMOND_AXE)) {
			if (enchantLevel == 1) {
			ItemMeta im = event.getItem().getItemMeta();
			im.setLore(Arrays.asList("§cSuperSpeed I"));
			event.getItem().setItemMeta(im);
			event.getItem().addUnsafeEnchantment(MadEnchants.SuperSpeed, 1);
			} else if (enchantLevel == 2) {
				ItemMeta im = event.getItem().getItemMeta();
				im.setLore(Arrays.asList("§cSuperSpeed II"));
				event.getItem().setItemMeta(im);
				event.getItem().addUnsafeEnchantment(MadEnchants.SuperSpeed, 2);
				} else if (enchantLevel == 3) {
					ItemMeta im = event.getItem().getItemMeta();
					im.setLore(Arrays.asList("§cSuperSpeed III"));
					event.getItem().setItemMeta(im);
					event.getItem().addUnsafeEnchantment(MadEnchants.SuperSpeed, 3);
					} else if (enchantLevel == 4) {
						ItemMeta im = event.getItem().getItemMeta();
						im.setLore(Arrays.asList("§cSuperSpeed IV"));
						event.getItem().setItemMeta(im);
						event.getItem().addUnsafeEnchantment(MadEnchants.SuperSpeed, 4);
						} else if (enchantLevel == 5) {
							ItemMeta im = event.getItem().getItemMeta();
							im.setLore(Arrays.asList("§cSuperSpeed V"));
							event.getItem().setItemMeta(im);
							event.getItem().addUnsafeEnchantment(MadEnchants.SuperSpeed, 5);
							}
		}
		} else {}
	}
	
	@EventHandler
    public void breakerEnchantBreak(BlockBreakEvent event) {
        Player p = (Player) event.getPlayer();
        if (p.getInventory().getItemInHand().containsEnchantment(MadEnchants.Breaker)) {
        	if (p.getItemInHand().getEnchantmentLevel(MadEnchants.Breaker) == 1) {
        	Location breakLoc = event.getBlock().getLocation();
            Location test = breakLoc;
            Block n1BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() - 1, test.getBlockZ());
            n1BreakLoc.breakNaturally();
        	} else if (p.getInventory().getItemInHand().containsEnchantment(MadEnchants.Breaker)) {
            	if (p.getItemInHand().getEnchantmentLevel(MadEnchants.Breaker) == 2) {
                	Location breakLoc = event.getBlock().getLocation();
                    Location test = breakLoc;
                    Block n1BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() - 1, test.getBlockZ());
                    n1BreakLoc.breakNaturally();
                    Block n2BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() + 1, test.getBlockZ());
                    n2BreakLoc.breakNaturally();
        	} else if (p.getInventory().getItemInHand().containsEnchantment(MadEnchants.Breaker)) {
            	if (p.getItemInHand().getEnchantmentLevel(MadEnchants.Breaker) == 3) {
                	Location breakLoc = event.getBlock().getLocation();
                    Location test = breakLoc;
                    Block n1BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() - 1, test.getBlockZ());
                    n1BreakLoc.breakNaturally();
                    Block n2BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() + 1, test.getBlockZ());
                    n2BreakLoc.breakNaturally();
                    Block n3BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY(), test.getBlockZ() + 1);
                    n3BreakLoc.breakNaturally();
                    Block n4BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY(), test.getBlockZ() - 1);
                    n4BreakLoc.breakNaturally();
                    Block n5BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY(), test.getBlockZ());
                    n5BreakLoc.breakNaturally();
                    Block n6BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY(), test.getBlockZ());
                    n6BreakLoc.breakNaturally();
                	} else if (p.getInventory().getItemInHand().containsEnchantment(MadEnchants.Breaker)) {
                    	if (p.getItemInHand().getEnchantmentLevel(MadEnchants.Breaker) == 4) {
                        	Location breakLoc = event.getBlock().getLocation();
                            Location test = breakLoc;
                            Block n1BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() - 1, test.getBlockZ());
                            n1BreakLoc.breakNaturally();
                            Block n2BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() + 1, test.getBlockZ());
                            n2BreakLoc.breakNaturally();
                            Block n3BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY(), test.getBlockZ() + 1);
                            n3BreakLoc.breakNaturally();
                            Block n4BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY(), test.getBlockZ() - 1);
                            n4BreakLoc.breakNaturally();
                            Block n5BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY(), test.getBlockZ());
                            n5BreakLoc.breakNaturally();
                            Block n6BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY(), test.getBlockZ());
                            n6BreakLoc.breakNaturally();
                            Block n7BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY() - 1, test.getBlockZ() - 1);
                            n7BreakLoc.breakNaturally();
                            Block n8BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY() - 1, test.getBlockZ() + 1);
                            n8BreakLoc.breakNaturally();
                            Block n9BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY() - 1, test.getBlockZ() - 1);
                            n9BreakLoc.breakNaturally();
                            Block n10BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY() - 1, test.getBlockZ() + 1);
                            n10BreakLoc.breakNaturally();
                            Block n11BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY() + 1, test.getBlockZ() - 1);
                            n11BreakLoc.breakNaturally();
                            Block n12BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY() + 1, test.getBlockZ() + 1);
                            n12BreakLoc.breakNaturally();
                            Block n13BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY() + 1, test.getBlockZ() - 1);
                            n13BreakLoc.breakNaturally();
                            Block n14BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY() + 1, test.getBlockZ() + 1);
                            n14BreakLoc.breakNaturally();
                        	} else if (p.getInventory().getItemInHand().containsEnchantment(MadEnchants.Breaker)) {
                            	if (p.getItemInHand().getEnchantmentLevel(MadEnchants.Breaker) == 5) {
                                	Location breakLoc = event.getBlock().getLocation();
                                    Location test = breakLoc;
                                    Block n1BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() - 1, test.getBlockZ());
                                    n1BreakLoc.breakNaturally();
                                    Block n2BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() + 1, test.getBlockZ());
                                    n2BreakLoc.breakNaturally();
                                    Block n3BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY(), test.getBlockZ() + 1);
                                    n3BreakLoc.breakNaturally();
                                    Block n4BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY(), test.getBlockZ() - 1);
                                    n4BreakLoc.breakNaturally();
                                    Block n5BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY(), test.getBlockZ());
                                    n5BreakLoc.breakNaturally();
                                    Block n6BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY(), test.getBlockZ());
                                    n6BreakLoc.breakNaturally();
                                    Block n7BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY() - 1, test.getBlockZ() - 1);
                                    n7BreakLoc.breakNaturally();
                                    Block n8BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY() - 1, test.getBlockZ() + 1);
                                    n8BreakLoc.breakNaturally();
                                    Block n9BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY() - 1, test.getBlockZ() - 1);
                                    n9BreakLoc.breakNaturally();
                                    Block n10BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY() - 1, test.getBlockZ() + 1);
                                    n10BreakLoc.breakNaturally();
                                    Block n11BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY() + 1, test.getBlockZ() - 1);
                                    n11BreakLoc.breakNaturally();
                                    Block n12BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY() + 1, test.getBlockZ() + 1);
                                    n12BreakLoc.breakNaturally();
                                    Block n13BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY() + 1, test.getBlockZ() - 1);
                                    n13BreakLoc.breakNaturally();
                                    Block n14BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY() + 1, test.getBlockZ() + 1);
                                    n14BreakLoc.breakNaturally();
                                    Block n15BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY() - 1, test.getBlockZ());
                                    n15BreakLoc.breakNaturally();
                                    Block n16BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY() + 1, test.getBlockZ());
                                    n16BreakLoc.breakNaturally();
                                    Block n17BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY() - 1, test.getBlockZ());
                                    n17BreakLoc.breakNaturally();
                                    Block n18BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY() + 1, test.getBlockZ());
                                    n18BreakLoc.breakNaturally();
                                    Block n19BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() + 1, test.getBlockZ() - 1);
                                    n19BreakLoc.breakNaturally();
                                    Block n20BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() + 1, test.getBlockZ() + 1);
                                    n20BreakLoc.breakNaturally();
                                    Block n21BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() - 1, test.getBlockZ() - 1);
                                    n21BreakLoc.breakNaturally();
                                    Block n22BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() - 1, test.getBlockZ() + 1);
                                    n22BreakLoc.breakNaturally();
                                	} else if (p.getInventory().getItemInHand().containsEnchantment(MadEnchants.Breaker)) {
                                    	if (p.getItemInHand().getEnchantmentLevel(MadEnchants.Breaker) == 6) {
                                        	Location breakLoc = event.getBlock().getLocation();
                                            Location test = breakLoc;
                                            Block n1BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() - 1, test.getBlockZ());
                                            n1BreakLoc.breakNaturally();
                                            Block n2BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() + 1, test.getBlockZ());
                                            n2BreakLoc.breakNaturally();
                                            Block n3BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY(), test.getBlockZ() + 1);
                                            n3BreakLoc.breakNaturally();
                                            Block n4BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY(), test.getBlockZ() - 1);
                                            n4BreakLoc.breakNaturally();
                                            Block n5BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY(), test.getBlockZ());
                                            n5BreakLoc.breakNaturally();
                                            Block n6BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY(), test.getBlockZ());
                                            n6BreakLoc.breakNaturally();
                                            Block n7BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY() - 1, test.getBlockZ() - 1);
                                            n7BreakLoc.breakNaturally();
                                            Block n8BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY() - 1, test.getBlockZ() + 1);
                                            n8BreakLoc.breakNaturally();
                                            Block n9BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY() - 1, test.getBlockZ() - 1);
                                            n9BreakLoc.breakNaturally();
                                            Block n10BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY() - 1, test.getBlockZ() + 1);
                                            n10BreakLoc.breakNaturally();
                                            Block n11BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY() + 1, test.getBlockZ() - 1);
                                            n11BreakLoc.breakNaturally();
                                            Block n12BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY() + 1, test.getBlockZ() + 1);
                                            n12BreakLoc.breakNaturally();
                                            Block n13BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY() + 1, test.getBlockZ() - 1);
                                            n13BreakLoc.breakNaturally();
                                            Block n14BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY() + 1, test.getBlockZ() + 1);
                                            n14BreakLoc.breakNaturally();
                                            Block n15BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY() - 1, test.getBlockZ());
                                            n15BreakLoc.breakNaturally();
                                            Block n16BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY() + 1, test.getBlockZ());
                                            n16BreakLoc.breakNaturally();
                                            Block n17BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY() - 1, test.getBlockZ());
                                            n17BreakLoc.breakNaturally();
                                            Block n18BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY() + 1, test.getBlockZ());
                                            n18BreakLoc.breakNaturally();
                                            Block n19BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() + 1, test.getBlockZ() - 1);
                                            n19BreakLoc.breakNaturally();
                                            Block n20BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() + 1, test.getBlockZ() + 1);
                                            n20BreakLoc.breakNaturally();
                                            Block n21BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() - 1, test.getBlockZ() - 1);
                                            n21BreakLoc.breakNaturally();
                                            Block n22BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX(), test.getBlockY() - 1, test.getBlockZ() + 1);
                                            n22BreakLoc.breakNaturally();
                                            Block n23BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY(), test.getBlockZ() - 1);
                                            n23BreakLoc.breakNaturally();
                                            Block n24BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY(), test.getBlockZ() + 1);
                                            n24BreakLoc.breakNaturally();
                                            Block n25BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() + 1, test.getBlockY(), test.getBlockZ() - 1);
                                            n25BreakLoc.breakNaturally();
                                            Block n26BreakLoc = breakLoc.getWorld().getBlockAt(test.getBlockX() - 1, test.getBlockY(), test.getBlockZ() + 1);
                                            n26BreakLoc.breakNaturally();
                                        	} } } } }
        	}
        }
    }
	
	@EventHandler
	public void superSpeedHold(PlayerItemHeldEvent event) {
		Player p = (Player) event.getPlayer();
		if (!(event.getNewSlot() == event.getPreviousSlot()) && p.getInventory().getItemInHand().containsEnchantment(MadEnchants.SuperSpeed)) {
			Bukkit.getScheduler().cancelTasks((Plugin) Bukkit.getPluginManager().getPlugin(getName()));
			this.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
            	
            	  public void run() {
            		  if (p.getItemInHand().getEnchantmentLevel(MadEnchants.SuperSpeed) == 1) {
  						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20, 0));
  				} else if (p.getItemInHand().getEnchantmentLevel(MadEnchants.SuperSpeed) == 2) {
  					p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20, 1));
  		} else if (p.getItemInHand().getEnchantmentLevel(MadEnchants.SuperSpeed) == 3) {
  			p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20, 2));
  } else if (p.getItemInHand().getEnchantmentLevel(MadEnchants.SuperSpeed) == 4) {
  	p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20, 3));
  } else if (p.getItemInHand().getEnchantmentLevel(MadEnchants.SuperSpeed) == 5) {
  	p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20, 4));
  } else if (p.getItemInHand().getEnchantmentLevel(MadEnchants.SuperSpeed) == 6) {
  	p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20, 5));
  } else if (p.getItemInHand().getEnchantmentLevel(MadEnchants.SuperSpeed) == 7) {
  	p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20, 6));
  } else if (p.getItemInHand().getEnchantmentLevel(MadEnchants.SuperSpeed) == 8) {
  	p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20, 7));
  } else if (p.getItemInHand().getEnchantmentLevel(MadEnchants.SuperSpeed) == 9) {
  	p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20, 8));
  } else if (p.getItemInHand().getEnchantmentLevel(MadEnchants.SuperSpeed) == 10) {
  	p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20, 9));
            		  } else {}
            	   }
            	}, 0, 20);		
			}
		}
	
	@Override
    public void onEnable() {
		getLogger().info("MadEnchants Enabled");
		try {
			try {
			Field f = Enchantment.class.getDeclaredField("acceptingNew");
			f.setAccessible(true);
			f.set(null, true);
			} catch (Exception e) {
			e.printStackTrace();
			}
			try {
			Enchantment.registerEnchantment(SuperSpeed);
			} catch (IllegalArgumentException e){
			}
			}catch(Exception e){
			e.printStackTrace();
			}
		try {
			try {
			Field f = Enchantment.class.getDeclaredField("acceptingNew");
			f.setAccessible(true);
			f.set(null, true);
			} catch (Exception e) {
			e.printStackTrace();
			}
			try {
			Enchantment.registerEnchantment(Breaker);
			} catch (IllegalArgumentException e){
			}
			}catch(Exception e){
			e.printStackTrace();
			}
		getServer().getPluginManager().registerEvents(this, this);
    }
   
    @Override
    public void onDisable() {
        getLogger().info("MadEnchants Disabled");
    }
    
    public static SuperSpeed SuperSpeed = new SuperSpeed(69);
    public static Breaker Breaker = new Breaker(68);
    
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	
    	Player player = (Player) sender;
    	
    	if (cmd.getName().equalsIgnoreCase("cenchant") && sender instanceof Player) {
    		if (args.length == 2) {
    			int enchantLevel = Integer.parseInt(args[1]);
    			if (args[0].equalsIgnoreCase("superspeed")) {
    		player.getInventory().getItemInHand().addUnsafeEnchantment(MadEnchants.SuperSpeed, enchantLevel);
    		ItemMeta im = player.getInventory().getItemInHand().getItemMeta();
    		if (enchantLevel == 1) { 
    			im.setLore(Arrays.asList("§cSuperSpeed I"));
    		} else if (enchantLevel == 2) { 
    			im.setLore(Arrays.asList("§cSuperSpeed II"));
    		} else if (enchantLevel == 3) { 
    			im.setLore(Arrays.asList("§cSuperSpeed III"));
    		} else if (enchantLevel == 4) { 
    			im.setLore(Arrays.asList("§cSuperSpeed IV"));
    		} else if (enchantLevel == 5) { 
    			im.setLore(Arrays.asList("§cSuperSpeed V"));
    		} else if (enchantLevel == 6) { 
    			im.setLore(Arrays.asList("§cSuperSpeed VI"));
    		} else if (enchantLevel == 7) { 
    			im.setLore(Arrays.asList("§cSuperSpeed VII"));
    		} else if (enchantLevel == 8) { 
    			im.setLore(Arrays.asList("§cSuperSpeed VIII"));
    		} else if (enchantLevel == 9) { 
    			im.setLore(Arrays.asList("§cSuperSpeed IX"));
    		} else if (enchantLevel == 10) { 
    			im.setLore(Arrays.asList("§cSuperSpeed X"));
    		} else {
    			player.sendMessage("Valid Levels: 1 - 10");
    		} player.getInventory().getItemInHand().setItemMeta(im);
    			} else if (args[0].equalsIgnoreCase("breaker")) {
    	    		player.getInventory().getItemInHand().addUnsafeEnchantment(MadEnchants.Breaker, enchantLevel);
    	    		ItemMeta im = player.getInventory().getItemInHand().getItemMeta();
    	    		if (enchantLevel == 1) { 
    	    			im.setLore(Arrays.asList("§cBreaker I"));
    	    		} else if (enchantLevel == 2) { 
    	    			im.setLore(Arrays.asList("§cBreaker II"));
    	    		} else if (enchantLevel == 3) { 
    	    			im.setLore(Arrays.asList("§cBreaker III"));
    	    		} else if (enchantLevel == 4) { 
    	    			im.setLore(Arrays.asList("§cBreaker IV"));
    	    		} else if (enchantLevel == 5) { 
    	    			im.setLore(Arrays.asList("§cBreaker V"));
    	    		} else if (enchantLevel == 6) { 
    	    			im.setLore(Arrays.asList("§cBreaker VI"));
    	    		} else if (enchantLevel == 7) { 
    	    			im.setLore(Arrays.asList("§cBreaker VII"));
    	    		} else if (enchantLevel == 8) { 
    	    			im.setLore(Arrays.asList("§cBreaker VIII"));
    	    		} else if (enchantLevel == 9) { 
    	    			im.setLore(Arrays.asList("§cBreaker IX"));
    	    		} else if (enchantLevel == 10) { 
    	    			im.setLore(Arrays.asList("§cBreaker X"));
    	    		} else {
    	    			player.sendMessage("Valid Levels: 1 - 10");
    	    		} player.getInventory().getItemInHand().setItemMeta(im); } else {
    				player.sendMessage("Valid Enchants: SuperSpeed, Breaker");
    			}
    		} else {
    			player.sendMessage("Usage: /cenchant (enchant) (level)");
    		}
    	} if (cmd.getName().equalsIgnoreCase("cereset") && sender instanceof Player) {
    		if (player.getInventory().getItemInHand().containsEnchantment(MadEnchants.SuperSpeed)) {
    		player.getInventory().getItemInHand().removeEnchantment(MadEnchants.SuperSpeed);
    		} else if (player.getInventory().getItemInHand().containsEnchantment(MadEnchants.Breaker)) {
        		player.getInventory().getItemInHand().removeEnchantment(MadEnchants.Breaker);
    		} else {}
    		ItemMeta im = player.getInventory().getItemInHand().getItemMeta();
    		im.setLore(Arrays.asList());
    		player.getInventory().getItemInHand().setItemMeta(im);
    	} return true;
    }
}
