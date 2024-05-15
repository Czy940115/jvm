package method;

/**
 * ClassName: Demo1
 * Package: method
 * Description:
 *      使用字节码文件，分析i=i++；的结果结果为0
 * @Author Chen Ziyun
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        int i = 0;
        i = i++;
        System.out.println(i);
    }
}
