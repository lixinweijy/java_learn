package d12_this;

public class Student {
    private String name;
    private String schoolName;

    public Student() {
    }
    //如果学生不填写学习，默认这个对象的学校是黑马
    public Student(String name) {
        /**
         * 通过this()去调用本类的其他构造器，本类其他的构造器会通过super去手动调用父类的构造器，最终还是会调用父类构造器的
         * this()super()都只能放在构造器第一行，所以二者不能共存与同一个构造器中
         */
        this(name,"华中农业大学");
    }
    public Student(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
