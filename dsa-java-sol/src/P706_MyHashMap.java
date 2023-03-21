import java.util.ArrayList;
import java.util.List;

public class P706_MyHashMap {
    List<Pair>[] arr;
    public P706_MyHashMap() {
        this.arr = new List[100];
        for(int i = 0; i < 100; i++) {
            arr[i] = new ArrayList<>();
        }
    }

    public void put(int key, int value) {
        int id = key % 10;
        List<Pair> l = arr[id];
        boolean flag = true;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i).key == key) {
                l.get(i).setValue(value);
                flag = false;
            }
        }
        if(flag) {
            l.add(new Pair(key, value));
        }
    }

    public int get(int key) {
        int id = key % 10;
        List<Pair> l = arr[id];

        for(int i = 0; i < l.size(); i++) {
            if(l.get(i).key == key) {
                return l.get(i).value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        int id = key % 10;
        List<Pair> l = arr[id];

        for(int i = 0; i < l.size(); i++) {
            if(l.get(i).key == key) {
                l.remove(l.get(i));
            }
        }
    }

    class Pair {
        int key;
        int value;
        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    }
}
