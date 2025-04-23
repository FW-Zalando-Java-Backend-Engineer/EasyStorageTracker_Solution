package model;

public class Device {
    private String name;
    private String serialNumber;

    public Device(String name, String serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " + name + " (SN: " + serialNumber + ")";
    }
}
