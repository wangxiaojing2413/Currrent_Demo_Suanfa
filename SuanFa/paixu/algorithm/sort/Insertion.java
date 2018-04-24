package algorithm.sort;

/**
 * @author ���ĺ�
 * @date 2018/1/25
 */
public class Insertion {

    /**
     * ͨ���������в�������
     *
     * @param a
     */
    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }

    /**
     * ͨ�����ϴ��Ԫ�ض������ƶ��������ǽ�������Ԫ�أ�������������Ĵ������ܼ���
     *
     * @param a
     */
    public static void sort2(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int num = a[i + 1];
            for (int j = 0; j <= i; j++) {
                if (num < a[j]) {
                    for (int m = i; m >= j; m--) {
                        a[m + 1] = a[m];
                    }
                    a[j] = num;
                    break;
                }
            }
        }
    }
}
