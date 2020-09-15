package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    void reduceQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    void reduceSellIn() {
        sellIn = sellIn - 1;
    }

    boolean isExpired() {
        return sellIn < 0;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
