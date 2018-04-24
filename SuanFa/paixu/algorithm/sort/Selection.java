package algorithm.sort;

/**
 * @author ���ĺ�
 * @date 2018/1/25
 */
public class Selection {
    public static void main(String[] args) {
        long staruTime = System.currentTimeMillis();
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++)
            num[i] = (int) (Math.random() * 100);

        for (int n : num)
            System.out.print(n + " ");
        System.out.println();

        sort(num);
        for (int i : num)
            System.out.print(i + " ");
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println((endTime - staruTime) + "ms");
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            //ѡ��֮���������ֵ��С��λ��
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            //��Сֵ�����ڵ�ǰֵʱ���н���
            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }


}
