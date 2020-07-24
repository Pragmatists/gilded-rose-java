package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            updateQuality(i);

            updateSellIn(i);

            updateQualityAfterSellin(i);
        }
    }

    private void updateQuality(int i) {
        if (items[i].name.equals("Aged Brie") || items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (items[i].quality < 50) {
                items[i].quality = items[i].quality + 1;

                if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (items[i].sellIn < 11) {
                        if (items[i].quality < 50) {
                            items[i].quality = items[i].quality + 1;
                        }
                    }

                    if (items[i].sellIn < 6) {
                        if (items[i].quality < 50) {
                            items[i].quality = items[i].quality + 1;
                        }
                    }
                }
            }
        } else {
            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros") && items[i].quality > 0) {
                items[i].quality = items[i].quality - 1;
            }
        }
    }

    private void updateSellIn(int i) {
        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
            items[i].sellIn = items[i].sellIn - 1;
        }
    }

    private void updateQualityAfterSellin(int i) {
        if (items[i].sellIn < 0) {
            if (items[i].name.equals("Aged Brie")) {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                }
            } else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                items[i].quality = 0;
            } else if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                if (items[i].quality > 0)
                    items[i].quality = items[i].quality - 1;
            }
        }
    }
}

