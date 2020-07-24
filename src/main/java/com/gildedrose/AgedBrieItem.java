package com.gildedrose;

public class AgedBrieItem extends Item {

    public AgedBrieItem(int sellIn, int quality, String name) {
        super(name, sellIn, quality);
    }

    @Override
    void updateItem() {
        decreaseSellIn();
        increaseQuality();
        if (itemExpired()) {
            increaseQuality();
        }
    }
}
