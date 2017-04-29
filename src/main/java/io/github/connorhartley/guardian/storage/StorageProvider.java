/*
 * MIT License
 *
 * Copyright (c) 2017 Connor Hartley
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.github.connorhartley.guardian.storage;

/**
 * Storage Provider
 *
 * Represents a storage system that can load and store objects to
 * a specific location.
 *
 * @param <T> The type of storage container location
 */
public interface StorageProvider<T> {

    /**
     * Create
     *
     * <p>Requests the creation of this storage container. Used
     * with the exists check can prove to be a good way to not override
     * existing data.</p>
     */
    void create();

    /**
     * Load
     *
     * <p>Requests the load of this storage container.</p>
     */
    void load();

    /**
     * Update
     *
     * <p>Requests the update of data to the storage container.</p>
     */
    void update();

    default boolean exists() {
        return false;
    }

    /**
     * Get Location
     *
     * <p>Returns the location of a storage container.</p>
     *
     * @return The location of a storage container
     */
    T getLocation();

}
