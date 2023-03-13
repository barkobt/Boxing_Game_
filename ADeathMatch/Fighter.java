package ADeathMatch;

public class Fighter {
    String name;
    int weight;

    int health;
    int damage;
    double dodge;

    Fighter(String name,int damage,int health, int weight,double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }
    int hit(Fighter rival) {
            System.out.println(this.name + " => "+rival.name +"'a "+this.damage + " hasar vurdu.");
        if (rival.dodge()) {
            System.out.println(rival.name + " gelen hasarı savuşturdu.");
            return rival.health;
        }
        return rival.health-this.damage;

    }
    boolean dodge () {
        double randomValue = Math.random() * 100;
        return this.dodge <= randomValue;
    }

}
