# Data Structures & Algorithms Notes

## Table of Contents
- [Arrays](https://github.com/ZackaryWright/DSA#arrays)
- [Linked Lists](https://github.com/ZackaryWright/DSA#linked-lists)
- [Hash Tables](https://github.com/ZackaryWright/DSA#hash-tables)
- [Queues](https://github.com/ZackaryWright/DSA#queues)
- [Stacks](https://github.com/ZackaryWright/DSA#stacks)

## **Arrays**
- A linear collection of memory locations, which each hold data/values.
- **Static Arrays**: An array that has a fixed amount of memory to store its data. 
- **Dynamic Arrays**: Implementation of array that doubles the amount of allocation of memory that is used to store data within an array in a fashion that allows the array to grow as more data needs to be stored.

### Operations/ Time Complexities

- **Access Value**: O(1)
- **Set Value**: O(1) 
- **Insert Value**:
    - At beginning of array: O(n)
    - At middle of array: O(n)
    - At end of array: O(n) for static arrays, amortized O(1) for dynamic arrays
- **Remove Value**:
    - At beginning of array: O(n)
    - At middle of array: O(n)
    - At end of array: O(1)
- **Copy Array**: O(n)



## **Linked Lists**
- **Singly Linked List**: A collection of nodes that contain data, where each node contains a pointer to the next node in the list. 
- **Doubly Linked List**: A collection of nodes that contain data, where each node contains a pointer to both the previous and next node in the list.

### Operations/ Time Complexities

#### **Singly Linked List**
- **Access Head Node**: O(1)
- **Access Middle Node**: O(n) 
- **Access Tail Node**: O(n)
- **Insert Node**:
    - Insert Head Node: O(1)
    - Insert Node in Middle(Non-head/Non-tail node): O(1) in addition to O(n) access time
    - Insert Tail Node: O(1) in addition to O(n) access time
- **Remove Node**:
    - Remove Head Node: O(1)
    - Remove Node in Middle(Non-head/Non-tail node): O(1) in addition to O(n) access time
    - Remove Tail Node: O(1) in addition to O(n) access time
- **Search for Node**: O(n)


#### **Doubly Linked List**
- **Access Head Node**: O(1)
- **Access Middle Node**: O(n) 
- **Access Tail Node**: O(1)
- **Insert Node**:
    - Insert Head Node: O(1)
    - Insert Node in Middle(Non-head/Non-tail node): O(1) in addition to O(n) access time
    - Insert Tail Node: O(1)
- **Remove Node**:
    - Remove Head Node: O(1)
    - Remove Node in Middle(Non-head/Non-tail node): O(1) in addition to O(n) access time
    - Remove Tail Node: O(1)
- **Search for Node**: O(n)



## **Hash Tables**
- Data structure that stores key/value pairs using a dynamically sized array of linked lists.
- Hash Tables use hash functions to properly store these values and minimize collisions when storing them.
- **Collision**: The case of two keys being mapped within table to the same index of the array used to implement a hash table.

### Operations/ Time Complexities

- **Access/Lookup Key**: O(1) average case, O(n) worst case
- **Insert Key/Value**: O(1) average case, O(n) worst case
- **Remove Key/Value**: O(1) average case, O(n) worst case 

#### **NOTE**: 
O(n) worst case -> when a lot of collisions are present in such a way that a linkedlist within an index of the array fro hash table must be traversed through completely.


## **Queues**
- Linear data structure that stores(**enqueue**) and removes(**dequeue**) values in a **FIFO**, or **F**irst **I**n **F**irst **O**ut order.
- The first value added to a queue is the first value to be removed. Conversely, the last value added to a queue will be the last value to be removed.

### Operations/ Time Complexities

- **Enqueue Value**: O(1)
- **Dequeue Value**: O(1)
- **Search for Value**: O(n)
- **Peek at Value in Front of Queue**: O(1)


## **Stacks**
- Linear data structure that stores(**push**) and removes(**pop**) values in a **LIFO**, or **L**ast **I**n **F**irst **O**ut order.
- The last value added to a queue is the first value to be removed. Conversely, the first value added to a queue will be the last value to be removed.

### Operations/ Time Complexities

- **Push Value to Top of Stack**: O(1)
- **Pop Value from Top of Stack**: O(1)
- **Search for Value**: O(n)
- **Peek at Value on Top of Stack**: O(1)

