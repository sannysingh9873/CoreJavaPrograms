package com.india;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {

   /*     String a = "125";
        String b = "25";
        System.out.println(a+b);
        a = 487633333333;
        b =   11237750;
*/
/*      List<String> ls= new ArrayList<>();
        ls.add("bangalore");
        ls.add("cts");
        ls.add("tcs");
        ls.add("bangalore");
        Map<String, Long> collect1 = ls.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);*/


        List<department> ls= new ArrayList<>();
        ls.add(new department(101,"depa01","banagalore","iN"));
        ls.add(new department(109,"depa09","chennai","iN"));
        ls.add(new department(101,"depa01","banagalore","iN"));
        ls.add(new department(99,"depa99","delhi","iN"));

        Map<department, List<department>> collect2 = ls.stream().collect(Collectors.groupingBy(Function.identity()));


        Map<Integer, List<department>> collect = ls.stream().collect(Collectors.groupingBy(department::getDid));

        boolean collect1;
        System.out.println(collect);
        System.out.println(collect2);

    }
}

class department{
    int did;
    String name;
    String address;
    String country;

    public department(int did, String name, String address, String country) {
        this.did = did;
        this.name = name;
        this.address = address;
        this.country = country;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "com.india.department{" +
                "did=" + did +
                ", name='" + name + '\'' +
                '}';
    }
}

