package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.List;

/**
 * A <code>SwapEvent</code> logs a swap between two indices of the array.
 */
public class SwapEvent<T> implements SortEvent<T>{
    private List<Integer> affectedIndicies;

    public SwapEvent(List<Integer> list) {
        affectedIndicies = list;
    }

    /**
     * swaps the two values in the given array at the two indicies in affectedIndicies
     * @param arr the array to modify
     */
    public void apply(T[] arr) {
        swap(arr, affectedIndicies.get(0), affectedIndicies.get(1));
    }

    private void swap(T[] arr, int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    /**
     * @return a list of the indices affected by this event
     */
    @Override
    public List<Integer> getAffectedIndices() {
        return affectedIndicies;
    }

    /**
     * @return <code>true</code> iff this event is emphasized
     */
    @Override
    public boolean isEmphasized() {
        return true;
    }
}
