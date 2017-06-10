package ketvirtaPaskaita;

import java.util.Comparator;

/**
 * Created by Lina on 2017.06.09.
 */
public class Cat implements Comparable<Cat>{
    private String name;
    private int age;
    private String kind;

    public Cat(String name, int age, String kind) {
       // konstruktorius su parametrais sukuriamas del to kad neis sukurti kitaip objekto
        // this reikalingas jei per parametrus paduodam tuos pacius kintamuosius kokie yra sukurti auksciau klaseje
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // set nustato kintamojo reiksmes
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", kind=" + kind +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        if (name != null ? !name.equals(cat.name) : cat.name != null) return false;
        return kind != null ? kind.equals(cat.kind) : cat.kind == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Cat o) {

        return name.compareTo(o.getName());
    }
}


