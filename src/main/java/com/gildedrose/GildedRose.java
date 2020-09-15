package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemUpdater itemUpdater = new ItemUpdater();
            itemUpdater.updateQuality(item);
            itemUpdater.updateAfterExpiration(item);
        }
    }
}
