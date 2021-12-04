//store houses found on web
//variables: address, yearBuilt, numBaths, isRenovated
//constructor #1: address, yearBuilt, numBaths, isRenovated
//constructor #2: address, yearBuilt = 1984, numBaths, isRenovated = false
//constructor #3: address = North Ave NW, Atlanta, GA 30332, yearBuilt = 1984, numBaths = 1, isRenovated = false

public class House {
    private String address;
    private int yearBuilt;
    private double numBaths;
    private boolean isRenovated;

    public House(String address, int yearBuilt, double numBaths, boolean isRenovated) {
        this.address = address;
        this.setYearBuilt(yearBuilt);
        this.setNumBaths(numBaths);
        this.isRenovated = isRenovated;
    }

    public House(String address, double numBaths) {
        this.address = address;
        this.setNumBaths(numBaths);
        this.yearBuilt = 1984;
        this.isRenovated = false;
    }

    public House() {
        this(
            "North Ave NW, Atlanta, GA 30332",
            1984,
            1.0,
            false);

    public void setNumBaths(double numBaths) {
        if (numBaths % 0.5 == 0) {
            this.numBaths = numBaths;
        }
    }

    public void setYearBuilt(int yearBuilt) {
        if (yearBuilt > 0) {
            this.yearBuilt = yearBuilt;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIsRenovated(boolean isRenovated) {
        this.isRenovated = isRenovated;
    }

    public String getAddress() {
        if (address == null) {
            return "";
        }
        return address;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public double getNumBaths() {
        return numBaths;
    }

    public boolean getIsRenovated() {
        return isRenovated;
    }
}