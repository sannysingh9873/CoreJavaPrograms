package com.india;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapTest2 {

    public static void main(String[] args) {

        List<String> list1= new ArrayList<>();

        list1.add("chennai");
        list1.add("hyd");
        list1.add("chennai");
        list1.add("patna");
        list1.add("Bangalore");
        list1.add("patna");

        HashSet<String> hs = new HashSet<>();
        List<String> nonDuplicateList = list1.stream().filter(p -> {
            return hs.add(p);
        }).collect(Collectors.toList());


        String str= "i am very good boy i worked on good IT company i live in bangalore";
        String[] strarray=str.split(" ");
        Map<String, Long> stringLongMap = Arrays.stream(strarray).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(stringLongMap);

        ArrayList<departmemnt> deList= new ArrayList<>();
        deList.add(new departmemnt(101,"sanny","blr",1000));
        deList.add(new departmemnt(102,"kumar","mas",1000));
        deList.add(new departmemnt(103,"singh","blr",5000));
        deList.add(new departmemnt(104,"roshan","mas",7000));
        deList.add(new departmemnt(105,"shalu","pat",2000));

        Map<String, Long> addressWiseSalary = deList.stream().collect(Collectors.groupingBy
                (departmemnt::getAddress, Collectors.summingLong(departmemnt::getSalary)));

        System.out.println(addressWiseSalary);

    }


}
class departmemnt
{
    int did;
    String dname;
    String address;
    long salary;

    public departmemnt(int did, String dname, String address, long salary) {
        this.did = did;
        this.dname = dname;
        this.address = address;
        this.salary = salary;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
