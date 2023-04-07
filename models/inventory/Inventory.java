package org.example.rpg.models.inventory;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Inventory implements Iterable<Map.Entry<ItemType, Integer>> {
    private final HashMap<ItemType, Integer> items = new HashMap<>();
    
    public Integer get(ItemType type) {
        return this.items.get(type);
    }

    public void add(ItemType type, Integer qtt) {
        this.items.put(type, qtt);
    }

    @Override
    public Iterator<Map.Entry<ItemType, Integer>> iterator() {
        return this.items.entrySet().iterator();
    }

    public void add(Inventory inventory) {
        for (Map.Entry<ItemType, Integer> item : inventory) {
            if (!this.items.containsKey(item.getKey())) {
                this.items.put(item.getKey(), 0);
            }
            int qtt = this.items.get(item.getKey()) + item.getValue();
            this.items.put(item.getKey(), qtt);
        }
    }
}

