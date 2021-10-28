class Army {

    public static void createArmy() {
       Unit joe = new Unit("joe");
       Unit shit = new Unit("shit");
       Unit bastard = new Unit("bastard");
       Unit fucky = new Unit("fucky");
       Unit bitch = new Unit("bitch");
       
       Knight seb = new Knight("seb");
       Knight rod = new Knight("rod");
       Knight tirja = new Knight("tirja");
       
       General patton = new General("patton");
       
       Doctor vain = new Doctor("vain");
       
       
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}
