package cn.xiao.springdemo.iocdi.entity;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Component  //将会被Spring容器创建出对象
public class EntityDemo {

    private String name;
    private EntityDemo brother;
    private List<String> stringList;
    private Map<String, Double> stringDoubleMap;
    private Properties properties;

    public EntityDemo() {
        System.out.println("construct without arguments.");
    }

    public EntityDemo(String name, EntityDemo brother, List<String> stringList) {
        this.name = name;
        this.brother = brother;
        this.stringList = stringList;
        System.out.println("construct: " + this.name + "," + this.brother + "," + stringList);
    }

    public EntityDemo(String name, EntityDemo brother, List<String> stringList, Map<String, Double> stringDoubleMap, Properties properties) {
        this.name = name;
        this.brother = brother;
        this.stringList = stringList;
        this.stringDoubleMap = stringDoubleMap;
        this.properties = properties;
        System.out.println("construct :" + this.name + "," + this.brother + ";" + this.stringList + ";" + this.stringDoubleMap + ";" + this.properties);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("name:" + this.name);
    }

    public EntityDemo getBrother() {
        return brother;
    }

    public void setBrother(EntityDemo brother) {
        this.brother = brother;
        System.out.println("brother:" + brother);
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
        System.out.println(this.stringList);
    }

    public Map<String, Double> getStringDoubleMap() {
        return stringDoubleMap;
    }

    public void setStringDoubleMap(Map<String, Double> stringDoubleMap) {
        this.stringDoubleMap = stringDoubleMap;
        System.out.println(stringDoubleMap);
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
        System.out.println(properties);
    }

    @Override
    public String toString() {
        return super.toString() + ":" + this.name;
    }
}
