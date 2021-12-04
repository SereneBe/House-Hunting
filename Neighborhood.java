public class Neighborhood {
    private int numHouses;
    private House[] houses;

    public Neighborhood() {
        this.houses = new House[5];
        this.numHouses = 0;
    }

    public Neighborhood(House[] houses) {
        this.houses = houses;
        this.numHouses = this.countHouses(houses);
    }

    public void displayNewHouses(int year) {
        int yearBuilt;
        boolean renovated;
        String address = "";
        double numBaths;
        String ren;
        for (int i = 0; i < this.houses.length; i++) {
            yearBuilt = this.houses[i].getYearBuilt();
            if (yearBuilt > year) {
                address = this.houses[i].getAddress();
                numBaths = this.houses[i].getNumBaths();
                renovated = this.houses[i].getIsRenovated();
                if (renovated) {
                    ren = "has";
                } else {
                    ren = "has not";
                }
                String strAddress = "House located at " + address;
                String strYear = " was built in" + year;
                String strBaths = ", has " + numBaths + " number of bathrooms, and ";
                String strRen = ren + " been renovated recently.";
                System.out.print(strAddress + strYear + strBaths + strRen);
            }
        }
    }
    public House addHouse(int index, House home) {
        House prevHouse = this.houses[index];
        this.houses[index] = home;
        if (prevHouse == null) {
            numHouses++;
        }
        return prevHouse;
    }
    public House removeHouse(int index) {
        if (index > houses.length || index < 0) {
            return null;
        }
        House prevHouse = this.houses[index];
        this.houses[index] = null;
        if (prevHouse != null) {
            numHouses--;
        }
        return prevHouse;
    }
    public boolean isFull() {
        if (numHouses == this.houses.length) {
            return true;
        }
        return false;
    }
    public int getNumHouses() {
        return this.numHouses;
    }
    public House[] getHouses() {
        return this.houses;
    }

    public int countHouses(House[] houses) {
        int count = 0;
        for (int i = 0; i < this.houses.length; i++) {
            if (houses[i] != null) {
                count++;
            }
        }
        return count;
    }
}