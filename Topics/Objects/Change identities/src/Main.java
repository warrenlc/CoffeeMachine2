
class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String holderName = p1.name;
        int holderAge = p1.age;
        
        p1.name = p2.name;
        p2.name = holderName;
        
        p1.age = p2.age;
        p2.age = holderAge;

    }
}
