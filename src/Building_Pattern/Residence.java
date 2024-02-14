package Building_Pattern;

public class Residence {
    private final ResidenceBuilder.ResidenceType residenceType;
    private final String adress;
    private final int area;
    private final int countRooms;
    private final int cost;

    public Residence(ResidenceBuilder.ResidenceType residenceType, String adress, int area, int countRooms, int cost) {
        this.residenceType = residenceType;
        this.adress = adress;
        this.area = area;
        this.countRooms = countRooms;
        this.cost = cost;
    }

    public ResidenceBuilder.ResidenceType getResidenceType() {
        return residenceType;
    }

    public String getAdress() {
        return adress;
    }

    public int getArea() {
        return area;
    }

    public int getCountRooms() {
        return countRooms;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "residenceType=" + residenceType +
                ", adress='" + adress + '\'' +
                ", area=" + area + "metrkv" +
                ", countRooms=" + countRooms +
                ", cost=" + cost + "$" +
                '}';
    }
}
