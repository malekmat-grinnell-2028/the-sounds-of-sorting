package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.List;

/**
 * A <code>CompareEvent</code> logs a comparison a sort makes between two
 * indices in the array.
 */
public class CompareEvent<T> implements SortEvent<T> {
    private List<Integer> affectedIndicies;
    // TODO: implement me!

    public CompareEvent(List<Integer> list) {
        this.affectedIndicies = list;
    }

    /**
     * Applies this event to the array.
     * @param arr the array to modify
     */
    public void apply(T[] arr) {
        //does nothing
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
        return false;
    }
}
