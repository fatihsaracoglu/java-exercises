public class SeparatingList {

    public static void main(String[] args) {
        int[] shortLengthArray = new int[]{8, 10, -6, -7, 9};
        int[] mediumLengthArray = new int[]{46, 39, -45, -2, -5, -6, -17, -32, 17};
        int[] lengthyArray = new int[]{-16, 44, -7, -31, 9, -43, -44, -18, 50, 39, -46, -24, 3, -34, -27};
        printArray(wheatFromChaff(shortLengthArray));
        printArray(wheatFromChaff(mediumLengthArray));
        printArray(wheatFromChaff(lengthyArray));
    }

    public static int[] wheatFromChaff(int[] values) {
        int[] newValues = values.clone();
        int first = 0;
        int last = newValues.length - 1;
        for (int i = 0; i < values.length && i < last; i++) {
            if (newValues[i] > 0) {
                while (newValues[last] > 0 && i < last) {
                    last--;
                }
                int temp = newValues[i];
                newValues[i] = newValues[last];
                newValues[last] = temp;
            }
        }
        return newValues;
    }

    public static void printArray(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            if (arr.length - i != 1)
                s += ", ";
        }
        s += "]";
        System.out.println(s);
    }
}