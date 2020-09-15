package com.gildedrose;

public class ItemUpdater {

    public void updateQuality(Item item) {
        switch (item.name) {
            case "Backstage passes to a TAFKAL80ETC concert":
                item.increaseQuality();
                if (item.sellIn < 11) {
                    item.increaseQuality();
                }
                if (item.sellIn < 6) {
                    item.increaseQuality();
                }
                item.reduceSellIn();
                break;
            case "Sulfuras, Hand of Ragnaros":
                break;
            default:
                item.reduceSellIn();
                item.reduceQuality();
                break;
        }
    }

    public void updateAfterExpired(Item item) {
        if (item.sellIn < 0) {
            switch (item.name) {
                case "Backstage passes to a TAFKAL80ETC concert":
                    item.quality = 0;
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    return;
                default:
                    item.reduceQuality();
                    break;
            }
        }
    }

}
