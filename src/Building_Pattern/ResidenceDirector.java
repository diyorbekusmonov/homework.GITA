package Building_Pattern;

public class ResidenceDirector {
    public void buildHome(ResidenceBuilder residenceBuilder,String adress){
        residenceBuilder.setResidenceType(ResidenceBuilder.ResidenceType.HOME);
        residenceBuilder.setArea(600);
        residenceBuilder.setCountRooms(8);
        residenceBuilder.setCost(600_000);
        residenceBuilder.setAdress(adress);
    }
    public void buildHotel(ResidenceBuilder residenceBuilder,String adress){
        residenceBuilder.setResidenceType(ResidenceBuilder.ResidenceType.HOTEL);
        residenceBuilder.setArea(1000);
        residenceBuilder.setCountRooms(20);
        residenceBuilder.setCost(1_200_000);
        residenceBuilder.setAdress(adress);
    }
    public void buildApartment(ResidenceBuilder residenceBuilder,String adress){
        residenceBuilder.setResidenceType(ResidenceBuilder.ResidenceType.APARTMENT);
        residenceBuilder.setArea(120);
        residenceBuilder.setCountRooms(3);
        residenceBuilder.setCost(80_000);
        residenceBuilder.setAdress(adress);
    }
}
