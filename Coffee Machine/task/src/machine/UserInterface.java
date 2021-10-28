package machine;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;


    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        Machine machine = new Machine(400, 120, 540, 9, 550);


        while(true) {
            String action = writeAction();
            if (action.equals("exit")) {
                break;
            }
            if (action.equals("remaining")) {
                printStatus(machine);
            }
            if (action.equals("buy")) {
                buy(machine);
            }
            if (action.equals("fill")) {
                fill(machine);
            }
            if (action.equals("take")) {
                take(machine);
            }
        }

    }

    public static void printStatus(Machine machine) {
        System.out.println("The coffee machine has: \n" +
                machine.getWater() + " ml of water \n" +
                machine.getMilk() + " ml of milk \n" +
                machine.getBeans() + " g of coffee beans \n" +
                machine.getCups() + " disposable cups \n" +
                "$" + machine.getMoney() + " of money");
    }

    public void buy(Machine machine) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String toBuy = scanner.nextLine();
        label:
        while(true) {
            if (toBuy.equals("back")) {
                break;
            }
            switch (toBuy) {
                case "1":
                    if (machine.canMakeEspresso()) {
                        makingCoffee();
                        machine.buyEspresso();
                        break label;
                    } else {
                        noCoffee(machine, "espresso");
                        break label;
                    }
                case "2":
                    if (machine.canMakeLatte()) {
                        makingCoffee();
                        machine.buyLatte();
                        break label;
                    } else {
                        noCoffee(machine, "latte");
                        break label;
                    }
                case "3":
                    if (machine.canMakeCappuccino()) {
                        makingCoffee();
                        machine.buyCappuccino();
                        break label;
                    } else {
                        noCoffee(machine, "cappuccino");
                        break label;
                    }
            }
        }
    }

    public String writeAction() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        return scanner.nextLine();
    }

    public void makingCoffee() {
        System.out.println("I have enough resources, making you a coffee!");
    }

    public void noCoffee(Machine machine, String coffee) {
        StringBuilder resource = new StringBuilder();
        switch (coffee) {
            case("espresso"): resource.append(machine.espressoResources());
                break;
            case("latte"): resource.append(machine.latteResources());
                break;
            case("cappuccino"): resource.append(machine.cappuccinoResources());
                break;
        }
        System.out.printf("Sorry, not enough %s!%n", resource);
    }


    public void fill(Machine machine) {

        System.out.println("Write how many ml of water you want to add:");
        int fillWater = Integer.parseInt(scanner.nextLine());
        machine.addWater(fillWater);

        System.out.println("Write how many ml of milk you want to add:");
        int fillMilk = Integer.parseInt(scanner.nextLine());
        machine.addMilk(fillMilk);

        System.out.println("Write how many grams of coffee beans you want to add:");
        int fillBeans = Integer.parseInt(scanner.nextLine());
        machine.addBeans(fillBeans);

        System.out.println("Write how many disposable cups of coffee you want to add:");
        int fillCups = Integer.parseInt(scanner.nextLine());
        machine.addCups(fillCups);

    }

    public void take(Machine machine) {
        System.out.println("I gave you $" + machine.getMoney());
        machine.takeMoney();
    }

}
