package Building_Pattern;

public interface ResidenceBuilder {
    enum ResidenceType {
        HOME, HOTEL, APARTMENT
    }

    void setResidenceType(ResidenceType residenceType);

    void setCost(int cost);

    void setAdress(String adress);

    void setArea(int area);

    void setCountRooms(int countRooms);

}
