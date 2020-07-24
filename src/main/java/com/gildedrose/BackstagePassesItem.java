package com.gildedrose;

public class BackstagePassesItem extends Item {

    public BackstagePassesItem(int sellIn, int quality, String name) {
        super(name, sellIn, quality);
    }

    @Override
    void updateItem() {
        decreaseSellIn();
        increaseQuality();
        if (sellIn < 11) {
            increaseQuality();
        }
        if (sellIn < 6) {
            increaseQuality();
        }
        if (itemExpired()) {
            quality = 0;
        }
    }

}
