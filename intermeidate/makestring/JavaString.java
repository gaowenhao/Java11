package intermeidate.makestring;
/*
-----------------------------------------------------
    Author : 高文豪
    Github : https://github.com/gaowenhao
    Blog   : https://gaowenhao.cn
-----------------------------------------------------
*/

public class JavaString {
    private char[] data;

    JavaString(char[] data) {    // 接受用户的参数
        this.data = data;        // this指向当前对象，虽然这里有两个data，但是一个是局部的data，一个是属于当前对象的data。
    }

    void show() {
        for (int i = 0; i < this.data.length; i++) {
            System.out.print(data[i]);
        }
        System.out.print("\n");                                                            // 这里的\n是一个转义字符代表着换行
    }

    public static void main(String[] args) {
        JavaString js1 = new JavaString(new char[]{'你', '好', 'J', 'a', 'v', 'a'});
        js1.show();
        JavaString js2 = new JavaString(new char[]{'你', '好', '高', '文', '豪'});
        js2.show();
    }

    void reverse() {
        int length = data.length;                 // 先获取长度
        for (int i = 0; i < (length / 2); i++) {  // 实际上翻转一个字符数组就是第一位和最后一位交换，然后第二位和倒数第二位交换
            char temp = data[i];
            data[i] = data[length - i - 1];
            data[length - i - 1] = temp;
        }
    }

    boolean startWith(char ch) {                   // 判断字符串是否以某个字符开头
        int length = data.length;                 // 先获取长度
        if (length < 1) {                           // 如果长度小于1则没啥可继续的了
            return false;
        }
        return data[0] == ch;
    }
}
