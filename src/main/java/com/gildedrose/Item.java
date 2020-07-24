package com.gildedrose;

public abstract class Item {

    private String name;
    protected int sellIn;
    protected int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    abstract void updateItem();

    protected void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    protected void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    protected void decreaseSellIn() {
        sellIn = sellIn - 1;
    }

    protected boolean itemExpired() {
        return sellIn < 0;
    }
}
