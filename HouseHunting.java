public class HouseHunting {
	public static void main(String[] args) {
		House house1 = new House("1805 Riverdale Dr", 2003, 3.0, false);
		House house2 = new House("1925 Riverside Dr", 2.0);
		House house3 = new House();
		
		String address1 = house1.getAddress();
		System.out.println(address1);
		House[] myhouses;
		myhouses = new House[4];
		myhouses[0] = house1;
		myhouses[1] = house2;
		myhouses[2] = house3;
		Neighborhood myNeighborhood1 = new Neighborhood(myhouses);
		int num = myNeighborhood1.getNumHouses();
		System.out.println(num);

	}
}