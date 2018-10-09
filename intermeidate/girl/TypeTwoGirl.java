package intermeidate.girl;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

import intermeidate.common.Beautiful;
import intermeidate.common.Girl;
import intermeidate.common.Mature;
import intermeidate.common.Talented;

public class TypeTwoGirl extends Girl implements Mature, Beautiful, Talented {

    private int goodFeeling = 0;

    TypeTwoGirl(String name, int age) {
        this.name = name;
        this.age = age;
        this.goodFeeling = 0;
    }

    // 这种女孩你要常常陪她说话, 她便会爱上你.
    public void talkWithMe() {
        this.goodFeeling += 1;
        if (this.goodFeeling > 100) {
            this.loveYou = true;
            System.out.println("I love you.");
        }
    }

    public void beBeautiful() {
        System.out.println("非常漂亮!");                    // 这里虽然我们只做输出，但实际上意味着这个类型的女孩确实实现了这个接口
    }

    public void beMature() {
        System.out.println("非常成熟!");                    // 这里虽然我们只做输出，但实际上意味着这个类型的女孩确实实现了这个接口
    }

    public void beTalented() {
        System.out.println("富有才华!");                    // 这里虽然我们只做输出，但实际上意味着这个类型的女孩确实实现了这个接口
    }
}
