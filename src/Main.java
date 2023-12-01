//Q1) מהי מחלקה? למה כדאי להשתמש במחלקות בתוכנית שלנו?
     /*
     . היא מכילה משתנים (פרמטרים) ופעולות (שיטות) המתארות את התכלית וההתנהגות של העצם.
     בעזרת מחלקות, ניתן ליצור את המבנה התוכנתי של התכנית ולקבוע דרך יעילה לנהל את המידע והפעולות בתוך התכנית

      */


public class Main {
    public static void main(String[] args) {

        Dog myDog = createDog("Buddy", 3, "Golden Retriever");
            Dog.Bark();

    }

    public static Dog createDog(String name, int age, String breed) {
        return new Dog(name, age, breed);
    }

    public static Meal createMeals(String name, boolean vegetarian, double price) {
        return new Meal(name, vegetarian, (float) price);
    }

    public static House createHouses(String address, float areaInSquareMeters, String ownerName) {
        return new House(address, areaInSquareMeters, ownerName);
    }

    public static House createHouses(String address, float areaInSquareMeters) {
        return new House(address, areaInSquareMeters);
    }


}
