//hashmap faster than hashtable

package workshop;

import java.util.HashMap;

public class MapComparison {
    
    class Customer {
        private String name;
        private int age;
        private String address;

        public Customer{(String name, int age, String address)}
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }

        
    }
    
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
        map1.put("C",3);
        map1.put("D",4);
        map1.put("E",5);
        System.out.println(map1.get("A"));

        Map<String,Integer> map1 = new Hashtable<>();
        map1.put("A",1);
        map1.put("B",2);
        map1.put("C",3);
        map1.put("D",4);
        map1.put("E",5);
        System.out.println(map2.get("B"));
        map2.put("G"), new Customer("kenneth, 40,"jurong");

        
        String Name = map3.get("G").getName();
        System.out.println(Name);


        
    }
}