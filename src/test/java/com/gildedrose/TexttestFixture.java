package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TexttestFixture {
    @Test
    void _result_should_be_as_expected() {
        Item[] items = new Item[] {
                new DefaultItem("+5 Dexterity Vest", 10, 20), //
                new AgedBrieItem(2, 0, "Aged Brie"), //
                new DefaultItem("Elixir of the Mongoose", 5, 7), //
                new SulfurasItem(0, 80, "Sulfuras, Hand of Ragnaros"), //
                new SulfurasItem(-1, 80, "Sulfuras, Hand of Ragnaros"),
                new BackstagePassesItem(15, 20, "Backstage passes to a TAFKAL80ETC concert"),
                new BackstagePassesItem(10, 49, "Backstage passes to a TAFKAL80ETC concert"),
                new BackstagePassesItem(5, 49, "Backstage passes to a TAFKAL80ETC concert"),
                // this conjured item does not work properly yet
                new DefaultItem("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 2;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < days; i++) {
            result.append("-------- day " + i + " --------").append("\n");;
            result.append("name, sellIn, quality\n");
            for (Item item : items) {
                result.append(item).append("\n");
            }
            app.updateQuality();
        }

        System.out.println(result);
        assertEquals("-------- day 0 --------\n" +
                "name, sellIn, quality\n" +
                "+5 Dexterity Vest, 10, 20\n" +
                "Aged Brie, 2, 0\n" +
                "Elixir of the Mongoose, 5, 7\n" +
                "Sulfuras, Hand of Ragnaros, 0, 80\n" +
                "Sulfuras, Hand of Ragnaros, -1, 80\n" +
                "Backstage passes to a TAFKAL80ETC concert, 15, 20\n" +
                "Backstage passes to a TAFKAL80ETC concert, 10, 49\n" +
                "Backstage passes to a TAFKAL80ETC concert, 5, 49\n" +
                "Conjured Mana Cake, 3, 6\n" +
                "-------- day 1 --------\n" +
                "name, sellIn, quality\n" +
                "+5 Dexterity Vest, 9, 19\n" +
                "Aged Brie, 1, 1\n" +
                "Elixir of the Mongoose, 4, 6\n" +
                "Sulfuras, Hand of Ragnaros, 0, 80\n" +
                "Sulfuras, Hand of Ragnaros, -1, 80\n" +
                "Backstage passes to a TAFKAL80ETC concert, 14, 21\n" +
                "Backstage passes to a TAFKAL80ETC concert, 9, 50\n" +
                "Backstage passes to a TAFKAL80ETC concert, 4, 50\n" +
                "Conjured Mana Cake, 2, 5\n", result.toString());
    }

}
