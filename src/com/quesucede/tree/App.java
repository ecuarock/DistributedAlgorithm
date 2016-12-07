/*
 * Copyright (C) 2007-2014 by Brett Alistair Kromkamp <brett@perfectlearn.com>.
 */

package com.quesucede.tree;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {

        Tree tree = new Tree();

        /*
         * The second parameter for the addNode method is the identifier
         * for the node's parent. In the case of the root node, either
         * null is provided or no second parameter is provided.
         */
        tree.addNode("0");
        tree.addNode("1", "0");
        tree.addNode("2", "0");
        tree.addNode("3", "1");
        tree.addNode("4", "1");
        tree.addNode("5", "2");
        tree.addNode("6", "2");

        tree.display("0");
        
    }
}