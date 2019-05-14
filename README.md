# Java Core Review

## Difference between ArrayList and HashSet in Java
### Inheritance
### Implementation:
Implementation : ArrayList implements List interface while HashSet implements Set interface in Java.
### Internal implementation:
ArrayList is backed by an Array while HashSet is backed by an HashMap.
### Duplicates :
ArrayList allows duplicate values while HashSet doesn’t allow duplicates values.
### Constructor :
ArrayList have three constructor which are ArrayList(), ArrayList(int capacity) ArrayList(int Collection c) while HashSet have four constructor which are HashSet(), HashSet(int capacity), HashSet(Collection c) and HashSet(int capacity, float loadFactor)
### Ordering :
ArrayList maintains the order of the object in which they are inserted while HashSet is an unordered collection and doesn’t maintain any order.
### Indexing :
ArrayList is index based we can retrieve object by calling get(index) method or remove objects by calling remove(index) method while HashSet is completely object based. HashSet also does not provide get() method.
### Null Object:
ArrayList not apply any restriction, we can add any number of null value while HashSet allow one null value.
### Syntax:
ArrayList:-
ArrayList list=new ArrayList();
HashSet:-

HashSet set=new HashSet();

## Set in Java
* Set is an interface which extends Collection. It is an unordered collection of objects in which duplicate values cannot be stored.
* Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted representation).
* Set has various methods to add, remove clear, size, etc to enhance the usage of this interface