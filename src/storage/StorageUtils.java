package storage;

import java.util.List;
import model.Perishable;

public class StorageUtils {
    public static void printItems(List<? extends Object> items){ // '?' means 'any' extends Object: means any reference type
        for(Object item : items){
            System.out.println(item);
        }
    }

    public static <T> void displayItem(T item){
        System.out.println("Item: " + item);
    }

    public static <T extends Perishable> void checkPerishable(T item){
        System.out.println("Perishable check: " + (item.isExpired() ? "Expired" : "Fresh"));
    }
}
