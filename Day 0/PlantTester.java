public class PlantTester {
    
    public static void main(String[] args) {
        System.out.println("yo whaddup!!!");

        
        Plant p1plant = new Plant();
        Plant p1plant2 = new Plant(5);
        Plant chomper = new Plant();
        if (p1plant.equals(p1plant2)){
            System.out.println("They are the same");
        }
        else {
            System.out.println("They are not the same");
        }
        chomper.drink();
        chomper.getolder();
        chomper.eat();
        System.out.println(chomper.toString());
        p1plant.drink();
        p1plant.eat();
        p1plant.getolder();
        p1plant2.die();
        System.out.println(p1plant2.toString());
        System.out.println(p1plant.toString());
        if (p1plant.equals(chomper)){
            System.out.println("They are the same");
        }
        else {
            System.out.println("They are not the same");
        }
    }
}
