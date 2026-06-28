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

## List

Lists in Java

- Lists store ordered elements, allow duplicates, and provide access to elements by their position.
- They are mainly classified into ArrayLists and LinkedLists.

ArrayLists

- Use a dynamic array to store elements, automatically resizing as needed.
- Provide fast access to elements by index but are slower for frequent modifications like insertions and deletions.

LinkedLists

- Use a doubly linked list structure where each element links to the next and previous nodes.
- Allow faster insertions and deletions compared to ArrayLists but slower access due to sequential traversal.

Use Cases and Performance

- ArrayLists are ideal for scenarios requiring quick access and stable list sizes, such as shopping or contact lists.
- LinkedLists are better suited for frequent modifications, queue implementations, and undo functionality due to efficient insertions and deletions.

Programming with Lists in Java

- Both ArrayList and LinkedList classes are imported from java.util.
- Common operations include adding elements (add), retrieving elements by index (get), and removing elements (remove).

Choosing Between ArrayList and LinkedList

- Use ArrayList when fast access is needed and the list size changes infrequently.
- Use LinkedList when frequent additions and removals are expected or when implementing data structures like stacks or queues.

HashSets

- HashSet uses a hash table to store unique elements with fast constant time operations (add, remove, contains).
- It allows one null element, does not maintain order, and is useful for storing unique user IDs, tracking inventory items, and removing duplicates.

TreeSets

- TreeSet uses a red-black tree structure to store unique elements in sorted order with logarithmic time operations.
- It does not allow null elements, maintains elements in natural or custom order, and is ideal for sorted data lists, range queries, and leaderboards.

Comparison and Selection Criteria

- HashSet offers faster performance without order, suitable when element order is unimportant.
- TreeSet maintains sorted order but with slower operations, suitable when sorted data is required.
  Both avoid duplicates and are chosen based on whether sorting or speed is the priority in the application.

Queue Definition and Characteristics

- A queue is a collection that follows the first-in-first-out (FIFO) principle, where elements are added at the back (enqueue) and removed from the front (dequeue).
- Queues dynamically grow or shrink and only allow access to the front element, unlike arrays which allow random access.

Queue Use Cases

- Queues are used for task scheduling in operating systems, print spooling, breadth-first search (BFS) in graph algorithms, and real-time data processing such as chat servers or stock trading platforms.
- They help manage tasks or data streams in the order of arrival for efficient processing.

Queue Implementation in Java

- The Java Collections Framework includes a Queue interface, commonly implemented using LinkedList.
- Methods like offer() add elements to the queue, and poll() removes and retrieves the front element.
- A practical example models a customer service line where customers are served in the order they arrive, demonstrating enqueue and dequeue operations in Java code.
