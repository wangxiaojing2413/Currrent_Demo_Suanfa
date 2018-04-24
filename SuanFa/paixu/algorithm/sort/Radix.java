package algorithm.sort;

import java.util.Arrays;

/**
 * @author ���ĺ�
 * @date 2018/2/5
 */
public class Radix {
    public static void sort(int[] arr) {
        if (arr.length <= 1) return;

        //ȡ�������е����������ȡ��λ��
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int maxDigit = 1;
        while (max / 10 > 0) {
            maxDigit++;
            max = max / 10;
        }
        //����һ��Ͱ�ռ�
        int[][] buckets = new int[10][arr.length];
        int base = 10;

        //�ӵ�λ����λ����ÿһλ������������Ԫ�ط��䵽Ͱ��
        for (int i = 0; i < maxDigit; i++) {
            int[] bktLen = new int[10];        //�洢����Ͱ�д洢Ԫ�ص�����

            //���䣺������Ԫ�ط��䵽Ͱ��
            for (int j = 0; j < arr.length; j++) {
                int whichBucket = (arr[j] % base) / (base / 10);
                buckets[whichBucket][bktLen[whichBucket]] = arr[j];
                bktLen[whichBucket]++;
            }

            //�ռ�������ͬͰ�����ݰ����̳���,Ϊ��һ�ָ�λ������׼��,���ڿ���Ͱ�׵�Ԫ��������ǰ,��˴�Ͱ������
            int k = 0;
            for (int b = 0; b < buckets.length; b++) {
                for (int p = 0; p < bktLen[b]; p++) {
                    arr[k++] = buckets[b][p];
                }
            }
            System.out.println("Sorting: " + Arrays.toString(arr));
            base *= 10;
        }
    }
}
