package intermeidate.girl;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import intermeidate.common.*;

public class TypeThreeGirl extends Girl implements Beautiful, Brave, Lovely, Mature, Talented, Mammonish {

    private int goodFeeling = 0;

    // 这种女人想要认识她,你必须开一辆车，如果没有车你不能认识她.
    TypeThreeGirl(String name, int age, Car car) {
        this.name = name;
        this.age = age;

        if (car.price < 50000) {
            this.goodFeeling = -50;
        } else if (car.price < 10000) {
            this.goodFeeling = 0;
        } else if (car.price < 500000) {
            this.goodFeeling = 30;
        } else if (car.price < 1500000) {
            this.goodFeeling = 90;
        } else {
            this.goodFeeling = 100;
            System.out.print("I love you");         // 虽然输出了i love you但是并没有改变自身的LoveYou属性.
        }
    }

    public void beBeautiful() {
        System.out.print("漂亮！");
    }

    public void beBrave() {
        // 虽然覆盖了这个方法，但是并没有实现
    }

    public void beLovely() {
        // 虽然覆盖了这个方法，但是并没有实现
    }

    public void beMature() {
        // 虽然覆盖了这个方法，但是并没有实现
    }

    public void beTalented() {
        // 虽然覆盖了这个方法，但是并没有实现
    }

    public void beMammonish() {
        System.out.print("相比爱情更崇尚金钱,这使得自身的好感值取决于调用者的财力，别吐槽我只是为了方便大家理解.");
    }
}
