package me.zenox.superitems.items.superitems;

import me.zenox.superitems.items.ComplexItem;
import me.zenox.superitems.items.abilities.MagicMissile;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;

import java.util.List;
import java.util.Map;

public class Plane extends ComplexItem {
    public Plane() {
        super("Plane", "Plane", Rarity.MYTHIC, Type.SUPERITEM, Material.QUARTZ_STAIRS, Map.of(), List.of(new MagicMissile(6, true)));

        List<String> lore = List.of(ChatColor.BLUE + "" + ChatColor.ITALIC + "ZOOMIES");

        this.getMeta().setLore(lore);
        this.getMeta().addEnchant(Enchantment.DAMAGE_ALL, 42, true);
        this.getMeta().addItemFlags(ItemFlag.HIDE_ENCHANTS);
    }

    @Override
    public List<Recipe> getRecipes() {
        ShapedRecipe recipe = new ShapedRecipe(this.getKey(), this.getItemStack(3));
        recipe.shape("DGD", "FSF", "TST");
        recipe.setIngredient('D', Material.IRON_BLOCK);
        recipe.setIngredient('G', Material.FIREWORK_ROCKET);
        recipe.setIngredient('F', Material.FIRE_CHARGE);
        recipe.setIngredient('S', Material.COAL_BLOCK);
        recipe.setIngredient('T', Material.BONE_MEAL);
        return List.of(recipe);
    }
}