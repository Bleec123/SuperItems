package me.zenox.superitems.items.armoritems;

import com.archyx.aureliumskills.stats.Stats;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import me.zenox.superitems.items.ArmorItem;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static me.zenox.superitems.items.ItemRegistry.DESECRATOR_SCALE;
import static me.zenox.superitems.items.ItemRegistry.DESECRATOR_TOE;

public class BootsOftheVoidLord extends ArmorItem {
    public BootsOftheVoidLord() {
        super("Boots Of the Void Lord", "boots_of_the_void_lord", Rarity.EPIC, Type.BOOTS, Material.LEATHER_BOOTS, Map.of(Stats.STRENGTH, 2d, Stats.HEALTH, 5d, Stats.WISDOM, 10d, Stats.REGENERATION, 2d));

        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "Legend says the Void Lord embedded his knowledge in his armor before he died...");
        this.getMeta().setLore(lore);
        ((LeatherArmorMeta) this.getMeta()).setColor(Color.TEAL);

        Multimap<Attribute, AttributeModifier> attributeMap = ArrayListMultimap.create();
        attributeMap.put(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "superitems:armor", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));
        attributeMap.put(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "superitems:armor_toughness", 10, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET));


        this.getMeta().setAttributeModifiers(attributeMap);
        this.getMeta().setUnbreakable(true);
    }

    @Override
    public List<Recipe> getRecipes() {
//        ShapedRecipe recipe = new ShapedRecipe(this.getKey(), this.getItemStack(1));
//        recipe.shape("   ", "S S", "T T");
//        recipe.setIngredient('T', new RecipeChoice.ExactChoice(DESECRATOR_TOE.getItemStack(1)));
//        recipe.setIngredient('S', new RecipeChoice.ExactChoice(DESECRATOR_SCALE.getItemStack(1)));
//        return List.of(recipe);
    }
}
