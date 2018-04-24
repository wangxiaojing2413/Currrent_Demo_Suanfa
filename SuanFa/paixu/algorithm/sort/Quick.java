package algorithm.sort;

import java.util.Stack;

/**
 * Created by think on 2016/9/16.
 */
public class Quick {
    public static void sort(int[] a, int low, int high) {
        //�Ѿ�����
        if (low >= high) {
            return;
        }
        int left = low;
        int right = high;

        //�����׼ֵ
        int pivot = a[left];
        while (left < right) {
            //�Ӻ���ǰ�ҵ��Ȼ�׼С��Ԫ��
            while (left < right && a[right] >= pivot)
                right--;
            a[left] = a[right];
            //��ǰ�����ҵ��Ȼ�׼���Ԫ��
            while (left < right && a[left] <= pivot)
                left++;
            a[right] = a[left];
        }
        // ���û�׼ֵ��׼�����εݹ����
        a[left] = pivot;
        sort(a, low, left - 1);
        sort(a, left + 1, high);
    }


    public static void sortThreeWay(int[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int v = a[lo], lt = lo, i = lo + 1, gt = hi;
        while (i <= gt) {
            if (a[i] < v) {
                swap(a, i++, lt++);
            } else if (a[i] > v) {
                swap(a, i, gt--);
            } else {
                i++;
            }
        }
        sortThreeWay(a, lo, lt - 1);
        sortThreeWay(a, gt + 1, hi);
    }

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void sortByStack(int[] a) {
        Stack<Integer> stack = new Stack<Integer>();

        //��ʼ״̬������ָ����ջ
        stack.push(0);
        stack.push(a.length - 1);
        while (!stack.isEmpty()) {
            //��ջ���л���
            int high = stack.pop();
            int low = stack.pop();

            int pivotIndex = partition(a, low, high);

            //�����м����
            if (pivotIndex > low) {
                stack.push(low);
                stack.push(pivotIndex - 1);
            }
            if (pivotIndex < high && pivotIndex >= 0) {
                stack.push(pivotIndex + 1);
                stack.push(high);
            }
        }
    }

    private static int partition(int[] a, int low, int high) {
        if (low >= high) return -1;
        int left = low;
        int right = high;
        //�����׼��ֵ
        int pivot = a[left];
        while (left < right) {
            //�Ӻ���ǰ�ҵ��Ȼ�׼С��Ԫ�أ����뵽��׼λ����
            while (left < right && a[right] >= pivot) {
                right--;
            }
            a[left] = a[right];
            //��ǰ�����ҵ��Ȼ�׼���Ԫ��
            while (left < right && a[left] <= pivot) {
                left++;
            }
            a[right] = a[left];
        }
        //���û�׼ֵ��׼�����εݹ����
        a[left] = pivot;
        return left;
    }
}
