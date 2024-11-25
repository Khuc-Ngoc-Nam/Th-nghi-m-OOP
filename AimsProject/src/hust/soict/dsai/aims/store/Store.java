package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < itemsInStore.length) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("Added DVD: " + disc.getTitle());
        } else {
            System.out.println("The store is full.");
        }
    }

    public void removeDVD(String title) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].isMatch(title)) {
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("Removed DVD: " + title);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No match found for title: " + title);
        }
    }
}
