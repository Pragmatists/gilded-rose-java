package com.gildedrose;

public class ItemUpdaterFactory {
    public ItemUpdaterFactory() {
    }

    ItemUpdater getItemUpdater(Item item) {
        if (item.name.equals("Aged Brie")) {
            return new BrieItemUpdater();
        }
        return new ItemUpdater();
    }
}
