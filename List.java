package printqueue;
/**
 * Description: Class List definition
 * @author Nomingerel Tserenjav and Muhammed Guroglu
 */
public class List {

    private ListNode firstNode;
    private ListNode lastNode;
    StringBuffer buffer = new StringBuffer();
    private String name; // String like "list" used in printing

    // Default constructor: Construct an empty List with
    // "list" as the name
    public List() {
        this("list");
    }

    // Constructor: Construct an empty List with s as the name
    public List(String s) {
        name = s;
        firstNode = lastNode = null;
    }

    // Insert an Object at the front of the List
    // If List is empty, firstNode and lastNode will refer to
    // the same object. Otherwise, firstNode refers to new node.
    public synchronized void insertAtFront(Object insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode(insertItem);
        } else {
            firstNode = new ListNode(insertItem, firstNode);
        }
    }

    // Insert an Object at the end of the List
    // If List is empty, firstNode and lastNode will refer to
    // the same Object. Otherwise, lastNode's next instance
    // variable refers to new node.
    public synchronized void insertAtBack(Object insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode(insertItem);
        } else {
            lastNode = lastNode.next = new ListNode(insertItem);
        }
    }

    // Remove the first node from the List.
    public synchronized Object removeFromFront() throws EmptyListException {
        Object removeItem = null;
        if (isEmpty()) {
            throw new EmptyListException(name);
        }
        removeItem = firstNode.data; // retrieve the data
        // reset the firstNode and lastNode references
        if (firstNode.equals(lastNode)) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.next;
        }
        return removeItem;
    }

    // Remove the last node from the List.
    public synchronized Object removeFromBack() throws EmptyListException {
        Object removeItem = null;
        if (isEmpty()) {
            throw new EmptyListException(name);
        }
        removeItem = lastNode.data; // retrieve the data
        // reset the firstNode and lastNode references
        if (firstNode.equals(lastNode)) {
            firstNode = lastNode = null;
        } else {
            ListNode current = firstNode;
            while (current.next != lastNode) // not last node
            {
                current = current.next; // move to next node
            }
            lastNode = current;
            current.next = null;
        }
        return removeItem;
    }

    // Return true if the List is empty
    public synchronized boolean isEmpty() {
        return firstNode == null;
    }

    // Output the List contents
    public synchronized String print() {
        if (isEmpty()) {
            System.out.println("Empty " + name);
            return "";
        }

        ListNode current = firstNode;
        while (current != null) {
            buffer.append(current.data.toString() + "  ");
            current = current.next;
        }
        return buffer.toString();
    }
     /**
     * Size of the queue in order to redefine it
     * @return amount
     */
    public int size()
    {
        ListNode current = firstNode;
        int amount = 1;
        while ((current = current.next) != null ) {
        amount++;
    }
        return amount;
    }
}
