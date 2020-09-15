package com.gildedrose;

public class BrieItemUpdater extends ItemUpdater {
    public void updateAfterExpired(Item item) {
        if (item.isExpired()) {
            item.increaseQuality();
        }
    }

    @Override
    public void updateQuality(Item item) {
        item.increaseQuality();
        item.reduceSellIn();

    }
}
