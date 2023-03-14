package practice8;

import java.util.*;

public class Cleric {

    String name;
    int hp = 50;
    static final int MAX_HP = 50;
    int mp = 10;
    static final int MAX_MP = 10;

   // A
    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }
    
    // B
    Cleric(String name, int hp) {
        this(name, hp, MAX_MP);
    }
    
    // C
    Cleric(String name) {
        this(name, MAX_HP, MAX_MP);
    }


    void selfAid() {
        if (this.hp < MAX_HP) {
            this.mp -= 5;
            this.hp = MAX_HP;
        }
    }

    public int pray(int prayTime) {

        Random rand = new Random();
        // 회복하는 값을 구하고
        int recoveryMP = prayTime + rand.nextInt(3);


        // if문 안에는 현재 MP + 회복값이 MAXMP를 넘는지 체크하고
        if (this.mp + recoveryMP < MAX_MP) {
            this.mp += recoveryMP; // 현제mp += 회복값
            return recoveryMP; // return 회복값 ( 초 + 랜덤값 )
        } else {
            this.mp = MAX_MP; // 현재 mp = 최대 MP
            return MAX_MP - this.mp; // return값은 최대MP - 현재MP
        }

    }

}


