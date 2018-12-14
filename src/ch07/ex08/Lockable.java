package ch07.ex08;

/**
 * Lockable
 */
public interface Lockable {
    /**
     * Sets the key to a certain key.
     * There is no way to get the key, and this is by design, so make sure you have a copy.
     * @param key
     */
    public void setKey(int key);
    /**
     * Check if the object is locked.
     * @return
     */
    public boolean isLocked();
    /**
     * Locks the object so that no methods can be used.
     * @param key
     */
    public void lock(int key);
    /**
     * Unlocks the object so that it's methods can be used.
     * @param key
     */
    public void unlock(int key);
}