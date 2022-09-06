package com.keshen.autumnplugin;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.SimpleToolWindowPanel;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @author momo
 * @since 2022/9/5 23:34
 */
public class AutumnAbilityBar extends SimpleToolWindowPanel {

    private Project project;

    private JTree abilityTree;

    public AutumnAbilityBar(Project project) {
        super(false, true);
        this.project = project;

        DefaultMutableTreeNode child1Leaf1 = new DefaultMutableTreeNode();
        child1Leaf1.setUserObject("child1Leaf1");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode();
        child1.add(child1Leaf1);
        child1.setUserObject("child1");
        this.abilityTree = new JTree(child1);
        this.abilityTree.setName("abilityTree");

        setContent(this.abilityTree);
    }
}
