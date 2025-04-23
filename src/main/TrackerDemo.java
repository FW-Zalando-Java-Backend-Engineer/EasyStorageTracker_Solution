package main;

// our packages
import model.*;
import storage.*;


// java packages
import java.util.*;

public class TrackerDemo {

    public static void main(String[] args) {

//        StorageUnit<Book> bookStorage = new StorageUnit<>();
//        bookStorage.addItem(new Book("Java Fundamentals", "Alice"));
//
//        StorageUnit<Device> deviceStorage = new StorageUnit<>();
//        deviceStorage.addItem(new Device("Smartphone", "SN123456"));
//
//        StorageUnit<Snack> snackStorage = new StorageUnit<>();
//        snackStorage.addItem(new Snack("Chips", "chilli", false));

//        StorageUtils.displayItem(bookStorage.getItem());
//        StorageUtils.displayItem(deviceStorage.getItem());
//        StorageUtils.displayItem(snackStorage.getItem());
//
//        StorageUtils.checkPerishable(snackStorage.getItem());

//        List<Object> inventory = new ArrayList<>();
//        inventory.add(bookStorage.getItem());
//        inventory.add(deviceStorage.getItem());
//        inventory.add(snackStorage.getItem());
//
//        StorageUtils.printItems(inventory);

//        StorageManage<Book> bookManager = new StorageManage<>();
//        bookManager.addItem(new Book("Clean Code", "Robert C. Martin"));
//        bookManager.addItem(new Book("Effective Java", "Joshua Bloch"));
//        System.out.println("Books in storage:");
//        bookManager.printAll();

        StorageUnit<Book> bookStorage = new StorageUnit<>();
        bookStorage.addItem(new Book("Java Fundamentals", "Alice"));
        System.out.println("JSON Output: " + JsonFormatter.toJson(bookStorage.getItem()));


    }
}
