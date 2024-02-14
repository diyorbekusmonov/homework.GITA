package Building_Pattern;

public class ConcreteResidenceBuilder implements ResidenceBuilder {
    private ResidenceBuilder.ResidenceType residenceType;
    private int area;
    private int countRooms;
    private String adress;
    private int cost;

    @Override
    public void setResidenceType(ResidenceType residenceType) {
        this.residenceType = residenceType;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void setAdress(String adress) {
        this.adress = adress;
    }


    @Override
    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public void setCountRooms(int countRooms) {
        this.countRooms = countRooms;
    }

    public Residence build() {
        return new Residence(residenceType, adress, area, countRooms, cost);
    }
}
