package algorithm.sort;

/**
 * @author ���ĺ�
 * @date 2018/2/4
 */
public class Merge {

    //�鲢����ĸ�������
    private static int[] aux;

    public static void sort(int[] a) {
        //һ���Է���ռ�
        aux = new int[a.length];
        sort(a, 0, a.length - 1);
    }

    public static void sort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        //����������
        sort(a, low, mid);
        //���Ұ������
        sort(a, mid + 1, high);
        merge(a, low, mid, high);
    }

    /**
     * �÷����Ƚ�����Ԫ�ظ��Ƶ�aux[]�У�Ȼ���ڹ鲢��a[]�С�����զ�鲢ʱ(�ڶ���forѭ��)
     * ������4�������жϣ�
     * - �����þ�(ȡ�Ұ�ߵ�Ԫ��)
     * - �Ұ���þ�(ȡ���ߵ�Ԫ��)
     * - �Ұ�ߵĵ�ǰԪ��С�����ߵĵ�ǰԪ��(ȡ�Ұ�ߵ�Ԫ��)
     * - �Ұ�ߵĵ�ǰԪ�ش��ڵ������ߵĵ�ǰԪ��(ȡ���ߵ�Ԫ��)
     * @param a
     * @param low
     * @param mid
     * @param high
     */
    public static void merge(int[] a, int low, int mid, int high) {
        //��a[low..mid]��a[mid+1..high]�鲢
        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
            aux[k] = a[k];
        }

        for (int k = low; k <= high; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > high) {
                a[k] = aux[i++];
            } else if (aux[j] < aux[i]) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

}
