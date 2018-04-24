package algorithm.sort;

/**
 * @author ���ĺ�
 * @date 2018/2/3
 */
public class Heap {

    public static void main(String[] args) {
        int[] a = {10, 2, 6, 3, 50, 26, 34, 6};
//        int[] a = new int[20];
//        for (int i = 0; i < a.length; i++)
//            a[i] = (int) (Math.random() * 10000);
//        num[0] = 0;
        System.out.print("����ǰ: ");
        for (int n : a)
            System.out.print(n + " ");
        System.out.println();
        Heap.sort(a);
        System.out.print("�����: ");
        for (int i : a)
            System.out.print(i + " ");
    }

    /**
     * @param a
     */
    public static void sort(int[] a) {

        for (int i = a.length - 1; i > 0; i--) {
            max_heapify(a, i);

            //�Ѷ�Ԫ��(��һ��Ԫ��)��Kn����
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
        }
    }

    /***
     *
     *  ������ѻ�
     *  i = ��һ����Ҷ�ӽڵ㡣
     *  �ӵ�һ����Ҷ�ӽڵ㿪ʼ���ɡ���������һ��Ҷ�ӽڵ㿪ʼ��
     *  Ҷ�ӽڵ���Կ����ѷ��϶�Ҫ��Ľڵ㣬���ڵ�������Լ����Լ�����ֵΪ���
     *
     * @param a
     * @param n
     */
    public static void max_heapify(int[] a, int n) {
        int child;
        for (int i = (n - 1) / 2; i >= 0; i--) {
            //���ӽڵ�λ��
            child = 2 * i + 1;
            //���ӽڵ�����Ҵ������ӽڵ㣬child������ӽڵ�
            if (child != n && a[child] < a[child + 1]) {
                child++;
            }
            //�������ڵ��������ӽڵ��е����ֵ
            if (a[i] < a[child]) {
                int temp = a[i];
                a[i] = a[child];
                a[child] = temp;
            }
        }
    }
}

