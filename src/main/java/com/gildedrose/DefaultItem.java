package com.gildedrose;

public class DefaultItem extends Item {
    public DefaultItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    void updateItem() {
        decreaseSellIn();
        decreaseQuality();
        if (sellIn < 0) {
            decreaseQuality();
        }
    }
}
