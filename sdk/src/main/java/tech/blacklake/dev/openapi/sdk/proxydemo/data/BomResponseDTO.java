package tech.blacklake.dev.openapi.sdk.proxydemo.data;

/**
 * @author cuiyichen
 * @date 2022/05/16 13:30:27
 */
public class BomResponseDTO {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "BomResponseDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
