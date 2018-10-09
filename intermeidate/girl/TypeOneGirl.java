package intermeidate.girl;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import intermeidate.common.Brave;
import intermeidate.common.Girl;
import intermeidate.common.Lovely;

public class TypeOneGirl extends Girl implements Brave, Lovely {

    private int goodFeeling = 0;

    TypeOneGirl(String name, int age) {
        this.name = name;
        this.age = age;
        this.goodFeeling = 50;                            // 这种女孩生来就容易对别人产生好感
    }

    // 这种女孩你要经常陪她玩游戏会积累好感值.
    public void playGameWithMe() {
        this.goodFeeling += 1;
        if (this.goodFeeling > 100) {
            this.loveYou = true;
            System.out.println("I love you.");
        }
    }

    public void beLovely() {
        System.out.println("非常可爱!");                    // 这里虽然我们只做输出，但实际上意味着这个类型的女孩确实实现了这个接口
    }

    public void beBrave() {
        System.out.println("非常勇敢!");                    // 这里虽然我们只做输出，但实际上意味着这个类型的女孩确实实现了这个接口
    }
}