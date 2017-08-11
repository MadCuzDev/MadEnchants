package me.MadEnchants.MadCuzDev;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;

public class Breaker extends Enchantment {
	 
public Breaker(int id) {
super(id);
}
 
@Override
public boolean canEnchantItem(ItemStack item) {
return true;
}
 
@Override
public boolean conflictsWith(Enchantment other) {
return false;
}
 
@Override
public EnchantmentTarget getItemTarget() {
return null;
}
 
@Override
public int getMaxLevel() {
return 10;
}
 
@Override
public String getName() {
return "Breaker";
}
 
@Override
public int getId(){
return 68;
}
 
@Override
public int getStartLevel() {
return 1;
}
}