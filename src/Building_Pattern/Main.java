package Building_Pattern;

public class Main {
    public static void main(String[] args) {
        ResidenceDirector residenceDirector=new ResidenceDirector();
        ConcreteResidenceBuilder concreteResidenceBuilder=new ConcreteResidenceBuilder();
        residenceDirector.buildHome(concreteResidenceBuilder,"Tashkent");
        Residence residence=concreteResidenceBuilder.build();
        System.out.println(residence);
    }
}
