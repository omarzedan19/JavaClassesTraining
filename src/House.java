public class House {
    final String address;
    final float areaInSquareMeters;
    String ownerName;

    // Constructor that accepts all fields
    public House(String address, float areaInSquareMeters, String ownerName) {
        this.address = address;
        this.areaInSquareMeters = areaInSquareMeters;
        this.ownerName = ownerName;
    }

    // Constructor that accepts only address and areaInSquareMeters
    public House(String address, float areaInSquareMeters) {
        this.address = address;
        this.areaInSquareMeters = areaInSquareMeters;
        // ownerName will be initialized to null by default
    }
}