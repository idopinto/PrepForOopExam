package ExamPreperation;

import java.lang.Math;
import java.util.*;
import java.util.function.*;

/**
 * Solution to the example question posted on Moodle.
 *
 * @author Erel Debel
 */
public class ExampleQuestion {
	public static void main(String[] args) {
		new BinaryTree<Integer>(new BinaryTree.Node<>(1)).setMetric(BinaryTree.IntDataMetric.getInstance());
	}
}

class BinaryTree<T> {
	public static class Node<S> {
		private final S data;

		private Node<S> leftChild, rightChild, parent;

		public Node(S data) {
			this.data = data;
		}

		public Node<S> getLeftChild() {
			return leftChild;
		}

		public Node<S> getRightChild() {
			return rightChild;
		}

		public void setLeftChild(Node<S> newChild) {
			leftChild = newChild;
		}

		public void setRightChild(Node<S> newChild) {
			rightChild = newChild;
		}

		public Node<S> getParent() {
			return parent;
		}

		public void setParent(Node<S> newParent) {
			parent = newParent;
		}

		public S getData() {
			return data;
		}
	}

	private final List<Node<T>> nodesByInsertion = new ArrayList<>();
	private final Set<Node<T>> allNodes = new HashSet<>();
	private BiFunction<Node<T>, Node<T>, Integer> metric = new PathMetric();

	public BinaryTree(Node<T> root) {
		nodesByInsertion.add(root);
		allNodes.add(root);
	}

	public Node<T> getNodeByIndex(int index) {
		if (index < nodesByInsertion.size() && index >= 0)
			return nodesByInsertion.get(index);
		return null;
	}

	public void addRightChild(int index, Node<T> node) {
		if (index >= nodesByInsertion.size() || index < 0)
			return;
		if (allNodes.contains(node) || nodesByInsertion.get(index).getRightChild() == null)
			return;
		nodesByInsertion.get(index).setRightChild(node);
		nodesByInsertion.add(node);
		allNodes.add(node);
		node.setParent(nodesByInsertion.get(index));
	}

	public void addLeftChild(int index, Node<T> node) {
		if (index >= nodesByInsertion.size() || index < 0)
			return;
		if (allNodes.contains(node) || nodesByInsertion.get(index).getLeftChild() == null)
			return;
		nodesByInsertion.get(index).setLeftChild(node);
		nodesByInsertion.add(node);
		allNodes.add(node);
		node.setParent(nodesByInsertion.get(index));
	}

	public int getDistance(int nodeIndex1, int nodeIndex2) {
		return metric.apply(getNodeByIndex(nodeIndex1), getNodeByIndex(nodeIndex2));
	}

	public void setMetric(BiFunction<Node<T>, Node<T>, Integer> metric) {
		this.metric = metric;
	}

	private int[] getLCADistances(Node<T> node1, Node<T> node2) {
		Set<Node<T>> ancestors = new HashSet<>();
		int distance1 = 0, distance2 = 0;

		Node<T> current = node1;
		do {
			ancestors.add(current);
			current = current.getParent();
		}
		while (current != null);

		current = node2;
		while (!ancestors.contains(current)) {
			ancestors.add(current);
			current = current.getParent();
			++distance2;
		}

		Node<T> lca = current;
		current = node1;

		while (current != lca) {
			ancestors.add(current);
			current = current.getParent();
			++distance1;
		}
		return new int[]{distance1, distance2};
	}

	public class LCAMetric implements BiFunction<Node<T>, Node<T>, Integer> {
		public Integer apply(Node<T> node1, Node<T> node2) {
			int[] distances = getLCADistances(node1, node2);
			return Math.min(distances[0], distances[1]);
		}
	}

	public class PathMetric implements BiFunction<Node<T>, Node<T>, Integer> {
		public Integer apply(Node<T> node1, Node<T> node2) {
			int[] distances = getLCADistances(node1, node2);
			return distances[0] + distances[1];
		}
	}

	public static class IntDataMetric implements BiFunction<Node<Integer>, Node<Integer>, Integer> {
		private static final IntDataMetric instance = new IntDataMetric();

		private IntDataMetric() {
		}

		public static IntDataMetric getInstance() {
			return instance;
		}

		public Integer apply(Node<Integer> node1, Node<Integer> node2) {
			return Math.abs(node1.data - node2.data);
		}
	}
}

	