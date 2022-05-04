package by.epam.task01.service.impl;

import by.epam.task01.entity.CustomArray;
import by.epam.task01.exception.CustomArrayException;
import by.epam.task01.service.CustomArrayService;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;


public class CustomArrayServiceImpl implements CustomArrayService {

    @Override
    public int findMax(CustomArray array) {
        int[] current = array.getArray();
        int max = current[0];

        for (int i = 1; i < current.length; i++) {
            if (max < current[i]) {
                max = current[i];
            }
        }
        return max;
    }

    public int maxStream(CustomArray array) {
        int[] digit = array.getArray();
        return IntStream.of(digit).max().getAsInt();
    }

    @Override
    public int findMin(CustomArray array) {
        int[] current = array.getArray();
        int min = current[0];

        for (int i = 1; i < current.length; i++) {
            if (min > current[i]) {
                min = current[i];
            }
        }
        return min;
    }

    public int minStream(CustomArray array) {
        int[] digit = array.getArray();
        return IntStream.of(digit).min().getAsInt();
    }

    @Override
    public int sumOfElements(CustomArray array) {
        int[] current = array.getArray();
        int sum = 0;
        for (int num : current) {
            sum+ =  num;
        }
        return sum;
    }

    @Override
    public int positiveElements(CustomArray array) {
        int[] current = array.getArray();
        int countPositive = 0;
        for (int element : current) {
            if (element > 0) {
                countPositive++;
            }
        }

        return countPositive;
    }

    @Override
    public int negativeElements(CustomArray array) {
        int[] current = array.getArray();
        int count = 0;

        for (int element : current) {
            if (element < 0) {
                count++;
            }
        }
        return count;
    }

    public int[] bubbleSorted(CustomArray array) {
        int[] num = array.getArray();
        for (int i = num.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        return num;
    }

    public void merge(CustomArray array, int low, int high) {
        if (high <= low) return;
        int mid = (low + high) / 2;
        merge(array, low, mid);
        merge(array, mid + 1, high);
        mergeSort(array, low, mid, high);

    }

    public static void mergeSort(CustomArray array, int low, int mid, int high) {
        int[] num = array.getArray();

        int leftArray[] = new int[mid - low + 1];
        int rightArray[] = new int[high - mid];

        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = (int) num[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = (int) num[mid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = low; i < high + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    num[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    num[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                num[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                num[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
