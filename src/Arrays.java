public class Arrays {

    public static int minimumDistances(int[] a) {
        int minimumDistance = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    if ((j - i) < minimumDistance) minimumDistance = j - i;
                }
            }
        }
        return minimumDistance == Integer.MAX_VALUE ? -1 : minimumDistance;
    }
}
