# Quarter-Top-Songs

## Description
The purpose of this lab is to generate a soundtrack list of last quarter's top songs for a music record company. The report must include each week's top 200 songs in the U.S for one fiscal quarter, in ascending order.

## Instruction
The way we obtain this report is as follows:

First, we created a class called `VipClient` that would read each weekly top songs file and store it into 12 different sorted queue linked data structures. Within the `VipClient` class, we created a class called `LinkQueue`. The constructor of `LinkQueue` would read each file at a time and store it into a queue. The `LinkQueue` class extends the `Link` class which in turn extends the `LinkedList` class.

Second, we wrote the `LinkedList` class which is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. Then we wrote the `Link` class that represents the queue linked list: a Queue data structure, we maintain two pointers, `front` and `rear`. The `front` points the first item of queue and `rear` points to the last item. Each file will have a separate queue.

Finally, we wrote a method called `merge` that would merge all the queues into one queue, and we print the data into a text file named "VipList.Txt".

