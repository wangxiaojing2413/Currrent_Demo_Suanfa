package algorithm.sort;

/**
 * @author ÀîÎÄºÆ
 * @date 2018/1/25
 */
public class Sort {
    public static void main(String[] args) {
        long staruTime = System.currentTimeMillis();
//        int[] a = {10, 2, 6, 3, 50, 26, 34, 6};
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 100);
        System.out.print("ÅÅĞòÇ°: ");
        for (int n : a)
            System.out.print(n + " ");
        System.out.println();

        //²åÈëÅÅĞò
//        Insertion.sort(a);
        //Ï£¶ûÅÅĞò
//        Shell.sort(a);
        //Ñ¡ÔñÅÅĞò

//¶ÑÅÅĞò
//        Heap.sort(a);
        //Ã°ÅİÅÅĞò
//        Bubble.sort(a);
//        ¿ìËÙÅÅĞò
//        Quick.sortByStack(a);
//        Quick.sort(a, 0, a.length - 1);
        Quick.sortThreeWay(a, 0, a.length - 1);
        //¹é²¢ÅÅĞò
//        Merge.sort(a);

        System.out.print("ÅÅĞòºó: ");
        for (int i : a)
            System.out.print(i + " ");
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println((endTime - staruTime) + "ms");
    }
}
