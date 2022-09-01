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

public class Bleec extends ComplexItem {
    public Bleec() {
        super("Bleec", "Bleec", Rarity.MYTHIC, Type.SUPERITEM, Material.SUSPICIOUS_STEW, Map.of(), List.of(new MagicMissile(10, true)));

        List<String> lore = List.of(ChatColor.YELLOW + "" + ChatColor.ITALIC + "Bleec.");

        this.getMeta().setLore(lore);
        this.getMeta().addEnchant(Enchantment.DAMAGE_ALL, 69, true);
        this.getMeta().addItemFlags(ItemFlag.HIDE_ENCHANTS);
    }

    @Override
    public List<Recipe> getRecipes() {
        ShapedRecipe recipe = new ShapedRecipe(this.getKey(), this.getItemStack(3));
        recipe.shape("DGD", "FSF", "TST");
        recipe.setIngredient('D', Material.RED_MUSHROOM);
        recipe.setIngredient('G', Material.OAK_LEAVES);
        recipe.setIngredient('F', Material.BOWL);
        recipe.setIngredient('S', Material.BARRIER);
        recipe.setIngredient('T', Material.BROWN_MUSHROOM);
        return List.of(recipe);
    }
}

