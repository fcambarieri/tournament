/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thorplatform.swing;

import java.util.*;

/**
 *
 * @author fcambarieri
 */
public class MapProperty<K, V> {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public interface MapListener<K, V> {

        void onDataChange();

        void onAddKey(K key);

        void onDeleteKey(K key);

        void onAddKeyItem(K key, V value);

        void onDeleteKeyItem(K key, V value);
    }
    private Map<K, List<V>> map;
    private List<MapListener<K, V>> listeners;
    private String name;

    public MapProperty(String name) {
        map = new HashMap<K, List<V>>();
        listeners = new ArrayList<MapListener<K, V>>();
        this.name = name;
    }

    public Map<K, List<V>> getMap() {
        return map;
    }

    public void setMap(Map<K, List<V>> map) {
        if (map.size() > 0) {
            this.map.clear();
        }
        this.map.putAll(map);

        fireDataChange();
    }

    public synchronized void addMapListener(MapListener<K, V> mapListener) {
        listeners.add(mapListener);
    }

    public synchronized void removeMapListener(MapListener<K, V> mapListener) {
        listeners.remove(mapListener);
    }

    @SuppressWarnings("unchecked")
    public void add(K key, List<V> list) {
        map.put(key, list);

        fireOnAddKey(key);
    }

    @SuppressWarnings("unchecked")
    public void addKeyItem(K key, V value) {
        map.get(key).add(value);

        fireOnAddKeyItem(key, value);
    }

    @SuppressWarnings("unchecked")
    public void remove(K key) {
        map.remove(key);

        fireOnDeleteKey(key);
    }

    public void removeKeyItem(K key, V value) {
        List<V> list = map.get(key);
        if (list.contains(value)) {
            int index = list.indexOf(value);

            list.remove(index);
            
            fireOnDeleteKeyItem(key, value);
        }

    }

    public Set<K> getKeys() {
        return map.keySet();
    }

    public List<V> get(K key) {
        return map.get(key);
    }

    public K getValue(V value) {
        Iterator<K> keys = getKeys().iterator();
        while (keys.hasNext()) {
            K key = keys.next();
            if (map.get(key).contains(value)) {
                return key;
            }
        }
        return null;
    }

    public void clear() {
        map.clear();

        fireDataChange();
    }

    @SuppressWarnings("unchecked")
    private void fireDataChange() {
        for (MapListener listener : listeners) {
            listener.onDataChange();
        }
    }

    @SuppressWarnings("unchecked")
    private void fireOnAddKey(K key) {
        for (MapListener listener : listeners) {
            listener.onAddKey(key);
        }
    }

    @SuppressWarnings("unchecked")
    private void fireOnDeleteKey(K key) {
        for (MapListener listener : listeners) {
            listener.onDeleteKey(key);
        }
    }

    @SuppressWarnings("unchecked")
    private void fireOnAddKeyItem(K key, V value) {
        for (MapListener listener : listeners) {
            listener.onAddKeyItem(key, value);
        }
    }

    @SuppressWarnings("unchecked")
    private void fireOnDeleteKeyItem(K key, V value) {
        for (MapListener listener : listeners) {
            listener.onDeleteKeyItem(key, value);
        }
    }
}
