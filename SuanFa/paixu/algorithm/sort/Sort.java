package algorithm.sort;

/**
 * @author ���ĺ�
 * @date 2018/1/25
 */
public class Sort {
    public static void main(String[] args) {
        long staruTime = System.currentTimeMillis();
//        int[] a = {10, 2, 6, 3, 50, 26, 34, 6};
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 100);
        System.out.print("����ǰ: ");
        for (int n : a)
            System.out.print(n + " ");
        System.out.println();

        //��������
//        Insertion.sort(a);
        //ϣ������
//        Shell.sort(a);
        //ѡ������

//������
//        Heap.sort(a);
        //ð������
//        Bubble.sort(a);
//        ��������
//        Quick.sortByStack(a);
//        Quick.sort(a, 0, a.length - 1);
        Quick.sortThreeWay(a, 0, a.length - 1);
        //�鲢����
//        Merge.sort(a);

        System.out.print("�����: ");
        for (int i : a)
            System.out.print(i + " ");
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println((endTime - staruTime) + "ms");
    }
}
