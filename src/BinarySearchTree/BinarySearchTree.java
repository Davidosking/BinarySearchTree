package BinarySearchTree;

import Nodes.BinaryNode;

/**
 *
 * @author David Jennings This class implements a binary search tree.
 */
public class BinarySearchTree {

    private BinaryNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(Comparable val) {
        if (root == null) {
            root = new BinaryNode(val);
            return;
        }

        insert(root, val);
    }

    private void insert(BinaryNode root, Comparable val) {

        if (root.getData().equals(val)) {
            System.out.println("Duplicate value. Nothing inserted into the BST.");
            return;
        }
        if (val.compareTo(root.getData()) < 0) {
            if (root.getLeftChild() == null) {
                root.setLeftChild(new BinaryNode(val));
                return;
            } else {
                insert(root.getLeftChild(), val);
            }

        } else if (val.compareTo(root.getData()) > 0) {
            if (root.getRightChild() == null) {
                root.setRightChild(new BinaryNode(val));
                return;
            } else {
                insert(root.getRightChild(), val);
            }
        }
        return;
    }

    public void delete(Comparable val) {

        delete(root, val);

    }

//    private BinaryNode delete(BinaryNode root, Comparable val) {
//        if (root == null) {
//            System.out.println("The tree is empty. There is nothing to delete.");
//            return null;
//        }
//        if (val.equals(root.getData())) {
//            if (root.getLeftChild() == null && root.getRightChild() == null) {
//                return null;
//            }
//            if (root.getLeftChild() == null) {
//                return root.getRightChild();
//            }
//            if (root.getRightChild() == null) {
//                return root.getLeftChild();
//            }
//            BinaryNode temp = smallestNode(root.getRightChild());
//            System.out.println();
//            System.out.println(temp.getData());
//            System.out.println();
//            if (temp.getData().compareTo(root.getRightChild().getData()) < 0) {
//                root.setData(temp.getData());
//                root.setRightChild(delete(root.getRightChild(), temp.getData()));
//                return root;
//            } else {
//                root.setData(root.getRightChild().getData());
//
//                root.setRightChild(delete(root.getRightChild(), root.getRightChild().getData()));
//                return root;
//            }
//
//        } else if (val.compareTo(root.getData()) < 0) {
//            root.setRightChild(delete(root.getLeftChild(), val));
//
//        } else {
//            root.setRightChild(delete(root.getRightChild(), val));
//        }
//        System.out.println("tt");
//        return root;
//    }
    private BinaryNode delete(BinaryNode root, Comparable val) {
        if (root == null) {
            System.out.println("The tree is empty. There is nothing to delete.");
            return null;
        } else if (val.equals(root.getData())) {
            if (root.getLeftChild() == null && root.getRightChild() == null) {
                return null;
            } else if (root.getLeftChild() == null) {
                return root.getRightChild();
            } else if (root.getRightChild() == null) {
                return root.getLeftChild();
            }
            BinaryNode temp = smallestNode(root.getRightChild());
            System.out.println();
            System.out.println(temp.getData());
            System.out.println("^");
            if (temp.getData().compareTo(root.getRightChild().getData()) < 0) {
                root.setData(temp.getData());
                root.setRightChild(delete(root.getRightChild(), temp.getData()));
                return root;
            } else {
                root.setData(root.getRightChild().getData());

                root.setRightChild(delete(root.getRightChild(), root.getRightChild().getData()));
                return root;
            }

        } else if (val.compareTo(root.getData()) < 0) {
            root.setLeftChild(delete(root.getLeftChild(), val));

        } else {
            root.setRightChild(delete(root.getRightChild(), val));
        }
        System.out.println("tt");
        return root;
    }

    public BinaryNode smallestNode(BinaryNode node) {
        BinaryNode temp = null;
        if (node.getLeftChild() == null && node.getRightChild() == null) {
            temp = node;
        }
        else if (node.getLeftChild() != null) {
            temp = smallestNode(node.getLeftChild());
        }
        else if (node.getRightChild() != null) {
            temp = smallestNode(node.getRightChild());
        }
        if (temp != null) {
            if (temp.getData().compareTo(node.getData()) < 0) {
                return temp;
            }
        }

        return node;
    }

    public void lookUp(Comparable val) {
        lookUp(root, val);

    }

    public boolean lookUp(BinaryNode root, Comparable val) {
        if (root == null) {
            return false;
        }
        if (root.getData().equals(val)) {
            return true;
        }
        if (val.compareTo(root.getData()) < 0) {
            return lookUp(root.getLeftChild(), val);

        } else if (val.compareTo(root.getData()) > 0) {
            return lookUp(root.getRightChild(), val);
        }
        return false;
    }

    public void print(BinaryNode root) {
        if (root == null) {
            return;
        } else {
            System.out.println(root.getData());
        }
        print(root.getLeftChild());
        print(root.getRightChild());
    }

//    public static void main(String[] args) {
//        BinarySearchTree j = new BinarySearchTree();
//        j.insert(13);
//        j.insert(9);
//        j.insert(16);
//        j.insert(5);
//        j.insert(12);
//        j.insert(15);
//        j.insert(19);
//        j.insert(14);
//        j.print(j.root);
//        j.delete(13);
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        j.print(j.root);
//
//    }
}
