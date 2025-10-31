package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.List;

/**
 * A <code>CopyEvent</code> logs a copy of a value into an index of the array.
 */
public class CopyEvent<T> implements SortEvent<T>{
    private List<Integer> affectedIndicies;
    private T copy;
    // TODO: implement me!

    public CopyEvent(List<Integer> list, T copy) {
        affectedIndicies = list;
        this.copy = copy;
    }

    /**
     * Applies this event to the array.
     * @param arr the array to modify
     */
    public void apply(T[] arr) {
        arr[affectedIndicies.get(0)] = copy;
    }

    /**
     * @return a list of the indices affected by this event
     */
    public List<Integer> getAffectedIndices() {
        return affectedIndicies;
    }

    /**
     * @return <code>true</code> iff this event is emphasized
     */
    public boolean isEmphasized() {
        return true;
    }
}
