/*使用 union ()方法来计算两个数组的并集*/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class ArrayUnion {
    public static void main(String[] args) throws Exception {
        String[] arr1 = { "1", "2", "3" };
        String[] arr2 = { "4", "5", "6" };
        String[] result_union = union(arr1, arr2);
        System.out.println("并集的结果如下：");

        for (String str : result_union) {
            System.out.println(str);
        }
    }

    // 求两个字符串数组的并集，利用set的元素唯一性
    public static String[] union(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<String>();

        for (String str : arr1) {
            set.add(str);
        }

        for (String str : arr2) {
            set.add(str);
        }

        String[] result = {  };

        return set.toArray(result);
    }
}
