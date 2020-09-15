package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateItem() {
        for (Item item : items) {
            ItemUpdater itemUpdater = new ItemUpdaterFactory().getItemUpdater(item);
            itemUpdater.updateQuality(item);
            itemUpdater.updateAfterExpired(item);
        }
    }

}
