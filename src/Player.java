public class Player {

    private String name;
    private int healthPercentage;

    enum Weapon {
        PARABELLUM
    }
    public Player(String _name, int _healthPercentage) {
        if (_healthPercentage > 100) {
            healthPercentage = 100;
        } else if (_healthPercentage < 0) {
            healthPercentage = 0;
        } else {
            healthPercentage = _healthPercentage;
        }
        name = _name;
    }
    public int healthRemaining() {
        return healthPercentage;
    }
    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage < 0) {
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth (int healthPotion) {
        healthPercentage = healthPercentage + healthPotion;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }
}
