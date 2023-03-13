package ADeathMatch;

public class Match {
    int maxWeight;
    int minWeight;
    Fighter f1;
    Fighter f2;



    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        System.out.println("İlk atak yapanın belirlenmesi için yazı tura atılıyor..");
        if (isStart()) {
            System.out.println(f1.name + " başlıyor..");
            this.f1 = f1;
            this.f2 = f2;
        } else {
            System.out.println(f2.name + " başlıyor..");
            this.f1 = f2;
            this.f2 = f1;
        }
    }

    void run() {
            if (isCheck()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("-------YENİ ROUND-------");
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    checkHealth();
                }



        }


    }

    boolean isCheck() {

        if ((this.f1.weight >= 85 && this.f1.weight <= 100) && (this.f2.weight >= 85 && this.f2.weight <= 100)) {
            return true;
        } else {
            return false;
        }


    }

    boolean isWin() {
        if (this.f1.health <= 0) {
            System.out.println(f2.name + " kazandı!");
            return true;

        } else if (this.f2.health <= 0) {
            System.out.println(f1.name + " kazandı!");
            return true;
        }
        return false;
    }

    void checkHealth() {
        System.out.println(this.f1.name + " : "+this.f1.health+" HP");
        System.out.println(this.f2.name + " : "+this.f2.health+ " HP");
    }
    boolean isStart () {
        double randomNumber = Math.random() * 100;
        return 50<= randomNumber;
    }



}
