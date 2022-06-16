
public class MaxHeap {
    private int[] heap;
    private int size;
    private int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[this.maxSize];
    }

    /**
     *
     * @param pos
     * @return position of parent
     */
    private int parent(int pos) {
        return (int) Math.floor((pos - 1)/2);
    }

    /**
     *
     * @param pos
     * @return position of the left child
     */
    private int leftChild(int pos) {
        return (2*pos) + 1;
    }

    /**
     *
     * @param pos
     * @return position of the right child
     */
    private int rightChild(int pos) {
        return (2*pos) + 2;
    }

    /**
     *
     * @param pos
     * @return true of given node is leaf
     */
    private boolean isLeaf(int pos) {
        return pos > (size / 2) && pos <= size;
    }

    private void swap(int fPos, int sPos) {
        int tmp;
        tmp = heap[fPos];
        heap[fPos] = heap[sPos];
        heap[sPos] = tmp;
    }

    /**
     * Recursive method to max heapfy given subtree
     * @param pos
     */
    private void maxHeapify(int pos) {
        if (isLeaf(pos)) {
            return;
        }
        if (heap[pos] < heap[leftChild(pos)] || heap[pos] < heap[rightChild(pos)]) {
            if (heap[leftChild(pos)] > heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            } else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }

    /**
     * Inserts a new element to max heap
     * @param element
     */
    public void insert(int element) {
        heap[size] = element;

        // Traverse up and fix violated property
        int current = size;
        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }

    /**
     * To display heap
     */
    public void print() {
        for (int i = 0; i < size/2; i++) {
            System.out.println("Parent node: " + heap[i]);
            if (leftChild(i) < size) {
                System.out.println(" Left child node: " + heap[leftChild(i)]);
            }
            if (rightChild(i) < size) {
                System.out.println(" Right child node: " + heap[rightChild(i)]);
                System.out.println();
            }
        }
    }

    /**
     * Remove an element from max heap
     * @return the element from max heap
     */
    public int extractMax() {
        int popped = heap[0];
        heap[0] = heap[--size];
        maxHeapify(0);
        return popped;
    }

    public static void main(String[] args) {
        System.out.println("The max heap is ");
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
        maxHeap.print();
        System.out.println("The max value is " + maxHeap.extractMax());
    }
}
