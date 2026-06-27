# Working with collection in java

Java Collections Framework Overview

Collections are groups of objects used to store, retrieve, and manipulate aggregate data.
The JCF provides a set of classes and interfaces tailored to different data handling needs.

Types of Collections in Java

- List: An ordered collection allowing duplicates; common implementations are ArrayList and LinkedList.
- Set: An unordered collection that disallows duplicates; common implementations include HashSet and TreeSet.
- Map: An unordered collection of unique key-value pairs; common implementations are HashMap and TreeMap.

Using Lists: ArrayList and LinkedList

- ArrayList uses a dynamic array, offering fast random access but slower insertions/removals in the middle.
- LinkedList uses a doubly linked list, efficient for adding/removing elements but slower for indexed access.

Using Sets: HashSet and TreeSet

- HashSet does not maintain order and allows null values.
- TreeSet maintains sorted order and does not allow null values.

Using Maps: HashMap and TreeMap

- HashMap allows null values and stores data without guaranteed order.
- TreeMap maintains keys in sorted order and also allows null values.
