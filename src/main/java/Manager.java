import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager {

    private Poster[] items = new Poster[0];
    private int defolt = 10;



    public Manager(Poster[] items) {
        this.items = items;
    }

    public Manager(int defolt) {
        this.defolt = defolt;
    }

    public void add(Poster item) {
        Poster[] tmp = new Poster[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        tmp[tmp.length - 1] = item;
        this.items = tmp;
    }

    public Poster[] findAll() {
        return this.items;
    }

    public Poster[] findLast() {
        int resultLength = Math.min(items.length, defolt);
        Poster[] result = new Poster[resultLength];

        for (int i = 0; i < result.length; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;
    }

}
