public class Manager {
    public synchronized void updatePrintInfo(int[] array, int value){
            for (int i = 0; i < array.length; i++){
                array[i] = value;
            }

            for (int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
    }
}
