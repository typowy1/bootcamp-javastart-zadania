package lekcja7_zadanie2_suma_kwadratow;

public class LoadNumbers {
    public static void main(String[] args) {

        LoadNumbersUtils loadNumbersUtils = new LoadNumbersUtils();
        double[] array = loadNumbersUtils.createArray();
        loadNumbersUtils.completeTheArray(array);
        loadNumbersUtils.showSumSquaresInfoFromArray(loadNumbersUtils.getSumSquaresFromArray(array));
    }
}
