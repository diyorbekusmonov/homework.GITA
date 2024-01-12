package Enums.Homework_2;

public enum Animal {
    DOG() {
        @Override
        public void soundAnimals() {
            super.soundAnimals();
            System.out.println("wow wow");
        }
    },
    CAT() {
        @Override
        public void soundAnimals() {
            super.soundAnimals();
            System.out.println("mioow");
        }
    },
    SHEP() {
        @Override
        public void soundAnimals() {
            super.soundAnimals();
            System.out.println("baaaa");
        }
    },
    COW() {
        @Override
        public void soundAnimals() {
            super.soundAnimals();
            System.out.println("moooow");
        }
    },
    ROOSTER() {
        @Override
        public void soundAnimals() {
            super.soundAnimals();
            System.out.println("quq ququ quuu");
        }
    };

    public void soundAnimals() {
    }
}
