package d1_set;

import java.util.Objects;

public class Stuednt {
    private String name;
    private int ages;
    private char sex;

    public Stuednt() {
    }

    public Stuednt(String name, int ages, char sex) {
        this.name = name;
        this.ages = ages;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    //需要重写equals和hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stuednt stuednt = (Stuednt) o;
        return ages == stuednt.ages && sex == stuednt.sex && Objects.equals(name, stuednt.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ages, sex);
    }
}
