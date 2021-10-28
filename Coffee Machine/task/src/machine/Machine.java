

package machine;

public class Machine {
    private int water;
    private int beans;
    private int milk;
    private int disposableCups;
    private int money;

    public Machine(int water, int beans, int milk, int disposableCups, int money) {
        this.water = water;
        this.beans = beans;
        this.milk = milk;
        this.disposableCups = disposableCups;
        this.money = money;

    }


    public void buyEspresso() {
        this.water = this.water - 250;
        this.beans = this.beans - 16;
        this.money = this.money + 4;
        this.disposableCups--;
    }

    public void buyLatte() {
        this.water -= 350;
        this.beans -= 20;
        this.milk -= 75;
        this.money += 7;
        this.disposableCups--;
    }

    public void buyCappuccino() {
        this.water -= 200;
        this.beans -= 12;
        this.milk -= 100;
        this.money += 6;
        this.disposableCups--;
    }

    public int getCups() {
        return this.disposableCups;
    }

    public int getMoney() {
        return this.money;
    }

    public int getWater() {
        return this.water;
    }

    public int getMilk() {
        return this.milk;
    }

    public int getBeans() {
        return this.beans;
    }

    public void addWater(int amount) {
        this.water = this.water + amount;
    }

    public void addBeans(int amount) {
        this.beans = this.beans + amount;
    }

    public void addMilk(int amount) {
        this.milk = this.milk + amount;
    }

    public void addCups(int amount) {
        this.disposableCups += amount;
    }

    public void takeMoney() {
        this.money = 0;
    }

    public boolean canMakeEspresso() {
        return this.getWater() >= 250 && this.getBeans() >= 16;
    }

    public boolean canMakeLatte() {
        return this.getWater() >= 350 && this.getMilk() >= 75 && this.getBeans() >= 20;
    }

    public boolean canMakeCappuccino() {
        return this.getWater() >= 200 && this.getMilk() >= 100 && this.getBeans() >= 12;
    }

    public String espressoResources() {
        StringBuilder espresso = new StringBuilder();
        String espressoIngredients;
        if (this.getWater() < 250) {
            espresso.append("water");
        }
        if (this.getBeans() < 16) {
            espresso.append("beans");
        }
        if (this.getCups() == 0) {
            espresso.append("cups");
        }
        espressoIngredients = espresso.toString();
        return espressoIngredients;
    }

    public String latteResources() {
        StringBuilder latte = new StringBuilder();
        String latteIngredients;
        if (this.getWater() < 350) {
            latte.append("water");
        }
        if (this.getBeans() < 20) {
            latte.append("beans");
        }
        if (this.getMilk() < 75) {
            latte.append("milk");
        }
        if (this.getCups() == 0) {
            latte.append("cups");
        }
        latteIngredients = latte.toString();
        return latteIngredients;
    }

    public String cappuccinoResources() {
        StringBuilder cappuccino = new StringBuilder();
        String cappuccinoIngredients;
        if (this.getWater() < 200) {
            cappuccino.append("water");
        }
        if (this.getBeans() < 12) {
            cappuccino.append("beans");
        }
        if (this.getMilk() < 100) {
            cappuccino.append("milk");
        }
        if (this.getCups() == 0){
            cappuccino.append("cups");
        }
        cappuccinoIngredients = cappuccino.toString();
        return cappuccinoIngredients;
    }

}





